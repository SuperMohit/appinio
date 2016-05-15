package com.apponio.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.apponio.entity.ActivityLog;
import com.apponio.entity.JSError;
import com.example.mohit.apponio.R;

import java.util.List;

/**
 * Created by mohit on 5/15/16.
 */

public class CustomAdapterError extends BaseAdapter {
    private static List<JSError> errorList;

    private LayoutInflater mInflater;

    public CustomAdapterError(Context context, List<JSError> jsErrors) {
        errorList = jsErrors;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return errorList.size();
    }

    public Object getItem(int position) {
        return errorList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.row_view, null);
            holder = new ViewHolder();
            holder.errortype = (TextView) convertView.findViewById(R.id.jevent);
            holder.priority = (TextView) convertView.findViewById(R.id.comment);
            holder.errordetails = (TextView) convertView.findViewById(R.id.browser);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.errortype.setText(errorList.get(position).getErrortype());
        holder.priority.setText(errorList.get(position).getPriority()+"");
        holder.errordetails.setText(errorList.get(position).getErrordetails());

        return convertView;
    }

    static class ViewHolder {
        TextView errortype;
        TextView priority;
        TextView errordetails;
    }
}