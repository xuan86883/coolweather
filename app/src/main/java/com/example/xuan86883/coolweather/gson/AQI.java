package com.example.xuan86883.coolweather.gson;

/**
 * Created by xuan86883 on 2017/3/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
