package com.myfirstproject;

import java.util.Scanner;

public class cwh_34_Recursion {
    // 1 Factorial Using Recursion --- A recursive function is one that has the capability to call itself.
    public static int factorial_Recursion(int n){
        if (n == 0|| n== 1)
            return 1;
        else
            return n * factorial_Recursion(n - 1);
        }
    // 2 Factorial Using iterative Approach ---

    public static int factorial_iterative(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }
//  --- 3 Fibonacci Series Using Recursion  --- A recursive function is one that has the capability to call itself.
    public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    public static void main(String[] args) {
       // 1 Factorial Using Recursion ---

        System.out.println(" --- 1 Factorial Using Recursion --- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        System.out.println( "The Factorial is : " + factorial_Recursion(sc.nextInt()));

        // 2 Factorial Using iterative Approach ---

        System.out.println(" --- 2 Factorial Using iterative Approach --- ");
        System.out.print("Enter a Number : ");
        int max = sc.nextInt();
        System.out.println( "The Factorial of " + max + " is : " + factorial_iterative(max));

        //  --- 3 Fibonacci Series Using Recursion  ---

        System.out.println(" --- 3 Fibonacci Series Using Recursion  ---");
        System.out.print("Enter Number of Fibonacci Series : ");
        int maxNumber = sc.nextInt();
        System.out.print("Fibonacci Series of "+ maxNumber +" numbers: ");
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fibonacciRecursion(i) +" ");
        }

    }
}
 /*
            Program Logic:
A recursive function is one that has the capability to call itself.

fibonacciRecursion():

1. The Java Fibonacci recursion function takes an input number. Checks for 0, 1, 2 and returns 0, 1, 1 accordingly because Fibonacci sequence in Java starts with 0, 1, 1.
2, When input n is >=3, The function will call itself recursively. The call is done two times. Let’s see the Fibonacci Series in Java using recursion example for input of 4.

	fibonacciRecursion (4)
	It will recursively call fibonacciRecursion function for values 2 and 3
		fibonacciRecursion (2) \\ call for value 0 and 1
			fibonacciRecursion (0) = 0
			fibonacciRecursion (1) = 1
		fibonacciRecursion (3) \\ It will call for 1 and 2
			fibonacciRecursion (1) = 1
			fibonacciRecursion (2) \\ It will call for 0 and 1
				fibonacciRecursion (0) = 0
				fibonacciRecursion (1) = 1
Now result is added 0+1+1+0+1=3
             */
