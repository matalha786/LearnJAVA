package com.myfirstproject;

import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98_Calendar_Class {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getCalendarType());
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println();
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c2.getCalendarType());
        System.out.println(c2.getTimeZone());
        System.out.println(c2.getTimeZone().getID());
        System.out.println(c2.getTime());
    }
}
