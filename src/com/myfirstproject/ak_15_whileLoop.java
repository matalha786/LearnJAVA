package com.myfirstproject;

import java.util.Scanner;

public class ak_15_whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
//           //     Problem 1 ************
////        int temp = n;
//        int sum = 0;
//        while (temp>0) {
//        int lastDigit = temp %10;
//        temp /= 10;
//        sum += lastDigit;
//        }
//        System.out.print("\n The sum of digits of " + n + " is : " + sum +"\n");
//
//        //        Problem 2 ************
//            int numberOfDigits = (int) Math.log10(n) + 1;
//        System.out.println("The Number of Digits in " + n + " is : " + numberOfDigits);

//        //        Problem 3 ************
//        int temp2 = n;
//        int reversedNumber = 0;
//        while (temp2>0){
//            int lastDigit2 = temp2 % 10;
//            reversedNumber = reversedNumber *10 + lastDigit2;
//            temp2 /= 10;
//        }
//        if ( reversedNumber == n) System.out.println(n + " : is Palindrome ");
//            else  System.out.println(n +" : is NOT Palindrome ");

//                //        Problem 4  ************
//do {
//    System.out.print(" n is : " + n);
//} while (n != 0);

            //        Problem 5  ************
do {
    System.out.print(" n is : " + n );
    System.out.println("  Enter Value of n");
    n = sc.nextInt();
} while (n != 0);


    }
}
