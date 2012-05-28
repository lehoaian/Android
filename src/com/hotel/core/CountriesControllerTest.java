package com.hotel.core;

import android.util.Log;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: hoaian
 * Date: 5/29/12
 * Time: 12:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class CountriesControllerTest {
    CountriesController _contrl = new CountriesController();

    @org.junit.Test
    public void testGetAllCountries() throws Exception {
        _contrl.getAllCountries();

        Assert.assertEquals(17, 17);
    }

    @org.junit.Test
    public void testGetCountry() throws Exception {

    }

    @org.junit.Test
    public void testMakeTest() throws Exception {
        Assert.assertEquals(17, 17);
    }
}
