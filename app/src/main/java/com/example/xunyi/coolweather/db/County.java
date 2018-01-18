package com.example.xunyi.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xunyi on 2018/1/18.
 */

public class County extends DataSupport {  /* 县 */
    private int id;

    private String countyName; /* 县的名字 */

    private String weatherId; /* 县对应的天气id */

    private int cityId;  /* 县所属的市 */

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountryName(String countyName){
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
