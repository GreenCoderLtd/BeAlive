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

public class MainActivity extends Activity implements EartQuackListFragment.EarthQuackListListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    @Override
    public void onItemClick(String detailUrl,double lat,double lon) {

        Intent detailIntent=new Intent(this,DetailActivity.class);
        detailIntent.putExtra(DetailTextFragment.DETAIL_URL,detailUrl);
        detailIntent.putExtra(DetailActivity.LATITUDE,lat);
        detailIntent.putExtra(DetailActivity.LONGITUDE,lon);
        startActivity(detailIntent);
    }
}
