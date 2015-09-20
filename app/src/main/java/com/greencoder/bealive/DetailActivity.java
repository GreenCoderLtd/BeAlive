package com.greencoder.bealive;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailActivity extends Activity implements OnMapReadyCallback
{

    public static final String LATITUDE="lat";

    public static final String LONGITUDE="lon";

    double lat;

    double lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        ActionBar actionBar=getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        String detailUrl=getIntent().getStringExtra(DetailTextFragment.DETAIL_URL);

        DetailTextFragment textFragment=(DetailTextFragment)getFragmentManager().findFragmentById(R.id.text_frag);

        textFragment.setDetailUrl(detailUrl);

        lat=getIntent().getDoubleExtra(LATITUDE,0);

        lon=getIntent().getDoubleExtra(LONGITUDE,0);

        MapFragment mapFragment = (MapFragment) getFragmentManager() .findFragmentById(R.id.map_frag);
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap map) {

        LatLng position=new LatLng(lat, lon);
        map.addMarker(new MarkerOptions()
                .position(position)
                .title("EarthQuack"));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(position,4));
    }
}
