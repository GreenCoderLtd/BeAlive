package com.greencoder.bealive;

/**
 * Created by newcomputer on 9/19/15.
 */
public class IEarthQuackMildColor extends AEarthQuackColor {


    public static final double MIN_RANGE=0.0;
    public static final double MAX_RANGE=4.0;

    public IEarthQuackMildColor(double magnitude)
    {
        red=0;
        green=255;
        blue=0;

        double oldRange= MAX_RANGE - MIN_RANGE;
        double newMax=255;
        double newMin=100;
        double newRange= newMax-newMin;
        double newValue= ( ((magnitude - MIN_RANGE) * newRange) / oldRange ) + newMin;
        green=green-(int)(newValue - newMin);
    }


}
