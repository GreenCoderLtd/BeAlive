package com.greencoder.bealive;

/**
 * Created by newcomputer on 9/19/15.
 */
public class EarthQuackColorFactory {

    public static IEarthQuackColor getColor(double magnitude) {
        if (magnitude >= IEarthQuackMildColor.MIN_RANGE && magnitude <= IEarthQuackMildColor.MAX_RANGE) {
            return new IEarthQuackMildColor(magnitude);
        } else if (magnitude >= IEarthQuackMediumColor.MIN_RANGE && magnitude <= IEarthQuackMediumColor.MAX_RANGE) {
            return new IEarthQuackMediumColor(magnitude);

        } else
        {
            return new IEarthQuackDangerColor(magnitude);
        }
    }
}
