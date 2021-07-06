package com.myfirstproject;

//import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class cwh_100_javaTimeAPI {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);
    }
}
