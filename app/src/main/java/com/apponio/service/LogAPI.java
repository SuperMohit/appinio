package com.apponio.service;

import com.apponio.entity.Activities;
import com.apponio.entity.Errors;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by mohit on 5/15/16.
 */
public interface LogAPI {

    @GET("fetchError")
    Call<Errors> getErrors();
    @GET("fetchActivity")
    Call<Activities> getActivities();

}
