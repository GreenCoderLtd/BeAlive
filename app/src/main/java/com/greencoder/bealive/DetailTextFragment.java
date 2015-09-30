package com.greencoder.bealive;

import android.app.Fragment;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.greencoder.bealive.model.EarthQuackSummary;
import com.greencoder.bealive.model.Feature;
import com.greencoder.bealive.model.detail.EarthQuackDetail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailTextFragment extends Fragment {

    public static final String DETAIL_URL="detailUrl";
    private String detailUrl;

    RequestQueue requestQueue;

    @Bind(R.id.text_magnitude)TextView magnitudeTextView;
    @Bind(R.id.text_location) TextView locationTextView;
    @Bind(R.id.text_date) TextView dateTextView;
    @Bind(R.id.text_time) TextView timeTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestQueue = Volley.newRequestQueue(getActivity());
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

        if(isConnected())
        fetchEartQuackDetail();
    }

    public Boolean isConnected()
    {

        ConnectivityManager cn = (ConnectivityManager) getActivity().getSystemService(getActivity().CONNECTIVITY_SERVICE);

        NetworkInfo nf = cn.getActiveNetworkInfo();

        if (nf != null && nf.isConnected() == true)
        {
            return true;
        }
        else
        {
            Toast.makeText(getActivity(), "No internet connection!",Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public String convertMinToTimeZone(String minText)
    {

        char timeSign = minText.charAt(0);

        minText=minText.substring(1,minText.length());

        int min=Integer.parseInt(minText);

        int hour = min / 60 ;

        min = min % 60;

        String formattedTime = String.format("%02d%02d", hour,min);

        String timeZone = "GMT"+timeSign +""+formattedTime;

        return timeZone;

    }

    public void bindDataToView(EarthQuackDetail earthQuackDetail)
    {
        double magnitude=earthQuackDetail.getProperties().getMag();

        long timeInMillis=earthQuackDetail.getProperties().getTime();

        String minTimeZone= earthQuackDetail.getProperties().getTz()+"";

        double depth = earthQuackDetail.getGeometry().getCoordinates().get(2);

        String location = earthQuackDetail.getProperties().getPlace();

        IEarthQuackColor earthQuackColor = EarthQuackColorFactory.getColor(magnitude);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

        Calendar calender=Calendar.getInstance();

        //String timeZone=convertMinToTimeZone(minTimeZone);

        //Calendar calendar=new GregorianCalendar(TimeZone.getTimeZone(timeZone));

        //calendar.setTimeZone(TimeZone.getTimeZone(timeZone));

        calender.setTimeInMillis(timeInMillis);

        //String before = timeFormat.format(calendar.getTime());

        //Log.i("Time Zone Before", calendar.getTimeZone().getDisplayName() +" "+ before);

        //calendar.setTimeZone(TimeZone.getDefault());

        //Log.i("Time Zone after", calendar.getTimeZone().getDisplayName());

        String date = dateFormat.format(calender.getTime());

        String time = timeFormat.format(calender.getTime());

        magnitudeTextView.setText(magnitude + "");

        magnitudeTextView.setTextColor(earthQuackColor.getRGBColor());

        locationTextView.setText(location + "\n(Depth " + depth + " kilometers)");

        dateTextView.setText(date);

        timeTextView.setText(time);
    }

    public void fetchEartQuackDetail()
    {

        StringRequest request=new StringRequest(Request.Method.GET,detailUrl,

                new Response.Listener<String>()
                {

                    @Override
                    public void onResponse(String response) {

                        EarthQuackDetail earthQuackDetail = new Gson().fromJson(response, EarthQuackDetail.class);


                        bindDataToView(earthQuackDetail);

                    }

                },
                new Response.ErrorListener()
                {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        //Toast.makeText(getActivity(), getString(R.string.no_internet), Toast.LENGTH_LONG).show();



                    }
                }



        );

        request.setTag(EartQuackListFragment.MY_NETWORK_TAG);

        Volley.newRequestQueue(getActivity()).add(request);
    }

    @Override
    public void onStop() {
        super.onStop();

        if(requestQueue!=null)
        {
            requestQueue.cancelAll(EartQuackListFragment.MY_NETWORK_TAG);
        }
    }

    public void setDetailUrl(String detailUrl) {

        this.detailUrl = detailUrl;
    }
}
