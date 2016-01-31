package com.sara.androidfilms.rest.adapters;

import retrofit.RestAdapter;

public class RestResultsAdapter {

    // Singleton patron

    private static RestAdapter restAdapter;

    public static RestAdapter getInstance() {
        if (restAdapter == null)
            restAdapter = new RestAdapter
                    .Builder()
                    .setEndpoint("https://api.themoviedb.org")
                    .build();
        return restAdapter;
    }
}
