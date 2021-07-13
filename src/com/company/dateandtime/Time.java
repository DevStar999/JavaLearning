package com.company.dateandtime;

public class Time {
    private int hour, minute, second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int s) {
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toNormalTime() {
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12,
                minute, second, (hour < 12) ? "AM" : "PM");
    }
}
