package com.greencoder.bealive;

/**
 * Created by newcomputer on 9/19/15.
 */
public class IEarthQuackMediumColor extends AEarthQuackColor {


    public static final double MIN_RANGE=4.1;
    public static final double MAX_RANGE=6.0;

    public IEarthQuackMediumColor(double magnitude)
    {
        red=0;
        green=150;
        blue=0;

        double oldRange= MAX_RANGE - MIN_RANGE;
        double newMax=255;
        double newMin=200;
        double newRange= newMax-newMin;
        double newValue= ( ((magnitude - MIN_RANGE) * newRange) / oldRange ) + newMin;
        red=(int)newValue;
    }


}
