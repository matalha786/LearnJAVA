package com.myfirstproject;
import java.lang.*;
import java.math.*;
import java.util.Scanner;

public class marks2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
   System.out.println("Enter 1st Student Number in MATH:");
       int s1s1 = sc.nextInt() ;
       System.out.println("Enter 1st Student Number in URDU :");
       int s1s2 = sc.nextInt() ;
       System.out.println("Enter 1st Student Number in ENGLISH :");
       int s1s3 = sc.nextInt();
   System.out.println("Enter 2nd Student Number in MATH:");
       int s2s1 = sc.nextInt() ;
       System.out.println("Enter 2nd Student Number in URDU :");
       int s2s2 = sc.nextInt() ;
       System.out.println("Enter 2nd Student Number in ENGLISH :");
       int s2s3 = sc.nextInt();
   System.out.println("Enter 3rd Student Number in MATH:");
       int s3s1 = sc.nextInt() ;
       System.out.println("Enter 3rd Student Number in URDU :");
       int s3s2 = sc.nextInt() ;
       System.out.println("Enter 3rd Student Number in ENGLISH :");
       int s3s3 = sc.nextInt();
   System.out.println("Enter 4th Student Number in MATH:");
       int s4s1 = sc.nextInt() ;
       System.out.println("Enter 4th Student Number in URDU :");
       int s4s2 = sc.nextInt() ;
       System.out.println("Enter 4th Student Number in ENGLISH :");
       int s4s3 = sc.nextInt();
   System.out.println("Enter 5th Student Number in MATH:");
       int s5s1 = sc.nextInt() ;
       System.out.println("Enter 5th Student Number in URDU :");
       int s5s2 = sc.nextInt() ;
       System.out.println("Enter 5th Student Number in ENGLISH :");
       int s5s3 = sc.nextInt();
   System.out.println("Enter 6th Student Number in MATH:");
       int s6s1 = sc.nextInt() ;
       System.out.println("Enter 6th Student Number in URDU :");
       int s6s2 = sc.nextInt() ;
       System.out.println("Enter 6th Student Number in ENGLISH :");
       int s6s3 = sc.nextInt();
   System.out.println("Enter 7th Student Number in MATH:");
       int s7s1 = sc.nextInt() ;
       System.out.println("Enter 7th Student Number in URDU :");
       int s7s2 = sc.nextInt() ;
       System.out.println("Enter 7th Student Number in ENGLISH :");
       int s7s3 = sc.nextInt();
   System.out.println("Enter 8th Student Number in MATH:");
       int s8s1 = sc.nextInt() ;
       System.out.println("Enter 8th Student Number in URDU :");
       int s8s2 = sc.nextInt() ;
       System.out.println("Enter 8th Student Number in ENGLISH :");
       int s8s3 = sc.nextInt();
   System.out.println("Enter 9th Student Number in MATH:");
       int s9s1 = sc.nextInt() ;
       System.out.println("Enter 9th Student Number in URDU :");
       int s9s2 = sc.nextInt() ;
       System.out.println("Enter 9th Student Number in ENGLISH :");
       int s9s3 = sc.nextInt();
       System.out.println("Enter 10th Student Number in MATH:");
       int s10s1 = sc.nextInt() ;
       System.out.println("Enter 10th Student Number in URDU :");
       int s10s2 = sc.nextInt() ;
       System.out.println("Enter 10th Student Number in ENGLISH :");
       int s10s3 = sc.nextInt();

//
//       for (int i =1; i<=10; i++) {
//           System.out.println("Enter Numbers of Students:");
//           int marks = sc.nextInt();
//           System.out.println(marks);
//       }


   int rslt1 = s1s1+s1s2+s1s3;
   int rslt2 = s2s1+s2s2+s2s3;
   int rslt3 = s3s1+s3s2+s3s3;
   int rslt4 = s4s1+s4s2+s4s3;
   int rslt5 = s5s1+s5s2+s5s3;
   int rslt6 = s6s1+s6s2+s6s3;
   int rslt7 = s7s1+s7s2+s7s3;
   int rslt8 = s8s1+s8s2+s8s3;
   int rslt9 = s9s1+s9s2+s9s3;
   int rslt10 = s10s1+s10s2+s10s3;
   System.out.println("The Highest Marks of a Student is :");
System.out.println(Math.max(rslt1, Math.max(rslt2, Math.max(rslt3, Math.max(rslt4, Math.max(rslt5, Math.max(rslt6, Math.max(rslt7, Math.max(rslt8, Math.max(rslt9, rslt10))))))))));

    }
}
