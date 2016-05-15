package com.apponio.service;

import com.apponio.entity.Activities;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by mohit on 5/15/16.
 */
public interface LogAPI {

    @GET("fetch")
    Call<Activities> getPopularMovies();
}
