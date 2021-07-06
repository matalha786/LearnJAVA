package com.myfirstproject;

public class cwh_96_Date_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // Returns the current time in milliseconds.
                            // The difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC.
        System.out.println(System.currentTimeMillis()/1000/3600); // Number of Minutes   Since January 1, 1970 UTC.
        System.out.println(System.currentTimeMillis()/1000/3600/24); // Number of Days  Since January 1, 1970 UTC.
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // Number of Years  Since January 1, 1970 UTC.
        long l = 999999999999999999l;
        System.out.println(l);
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
    }
}
