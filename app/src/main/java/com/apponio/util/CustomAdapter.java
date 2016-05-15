package com.apponio.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.apponio.entity.ActivityLog;
import com.example.mohit.apponio.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohit on 5/15/16.
 */

public class CustomAdapter extends BaseAdapter {
    private static List<ActivityLog> logs;

    private LayoutInflater mInflater;

    public CustomAdapter(Context context, List<ActivityLog> activityLogs) {
        logs = activityLogs;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return logs.size();
    }

    public Object getItem(int position) {
        return logs.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.row_view, null);
            holder = new ViewHolder();
            holder.jevent = (TextView) convertView.findViewById(R.id.jevent);
            holder.comment = (TextView) convertView.findViewById(R.id.comment);
            holder.browser = (TextView) convertView.findViewById(R.id.browser);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.jevent.setText(logs.get(position).getJevent());
        holder.comment.setText(logs.get(position).getComment());
        holder.browser.setText(logs.get(position).getBrowser());

        return convertView;
    }

    static class ViewHolder {
        TextView jevent;
        TextView comment;
        TextView browser;
    }
}