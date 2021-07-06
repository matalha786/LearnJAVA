package com.myfirstproject;

import java.util.Scanner;

public class cwh_82_nested_tryCatch {
    public static void main(String[] args) {
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        while(flag) {
//            System.out.println("Enter the value of index");
//            int ind = sc.nextInt();
//            try {
//                System.out.println("Welcome to video no 82");
//                try {
//                    System.out.println(marks[ind]);
//                    flag = false;
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("Sorry this index does not exist");
//                    System.out.println("Exception in level 2");
//                }
//            } catch (Exception e) {
//                System.out.println("Exception in level 1");
//            }
//        }
//        System.out.println("Thanks for using this program");




        int [] mNumber = new int[77];
        mNumber [0] =1;
        mNumber [1] =10;
        mNumber [2] =11;
        mNumber [3] =21;
        int i=0;
        while (i <mNumber.length){
        System.out.println("Enter Index Number of array");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        try {
            System.out.println(mNumber[a]);
        }
        catch (ArrayIndexOutOfBoundsException w) {
            System.out.println(w);
        }
        i++;}


    }
    }

