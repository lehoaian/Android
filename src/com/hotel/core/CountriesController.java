package com.hotel.core;

import com.hotel.data.Country;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hoaian
 * Date: 5/28/12
 * Time: 11:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountriesController {
    List<Country> _listCountries;

    public List<Country> getAllCountries(){

        return _listCountries;
    }
    public Country getCountry(String countryCode){
        return new Country();
    }
}
