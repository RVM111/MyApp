package com.example.myapp;

public class Weather {
    String temperature;
    String day;
    String date;

    public Weather(String temperature, String day, String date) {
        this.temperature = temperature;
        this.day = day;
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
