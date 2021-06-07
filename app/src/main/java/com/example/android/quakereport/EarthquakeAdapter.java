package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public  EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes){
        super(context, 0 , earthquakes);
    }
    @Override

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView=convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }
        Earthquake currentEarqueake = getItem(position);
        TextView magnitudView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudView.setText(currentEarqueake.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        magnitudView.setText(currentEarqueake.getLocation());

        TextView dateView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudView.setText(currentEarqueake.getDate());

        return listItemView;
    }
}
