package com.example.xuan86883.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xuan86883 on 2017/3/24.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public  Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
