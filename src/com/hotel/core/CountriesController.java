package com.hotel.core;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.hotel.activity.R;
import com.hotel.data.Country;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

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
    DefaultHttpClient _client;
    HttpGet _request;
    HttpResponse _response;

    CountriesController() {

    }

    public List<Country> getAllCountries(){
        //System.out(String.valueOf(R.string.all_countries_api));

        _request = new HttpGet(Resources.getSystem().getString(R.string.all_countries_api));
        //Log.d("HttpRequest", R.string.all_countries_api);
        //_response = _client.execute(_request);
        // _response.getParams();

        return _listCountries;
    }
    public Country getCountry(String countryCode){
        return new Country();
    }

    public int makeTest(){

        return 1;
    }
}
