package com.dattu.models;

public class LocationStat {
    private String state;
    private  String country;
    private int latestCases;
    private int previousDay;
    private  int dayWiseCount;

    public int getDayWiseCount() {
        return dayWiseCount;
    }

    public void setDayWiseCount(int dayWiseCount) {
        this.dayWiseCount = dayWiseCount;
    }

    public int getPreviousDay() {
        return previousDay;
    }

    public void setPreviousDay(int previousDay) {
        this.previousDay = previousDay;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestCases() {
        return latestCases;
    }

    public void setLatestCases(int latestCases) {
        this.latestCases = latestCases;
    }
}
