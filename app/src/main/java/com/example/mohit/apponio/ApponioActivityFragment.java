package com.example.mohit.apponio;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.apponio.entity.Activities;
import com.apponio.entity.ActivityLog;
import com.apponio.entity.Errors;
import com.apponio.entity.JSError;
import com.apponio.service.LogAPI;
import com.apponio.util.CustomAdapter;
import com.apponio.util.CustomAdapterError;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * A placeholder fragment containing a simple view.
 */
public class ApponioActivityFragment extends Fragment {

    private static final String baseURL = "http://172.31.99.39:8080/";
    private List<JSError> errors = new ArrayList<JSError>();
    public ApponioActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apponio, container, false);
        fetchLogs();
        return view;
    }

    private void fetchLogs() {
         Retrofit retrofit = getRetrofit(baseURL);
         LogAPI logAPI = retrofit.create(LogAPI.class);
         Call<Errors> call = logAPI.getErrors();
         call.enqueue(new Callback<Errors>() {
             @Override
             public void onResponse(Response<Errors> response, Retrofit retrofit) {
                 Log.d("Debug information",response.body().getErrors().size()+"");
                  if(response.body().getErrors() !=null) {
                      errors.addAll(response.body().getErrors());
                      updateListView();
                  }
             }
             @Override
             public void onFailure(Throwable t) {
               Log.d("Information", t.getMessage());
             }
         });

    }

    private void updateListView() {
        final ListView logview = (ListView) getView().findViewById(R.id.logView);
        logview.setAdapter(new CustomAdapterError(this.getContext(),errors));
        logview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), BackActivity.class);
                startActivity(intent);
            }
        });
    }


    public static Retrofit getRetrofit(String baseURL){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
