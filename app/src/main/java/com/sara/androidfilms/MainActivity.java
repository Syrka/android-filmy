package com.sara.androidfilms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sara.androidfilms.adapters.MySimpleAdapter;
import com.sara.androidfilms.rest.APIRestPetition;
import com.sara.androidfilms.rest.adapters.RestResultsAdapter;
import com.sara.androidfilms.rest.model.Film;
import com.sara.androidfilms.rest.model.Result;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {

    private List<HashMap<String, String>> datos;
    private MySimpleAdapter simpleAdapter;
    private APIRestPetition apiRestPetition;
    private String buttonMenu;
    private String textToSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = new ArrayList<HashMap<String, String>>();

        // Creamos el simple adapter (contexto, datos, layout que representa la fila, array de
        // strings con las claves (FROM), (TO) donde van los datos)
        simpleAdapter = new MySimpleAdapter(
                this, datos, R.layout.row,
                new String[] {"movieTitle", "movieScore", "moviePoster", "movieRelease"},
                new int[]{ R.id.movieTitle, R.id.movieScore, R.id.moviePoster, R.id.movieRelease }
        );

        // Enganchar el ListView con el Adapter
        ((ListView)findViewById(R.id.myList)).setAdapter(simpleAdapter);

        apiRestPetition = RestResultsAdapter.getInstance().create(APIRestPetition.class);

        //Dates
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dNow = new Date();
        String todayDate = df.format(dNow);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dNow);
        calendar.add(Calendar.MONTH, -1);
        Date newDate = calendar.getTime();

        String minusMonthDate = df.format(newDate);

        // Get info from menu
        Bundle extra = getIntent().getExtras();
        if (extra == null) return;
        // Reading extra
        buttonMenu = extra.getString("button");

        Map<String, String> optMap = new HashMap<String, String>();
        switch (buttonMenu) {
            case "btn_nowPlaying":
                // en cartelera ahora; desde hace un mes hasta hoy
                optMap.put("primary_release_date.gte", minusMonthDate);
                optMap.put("primary_release_date.lte", todayDate);
                MoviesList(optMap);
                break;
            case "btn_popular":
                // the most popular
                optMap.put("sort_by", "popularity.desc");
                MoviesList(optMap);
                break;
            case "btn_topRated":
                // if boton de ordenar top rated
                optMap.put("vote_count.gte", "500");
                optMap.put("sort_by", "vote_average.desc");
                MoviesList(optMap);
                break;
            case "btn_comingSoon":
                //proximamente
                optMap.put("primary_release_date.gte", todayDate);
                optMap.put("sort_by", "primary_release_date.asc");
                MoviesList(optMap);
                break;
            case "btn_search":
                //busqueda
                textToSearch = extra.getString("searchText");
                MoviesSearch(textToSearch);
                break;
        }

        ListView myList = (ListView)findViewById(R.id.myList);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap<String, String> moviePosition = (HashMap<String, String>) parent.getItemAtPosition(position);

                // Data to Detail
                Intent i = new Intent(getApplicationContext(), DetailActivity.class);
                i.putExtra("movieId", moviePosition.get("movieId"));
                // Go to Detail
                startActivityForResult(i, 1);
            }
        });

    }

    public void MoviesList(Map options) {
        final ProgressDialog pd = ProgressDialog.show(this, "Cargando", "Espera...", false);

        apiRestPetition.resultsListAsync(getString(R.string.apiKey), options, new Callback<Film>() {
            @Override
            public void success(Film films, Response response) {
                pd.dismiss();
                drawData(films);
                simpleAdapter.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {
            }
        });
    }

    public void MoviesSearch(final String query) {
        final ProgressDialog pd = ProgressDialog.show(this, "Cargando", "Espera...", false);

        apiRestPetition.resultsSearchAsync(getString(R.string.apiKey), query, new Callback<Film>() {
            @Override
            public void success(Film films, Response response) {
                pd.dismiss();
                if(films.getTotalResults() != 0) {
                    drawData(films);
                    simpleAdapter.notifyDataSetChanged();
                }
                else {
                    Intent i = new Intent(getApplicationContext(), NoResultsActivity.class);
                    i.putExtra("queryString", query);
                    startActivityForResult(i, 1);
                }
            }

            @Override
            public void failure(RetrofitError error) {
            }
        });
    }

    public void drawData(Film films) {
        String year = "0000";
        for (Result res: films.getResults()) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("movieId", res.getId().toString());
            hm.put("movieTitle", res.getTitle());
            hm.put("movieScore", res.getVoteAverage().toString());
            hm.put("moviePoster", getString(R.string.urlPrefix) + res.getPosterPath());
            year = res.getReleaseDate();
            if (year.length() != 0 && year.length() >= 4) {
                year = year.substring(0, 4);
            }
            else {
                year = "0000";
            }
            hm.put("movieRelease", year);
            datos.add(hm);
        }
    }

}
