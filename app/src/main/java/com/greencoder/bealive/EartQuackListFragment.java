package com.greencoder.bealive;

import android.app.Activity;
import android.app.Fragment;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.app.ListFragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
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

import butterknife.Bind;
import butterknife.ButterKnife;


public class EartQuackListFragment extends Fragment implements AdapterView.OnItemClickListener, SwipeRefreshLayout.OnRefreshListener
{

    private static final String SUMMARY_URL="http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson";

    private EarthQuackListListener listener;

    ArrayAdapter<Feature> summaryAdapter;

    @Bind(R.id.swipe_refresh_layout)SwipeRefreshLayout swipeRefresh;

    @Bind(R.id.list_view)ListView listView;

    RequestQueue requestQueue;

    public static final String MY_NETWORK_TAG="belive_net";



    static interface EarthQuackListListener
    {
        public void onItemClick(String detailUrl,double lat,double lon);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        requestQueue = Volley.newRequestQueue(getActivity());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_list_summary,container,false);

        ButterKnife.bind(this,view);

        listView.setOnItemClickListener(this);

        swipeRefresh.setOnRefreshListener(this);

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try
        {
            listener = (EarthQuackListListener) activity;

        } catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        if(isConnected())
        fetchEartQuackSummary();
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

    public void fetchEartQuackSummary()
    {
        StringRequest request=new StringRequest(Request.Method.GET,SUMMARY_URL,

                new Response.Listener<String>()
                {

                    @Override
                    public void onResponse(String response) {

                        EarthQuackSummary summary=new Gson().fromJson(response,EarthQuackSummary.class);

                        getActivity().setTitle(Html.fromHtml("<small>" + summary.getMetadata().getTitle() + "</small>"));

                        Feature[] allEarthQuackData=new Feature[summary.getFeatures().size()];

                        summary.getFeatures().toArray(allEarthQuackData);

                        summaryAdapter=new SummaryAdapter(getActivity(),R.layout.list_row_summary,allEarthQuackData);

                        listView.setAdapter(summaryAdapter);

                        swipeRefresh.setRefreshing(false);
                    }

                },
                new Response.ErrorListener()
                {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        //Toast.makeText(getActivity(), getString(R.string.no_internet), Toast.LENGTH_LONG).show();

                        swipeRefresh.setRefreshing(false);

                    }
                }



        );

        request.setTag(MY_NETWORK_TAG);

        requestQueue.add(request);


    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

        if (null != listener) {

            Feature weatherDeatils=summaryAdapter.getItem((int)id);

            String detailUrl=weatherDeatils.getProperties().getDetail();

            double lat=weatherDeatils.getGeometry().getCoordinates().get(1);

            double lon=weatherDeatils.getGeometry().getCoordinates().get(0);

            listener.onItemClick(detailUrl, lat, lon);
        }

    }

    @Override
    public void onRefresh() {

        fetchEartQuackSummary();

    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {

            if(isConnected())
            fetchEartQuackSummary();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onStop() {
        super.onStop();

        if(requestQueue!=null)
        {
            requestQueue.cancelAll(MY_NETWORK_TAG);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }



}
