package com.sara.androidfilms.rest;

import com.sara.androidfilms.rest.model.Credits;
import com.sara.androidfilms.rest.model.Film;
import com.sara.androidfilms.rest.model.FilmDetail;

import java.util.Map;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

public interface APIRestPetition {

    // Thread. Add params with the same name we are going to send in the url ?api_key=XXXX
    @GET("/3/discover/movie")
    public void resultsListAsync(@Query("api_key") String api_key, @QueryMap Map<String, String> options, Callback<Film> cb);

    @GET("/3/search/movie")
    public void resultsSearchAsync(@Query("api_key") String api_key, @Query("query") String query_string, Callback<Film> cb);

    @GET("/3/movie/{id}")
    public void resultDetailAsync(@Path("id") String id, @Query("api_key") String api_key, Callback<FilmDetail> cb);

    @GET("/3/movie/{id}/credits")
    public void detailCreditsAsync(@Path("id") String id, @Query("api_key") String api_key, Callback<Credits> cb);
}
