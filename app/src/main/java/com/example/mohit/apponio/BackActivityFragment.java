package com.example.mohit.apponio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import retrofit.Response;
import retrofit.Retrofit;

/**
 * A placeholder fragment containing a simple view.
 */
public class BackActivityFragment extends Fragment {

    private static final String baseURL = "http://172.31.99.39:8080/";
    private List<ActivityLog> activityLogs = new ArrayList<>();
    public BackActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_back, container, false);
        fetchLogs();
        return view;
    }

    private void fetchLogs() {
        Retrofit retrofit = ApponioActivityFragment.getRetrofit(baseURL);
        LogAPI logAPI = retrofit.create(LogAPI.class);
        Call<Activities> call = logAPI.getActivities();
        call.enqueue(new Callback<Activities>() {
            @Override
            public void onResponse(Response<Activities> response, Retrofit retrofit) {
                Log.d("Debug information",response.body().getActivityLogs().size()+"");
                if(response.body().getActivityLogs() !=null) {
                    activityLogs.addAll(response.body().getActivityLogs());
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
        final ListView logview = (ListView) getView().findViewById(R.id.logView1);
        logview.setAdapter(new CustomAdapter(this.getContext(),activityLogs));
    }
}
