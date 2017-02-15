package com.example.cmmdyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 夏夜晚凤 on 2017/2/14.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
