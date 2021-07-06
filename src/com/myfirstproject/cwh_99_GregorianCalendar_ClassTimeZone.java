package com.myfirstproject;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_99_GregorianCalendar_ClassTimeZone {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.SECOND);
        System.out.println(Calendar.HOUR);
        System.out.println(Calendar.HOUR_OF_DAY + " : "+ c.get(Calendar.MINUTE) +" : " + c.get(Calendar.SECOND) );
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println();

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.getTime());
        System.out.println(g.isLeapYear(2000));
        System.out.println(g.isLeapYear(2021));
        System.out.println(g.isWeekDateSupported());
        System.out.println();
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[5]);
        System.out.println(TimeZone.getAvailableIDs()[7]);
        System.out.println(TimeZone.getAvailableIDs()[9]);
        System.out.println(TimeZone.getAvailableIDs()[11]);
    }
}
