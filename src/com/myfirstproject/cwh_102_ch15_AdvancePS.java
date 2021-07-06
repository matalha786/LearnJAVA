package com.myfirstproject;
import java.sql.Time;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class cwh_102_ch15_AdvancePS {
    public static void main(String[] args) {
        // PS Question 1
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for (String s :ar ) {
            System.out.println(s);
        }
        // PS Question 5
        HashSet<Integer> hs = new HashSet<>();
        hs.add(7);
        hs.add(9);
        hs.add(6);
        hs.add(32);
        hs.add(43);
        hs.add(56);
        hs.add(8);
        hs.add(6);
        System.out.println(hs);
        // PS Question 2
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("H:m:s");
        LocalDateTime ld = LocalDateTime.now();
        String d = ld.format(dt);
        System.out.println(d);
        // PS Question 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND))   ;
        System.out.println(c.getTime())  ;


    }
}
