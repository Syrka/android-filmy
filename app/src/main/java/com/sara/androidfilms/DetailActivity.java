package com.sara.androidfilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.sara.androidfilms.rest.APIRestPetition;
import com.sara.androidfilms.rest.adapters.RestResultsAdapter;
import com.sara.androidfilms.rest.model.Cast;
import com.sara.androidfilms.rest.model.Credits;
import com.sara.androidfilms.rest.model.Crew;
import com.sara.androidfilms.rest.model.FilmDetail;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private APIRestPetition apiRestPetition;
    private APIRestPetition apiRestPetitionCredits;
    private String movieId;

    //Graphic Elements
    private TextView movieTitle;
    private ImageView moviePoster;
    private TextView movieScore;
    private TextView movieVotes;
    private TextView movieOriginalTitle;
    private TextView movieRelease;
    private TextView movieRuntime;
    private TextView movieOverview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get extras from intent
        Bundle extra = getIntent().getExtras();
        if (extra == null) return;
        // Reading extra
        movieId = extra.getString("movieId");

        //datos = new ArrayList<HashMap<String, String>>();
        apiRestPetition = RestResultsAdapter.getInstance().create(APIRestPetition.class);
        MovieDetail();


        apiRestPetitionCredits = RestResultsAdapter.getInstance().create(APIRestPetition.class);
        MovieDetailCredits();

        // Graphic elements
        movieTitle = (TextView) findViewById(R.id.movieTitle);
        moviePoster = (ImageView) findViewById(R.id.moviePoster);
        movieScore = (TextView) findViewById(R.id.movieScore);
        movieVotes = (TextView) findViewById(R.id.movieVotes);
        movieOriginalTitle = (TextView) findViewById(R.id.movieOriginalTitle);
        movieRelease = (TextView) findViewById(R.id.movieRelease);
        movieRuntime = (TextView) findViewById(R.id.movieRuntime);
        movieOverview = (TextView) findViewById(R.id.movieOverview);

    }

    public void MovieDetail() {
        apiRestPetition.resultDetailAsync(movieId, getString(R.string.apiKey), new Callback<FilmDetail>() {
            @Override
            public void success(FilmDetail details, Response response) {

                movieTitle.setText(checkIfNull(details.getTitle()));
                movieScore.setText(details.getVoteAverage().toString());
                movieVotes.setText(details.getVoteCount().toString());
                movieOriginalTitle.setText(details.getOriginalTitle());
                movieRelease.setText(details.getReleaseDate());
                if (details.getRuntime() != null) {
                    movieRuntime.setText(details.getRuntime().toString() + " mins");
                }
                if (details.getOverview() != null) {
                    movieOverview.setText(details.getOverview());
                }

                if (details.getPosterPath() != null) {
                    Picasso.with(getApplicationContext())
                            .load(getString(R.string.urlPrefix) + details.getPosterPath())
                            .into(moviePoster);
                }
                else {
                    moviePoster.setImageResource(R.drawable.notphoto);
                }
            }

            @Override
            public void failure(RetrofitError error) {
            }
        });
    }

    public void MovieDetailCredits() {
        apiRestPetitionCredits.detailCreditsAsync(movieId, getString(R.string.apiKey), new Callback<Credits>() {
            @Override
            public void success(Credits credits, Response response) {

                List<Cast> castsList = credits.getCast();
                Integer castNum = credits.getCast().size();
                Integer castToPrint = 5;

                List<Crew> crewList = credits.getCrew();
                Integer crewNum = credits.getCrew().size();

                List<ImageView> listImageViews = initializeImageViews();
                List<TextView> listNameViews = initializeNameViews();
                List<TextView> listRoleViews = initializeRoleViews();

                if (crewNum != 0) {
                    Crew director = crewList.get(0);

                    for (int i = 0; i < crewNum; i++) {
                        if (crewList.get(i).getJob().equals("Director")) {
                            director = crewList.get(i);
                            break;
                        }
                    }

                    if (director.getProfilePath() != null) {
                        Picasso.with(DetailActivity.this)
                                .load(getString(R.string.urlPrefix) + director.getProfilePath())
                                        //.resize(75, 60)
                                .into(listImageViews.get(0));
                    }
                    else {
                        listImageViews.get(0).setImageResource(R.drawable.notphoto);
                    }

                    listNameViews.get(0).setText(director.getName());
                    listRoleViews.get(0).setText(director.getJob());
                }

                if (castNum < 5) {
                    castToPrint = castNum;
                }

                for (int i = 0; i < castToPrint; i++) {
                    Cast cast = castsList.get(i);

                    if (cast.getProfilePath() != null) {
                        Picasso.with(DetailActivity.this)
                                .load(getString(R.string.urlPrefix) + cast.getProfilePath())
                                        //.resize(75, 60)
                                .into(listImageViews.get(i + 1));
                    }
                    else {
                        listImageViews.get(i + 1).setImageResource(R.drawable.notphoto);
                    }

                    listNameViews.get(i + 1).setText(cast.getName());
                    listRoleViews.get(i + 1).setText(cast.getCharacter());
                }
            }

            @Override
            public void failure(RetrofitError error) { }

        });
    }

    public List<ImageView> initializeImageViews() {
        List<ImageView> listImageViews = new ArrayList<>();

        listImageViews.add((ImageView) findViewById(R.id.creditImage0));
        listImageViews.add((ImageView) findViewById(R.id.creditImage1));
        listImageViews.add((ImageView) findViewById(R.id.creditImage2));
        listImageViews.add((ImageView) findViewById(R.id.creditImage3));
        listImageViews.add((ImageView) findViewById(R.id.creditImage4));
        listImageViews.add((ImageView) findViewById(R.id.creditImage5));

        return listImageViews;
    }

    public List<TextView> initializeNameViews() {
        List<TextView> listNameViews = new ArrayList<>();

        listNameViews.add((TextView) findViewById(R.id.creditName0));
        listNameViews.add((TextView) findViewById(R.id.creditName1));
        listNameViews.add((TextView) findViewById(R.id.creditName2));
        listNameViews.add((TextView) findViewById(R.id.creditName3));
        listNameViews.add((TextView) findViewById(R.id.creditName4));
        listNameViews.add((TextView) findViewById(R.id.creditName5));

        return listNameViews;
    }

    public List<TextView> initializeRoleViews() {
        List<TextView> listRoleViews = new ArrayList<>();

        listRoleViews.add((TextView) findViewById(R.id.creditRole0));
        listRoleViews.add((TextView) findViewById(R.id.creditRole1));
        listRoleViews.add((TextView) findViewById(R.id.creditRole2));
        listRoleViews.add((TextView) findViewById(R.id.creditRole3));
        listRoleViews.add((TextView) findViewById(R.id.creditRole4));
        listRoleViews.add((TextView) findViewById(R.id.creditRole5));

        return listRoleViews;
    }

    public String checkIfNull (String textToCheck) {
        if (textToCheck != null) {
            return textToCheck;
        }
        else {
            return "";
        }
    }
}
