package com.myfirstproject;
import java.util.Scanner;
public class ak_13_PatternsUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
//        Problem 1 *****************
//        for (int i =1; i<=20; i++){
//            for (int j= 1 ; j<=10; j++){
//                System.out.print( " "+j * i ); }
//            System.out.println(); }
//        Problem 2 ************
//        for (int i= 1; i<=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* " );
//            }
//            System.out.println();
//        }
        //        Problem 3 ************
//        for ( int i = 1 ; i <= n ; i++ ) {
//            for ( int j = 1 ; j <= i ; j++ ) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //        Problem 4 ************
//        for (int i =1; i<=n; i++ ){
//                for ( int j=1; j<=i-1; j++ ){
//                System.out.print("  ");  }
//                        for ( int j=1; j<=n-i+1; j++ ) {
//                         System.out.print("* ");       }
//            System.out.println();
//        }
        //        Problem 5 ************

//        for ( int i=1; i<=n; i++ ){
//            for ( int j=1; j<=n-i+1; j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //        Problem 6 ************
        for ( int i=1; i<=n; i++ ) {
           { for ( int j = 1 ; j <= n-i+1; j++ ) {
                System.out.print("  ");
            }
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    }
}


