package com.greencoder.bealive;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        ActionBar actionBar=getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        String detailUrl=getIntent().getStringExtra(DetailTextFragment.DETAIL_URL);

        DetailTextFragment textFragment=(DetailTextFragment)getFragmentManager().findFragmentById(R.id.text_frag);

        textFragment.setDetailUrl(detailUrl);
    }


}
