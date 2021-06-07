package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes =QueryUtils.extractEarthquakes();

        //earthquakes.add(new Earthquake("7.2","San Francisco","Feb 2, 2016"));
        //earthquakes.add(new Earthquake("6.1","London","Feb 2, 2016"));
        //earthquakes.add(new Earthquake("3.9","Tokyo","Feb 2, 2016"));
        //earthquakes.add(new Earthquake("5.4","Mexico","Feb 2, 2016"));
        //earthquakes.add(new Earthquake("2.8","Moscow","Feb 2, 2016"));
        //earthquakes.add(new Earthquake("4.9","Rio de janeiro","Feb 2, 2016"));
        //earthquakes.add(new Earthquake("1.6","Paris","Feb 2, 2016"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                //this, android.R.layout.simple_list_item_1, earthquakes);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
