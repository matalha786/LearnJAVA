package com.myfirstproject;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_DAteTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.now();  // This is the date
        System.out.println(lt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy --H:m-a = E");  // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;  // This is the format

      String myDate = lt.format(df); // Creating date string using date and format
      String myDate2 = lt.format(df2); // Creating date string using date and format
        System.out.println(myDate);
        System.out.println(myDate2);

    }
}
