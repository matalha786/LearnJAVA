package com.myfirstproject;

public class array_Uni_work_2 {
    public static void main(String[] args) {
        int[] arr = {20,40,6,8,10,12,14,16,18,20};
        int sum = 0 ;
        for (int i = 0 ; i<arr.length; i++){

            sum = sum+arr[i];
        }
        System.out.println(" The sum of the elements of Array is : "+sum);
        System.out.println(" The Average of the elements of Array is : "+sum/arr.length);

    }
}
