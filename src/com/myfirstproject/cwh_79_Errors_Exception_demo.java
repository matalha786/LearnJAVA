package com.myfirstproject;

import java.util.Scanner;

public class cwh_79_Errors_Exception_demo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
//           ********         WRONG MANNER --> (LOGICAL ERROR )            ************
//        System.out.println(2);
//        for (int i =1 ; i<5; i++){
//            if ( i % i ==1)
//         ********         TRUE MANNER -->             ************
        int n = 0;
              for (int j =1 ; j<20; j++) {
              for (int k =2 ; k<=j-1; k++) {
                  if ( j % k==0)
                  {
                      n += 1;    // -->  n = n + 1 ;
                  }
              }
                  if (n == 0)
                  {
                      System.out.println(j);
                  }
                  else{
                      n = 0;
                  }
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

    }
}
