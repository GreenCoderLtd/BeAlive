package com.greencoder.bealive;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.greencoder.bealive.model.Feature;
import com.greencoder.bealive.model.Properties;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by newcomputer on 9/18/15.
 */
public class SummaryAdapter extends ArrayAdapter<Feature> {

    LayoutInflater inflater;
    int layout_resource;
    Feature []allEarthQuackData;

    public SummaryAdapter(Context context, int resource, Feature[] objects) {
        super(context, resource, objects);

        inflater = ((Activity)context).getLayoutInflater();

        layout_resource=resource;

        allEarthQuackData=objects;






    }

    static class ViewHolder
    {
        @Bind(R.id.textview_magnitude) TextView magnitudeTextView;
        @Bind(R.id.textview_place)TextView placeTextView;
        @Bind(R.id.view_color) View colorView;

        public ViewHolder(View view)
        {
            ButterKnife.bind(this,view);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView==null)
        {
            convertView=inflater.inflate(layout_resource,parent,false);

            holder=new ViewHolder(convertView);

            convertView.setTag(holder);

        }
        else
        {
            holder= (ViewHolder) convertView.getTag();
        }

        IEarthQuackColor earthQuackColor=EarthQuackColorFactory.getColor(allEarthQuackData[position].getProperties().getMag());

        holder.magnitudeTextView.setText(allEarthQuackData[position].getProperties().getMag()+"");

        holder.placeTextView.setText(allEarthQuackData[position].getProperties().getPlace());

        holder.colorView.setBackgroundColor(earthQuackColor.getRGBColor());

        holder.magnitudeTextView.setTextColor(earthQuackColor.getRGBColor());

        return convertView;
    }
}
