package com.myfirstproject;

import java.util.Date;


public class cwh_97_Date_Class {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        Date d2 = new Date(54,6, 31);
        System.out.println(d2);
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
        System.out.println(d.getDay());

    }
}
