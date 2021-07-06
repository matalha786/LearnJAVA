package com.myfirstproject;
public class array_Uni_work_1 {
    public static void main(String[] args) {
        int[] arr = {151,63,41,99,2,0,1,191,157,271};
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            if (arr[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;  } } }
            if (isPrime){
                if (arr[i] == 0){}
                else {
                    System.out.print(arr[i] + " , ");
                } } }
        System.out.println(" :  Are the prime number in the array ");
    } }