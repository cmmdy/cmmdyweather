package com.example.cmmdyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 夏夜晚凤 on 2017/2/14.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
