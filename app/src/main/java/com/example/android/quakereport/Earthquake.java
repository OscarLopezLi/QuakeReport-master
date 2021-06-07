package com.example.android.quakereport;

public class Earthquake{
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake(String magnitud, String location, String date){
        mMagnitude= magnitud;
        mLocation= location;
        mDate= date;
    }
    public String getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getDate(){
        return mDate;
    }
}
