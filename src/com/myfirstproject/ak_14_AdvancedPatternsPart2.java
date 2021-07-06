package com.myfirstproject;
import java.util.Scanner;
public class ak_14_AdvancedPatternsPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        //        Problem 1 ************
//        for ( int i=1;i<=n; i++ ){
//            for (int  j=1; j<=n-i+1 ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //        Problem 2 ************
//        for ( int i=1;i<=n; i++){
//            for ( int j =1; j<=n-i+1 ; j++)  {
//                System.out.print("  ");
//            }
//            for ( int j =1; j<=i; j++ )  {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
      //        Problem 2 ************
//        for ( int i=1;i<=n; i++ ){
//            for ( int j=1 ; j<=n-i ; j++){
//                System.out.print("  " );
//            }
//            for ( int j =1; j<=i; j++ ){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
        //        Problem 3 ************
//        int number =1;
//       for ( int i=1; i<=n; i++){
//           for ( int j=1; j<=n-i; j++ ){
//               System.out.print("  ");
//           }
//           for ( int j=1; j<=i ; j++ ){
//               System.out.print(number++ + "  ");
//           }
//           System.out.println();
//        }
        //        Problem 4 ************
//        int rows = 2*n-1;
//        for ( int i=1; i<=rows; i++ ){
//                if (i<=n) {
//                    for ( int j = 1 ; j <= i ; j++ )
//                        System.out.print("* ");
//                }
//                else {
//                    for ( int j=1; j<=rows-i+1;j++ )
//                        System.out.print("* ");
//
//                }
//            System.out.println();
//                }
        //        Problem 5 ************
        System.out.println("*");
        for ( int i=2; i<=n-1; i++ ) {
            System.out.print("* ");
                    for ( int j = 1 ; j <= i - 2 ; j++ ) {
                        System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        if (n>1){
        for ( int i=1; i<=n; i++ ){
            System.out.print("* ");
    }}
    }
    }

