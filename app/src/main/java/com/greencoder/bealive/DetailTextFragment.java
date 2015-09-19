package com.greencoder.bealive;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailTextFragment extends Fragment {

    public static final String DETAIL_URL="detailUrl";
    private String detailUrl;
    @Bind(R.id.textView)TextView textView;

    public DetailTextFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_detail_text, container, false);

        ButterKnife.bind(this, view);



        return view;

    }

    @Override
    public void onStart() {
        super.onStart();

        textView.setText(detailUrl);
    }

    public void setDetailUrl(String detailUrl) {

        this.detailUrl = detailUrl;
    }
}
