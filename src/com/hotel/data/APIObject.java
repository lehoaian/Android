package com.hotel.data;

import android.content.res.Resources;
import com.hotel.R;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: LETHANHH
 * Date: 5/28/12
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class APIObject {
    public static enum API_TYPE{
            ALL_COUNTRIES,
            HOTEL_DETAIL
    }
    String _apiURL;
    API_TYPE _type;
    HttpClient _client;
    HttpGet _request;
    HttpResponse _response;

    private APIObject(){

    }
    public APIObject(API_TYPE type) {
        _type = type;
        switch (type) {
            case ALL_COUNTRIES:{
                _apiURL = String.valueOf(R.string.all_countries_api);
            }
                break;
            case HOTEL_DETAIL: {
                _apiURL = String.valueOf(R.string.hotel_detail_api);
            }
                break;
        }
    }

    public int sendRequest(String[] params){
        _client = (HttpClient) new DefaultHttpClient();
        _request = new HttpGet(_apiURL);
        try {
            _response = _client.execute(_request);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return 1;
    }
}
