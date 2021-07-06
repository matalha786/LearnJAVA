package com.myfirstproject;
import java.util.Scanner;
public class cwh_25_ps_loops {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int i, facto = 1;
        int num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            facto = facto * i;
        }
        System.out.println(facto);

    }
}