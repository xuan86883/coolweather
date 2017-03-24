package com.example.xuan86883.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xuan86883 on 2017/3/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperture;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
