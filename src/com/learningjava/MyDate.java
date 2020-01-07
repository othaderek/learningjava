package com.learningjava;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int newDay){
        this.day = newDay;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int newMonth){
        this.month = newMonth;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }
    
}
