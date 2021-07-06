package com.myfirstproject;

import java.util.Scanner;

public class ak_16_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n i.e Number of Students : ");
        int n = sc.nextInt();
//        //        Problem 1  ************
//        int[] age = {34,4,34,54,35,66,53,36,564,46,674,454,45566,645645,6456,456,56,456,456,4,4};
//        for ( int i=0; i<age.length; i++ ) {
//            System.out.print(age[i] + " , ");
//        }
            //        Problem 2  ************
        int averageMarks = 0;

        int[] marks= new int[n];
            for ( int i = 0; i<marks.length; i++ ){
                System.out.println("Enter Marks : ");
                marks[i]= sc.nextInt();
        }
       for ( int i =0; i<marks.length; i++ ){
           averageMarks += marks[i] ;
       }
        System.out.println("The average of Marks is " + (float)averageMarks/marks.length);
    }
}
