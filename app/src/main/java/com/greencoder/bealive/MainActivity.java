package com.greencoder.bealive;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.greencoder.bealive.model.EarthQuackSummary;
import com.greencoder.bealive.model.Feature;
import com.greencoder.bealive.model.Properties;

public class MainActivity extends ListActivity {

    private static final String SUMMARY_URL="http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected void onStart() {
        super.onStart();

        fetchEartQuackSummary();


    }

    public void fetchEartQuackSummary()
    {
        StringRequest request=new StringRequest(Request.Method.GET,SUMMARY_URL,

                new Response.Listener<String>()
                {

                    @Override
                    public void onResponse(String response) {

                        EarthQuackSummary summary=new Gson().fromJson(response,EarthQuackSummary.class);

                        Feature[] allEarthQuackData=new Feature[summary.getFeatures().size()];

                        summary.getFeatures().toArray(allEarthQuackData);

                        ArrayAdapter<Feature> summaryAdapter=new SummaryAdapter(MainActivity.this,R.layout.list_item_row,allEarthQuackData);

                        setListAdapter(summaryAdapter);
                    }

                },
                new Response.ErrorListener()
                {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(MainActivity.this,getString(R.string.no_internet),Toast.LENGTH_LONG).show();

                    }
                }



        );

        Volley.newRequestQueue(this).add(request);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        Intent detailIntent=new Intent(this,DetailActivity.class);
        startActivity(detailIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {

            fetchEartQuackSummary();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
