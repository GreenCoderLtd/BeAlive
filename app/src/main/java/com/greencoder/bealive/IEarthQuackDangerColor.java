package com.greencoder.bealive;

/**
 * Created by newcomputer on 9/19/15.
 */
public class IEarthQuackDangerColor extends AEarthQuackColor {


    public static final double MIN_RANGE=6.1;
    public static final double MAX_RANGE=9.9;

    public IEarthQuackDangerColor(double magnitude)
    {
        red=0;
        green=0;
        blue=0;

        double oldRange= MAX_RANGE - MIN_RANGE;
        double newMax=255;
        double newMin=200;
        double newRange= newMax-newMin;
        double newValue= ( ((magnitude - MIN_RANGE) * newRange) / oldRange ) + newMin;
        red=(int)newValue;
    }



}
