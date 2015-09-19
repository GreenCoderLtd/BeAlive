package com.greencoder.bealive.unittest;

import android.test.InstrumentationTestCase;

import com.greencoder.bealive.IEarthQuackColor;
import com.greencoder.bealive.EarthQuackColorFactory;

/**
 * Created by newcomputer on 9/19/15.
 */
public class EarthQuackUnitTest extends InstrumentationTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testEarthQuackColor()
    {
        IEarthQuackColor greenColor= EarthQuackColorFactory.getColor(0.0);

        assertEquals(255,greenColor.getGreen());

        IEarthQuackColor greenColor2= EarthQuackColorFactory.getColor(4.0);

        assertEquals(100,greenColor2.getGreen());


        IEarthQuackColor redColor= EarthQuackColorFactory.getColor(6.1);

        assertEquals(200,redColor.getRed());

        IEarthQuackColor redColor2= EarthQuackColorFactory.getColor(9.9);

        assertEquals(255,redColor2.getRed());


        IEarthQuackColor mColor= EarthQuackColorFactory.getColor(4.1);

        assertEquals(200,mColor.getRed());

        IEarthQuackColor mColor2= EarthQuackColorFactory.getColor(6.0);

        assertEquals(255,mColor2.getRed());


    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
