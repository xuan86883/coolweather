package com.example.xuan86883.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by xuan86883 on 2017/3/21.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String adress,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request= new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }

}
