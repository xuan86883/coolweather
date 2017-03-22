package com.example.xuan86883.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xuan86883 on 2017/3/21.
 */

public class County extends DataSupport{
    private  int id;
    private String countyName;
    private int countyId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
