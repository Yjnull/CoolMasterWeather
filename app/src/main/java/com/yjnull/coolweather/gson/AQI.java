package com.yjnull.coolweather.gson;

/**
 * Created by yangy on 2017/8/29.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
