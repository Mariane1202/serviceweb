package com.groupeisi.model;

public class DayFinderResponse {
    private String date;
    private String dayOfWeek;


    public DayFinderResponse() {}

    public DayFinderResponse(String date, String dayOfWeek) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
