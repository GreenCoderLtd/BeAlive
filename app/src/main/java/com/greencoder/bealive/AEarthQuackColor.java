package com.greencoder.bealive;

import android.graphics.Color;

/**
 * Created by newcomputer on 9/19/15.
 */
public class AEarthQuackColor implements IEarthQuackColor {

    int red=0;
    int green=0;
    int blue=0;

    @Override
    public int getRed() {
        return red;
    }

    @Override
    public int getGreen() {
        return green;
    }

    @Override
    public int getBlue() {
        return blue;
    }

    public int getRGBColor()
    {
        return Color.rgb(red, green, blue);
    }
}
