package com.greencoder.bealive;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.greencoder.bealive.model.EarthQuackSummary;
import com.greencoder.bealive.model.Feature;
import com.greencoder.bealive.model.detail.EarthQuackDetail;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailTextFragment extends Fragment {

    public static final String DETAIL_URL="detailUrl";
    private String detailUrl;

    @Bind(R.id.text_magnitude)TextView magnitudeTextView;
    @Bind(R.id.text_location) TextView locationTextView;
    @Bind(R.id.text_date) TextView dateTextView;
    @Bind(R.id.text_time) TextView timeTextView;

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

        fetchEartQuackDetail();
    }

    public void fetchEartQuackDetail()
    {
        StringRequest request=new StringRequest(Request.Method.GET,detailUrl,

                new Response.Listener<String>()
                {

                    @Override
                    public void onResponse(String response) {

                        EarthQuackDetail earthQuackDetail=new Gson().fromJson(response, EarthQuackDetail.class);

                        double magnitude=earthQuackDetail.getProperties().getMag();

                        long timeInMillis=earthQuackDetail.getProperties().getTime();

                        String timeZone= earthQuackDetail.getProperties().getTz()+"";

                        double depth = earthQuackDetail.getGeometry().getCoordinates().get(2);

                        String location = earthQuackDetail.getProperties().getPlace();

                        IEarthQuackColor earthQuackColor = EarthQuackColorFactory.getColor(magnitude);

                        magnitudeTextView.setText(magnitude+"");
                        magnitudeTextView.setTextColor(earthQuackColor.getRGBColor());

                        locationTextView.setText(location+"\n(Depth "+ depth +" kilometers)");

                        dateTextView.setText(timeInMillis+"");

                        timeTextView.setText(timeZone);

                        //Toast.makeText(getActivity(),magnitude+" "+timeInMillis+" "+timeZone+" "+depth+" "+location,Toast.LENGTH_LONG).show();
                    }

                },
                new Response.ErrorListener()
                {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(getActivity(), getString(R.string.no_internet), Toast.LENGTH_LONG).show();

                    }
                }



        );

        Volley.newRequestQueue(getActivity()).add(request);
    }

    public void setDetailUrl(String detailUrl) {

        this.detailUrl = detailUrl;
    }
}
