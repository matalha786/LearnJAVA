package com.myfirstproject;
import java.util.Scanner;
public class cwh_19_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%4==0 && a%100!=0 || a%400==0){
            System.out.println("its a leap year");
        }
        else {
            System.out.println("This is not a Leap Year");
        }

    }
}
