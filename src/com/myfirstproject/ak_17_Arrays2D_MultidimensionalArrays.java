package com.myfirstproject;
import java.util.Scanner;
public class ak_17_Arrays2D_MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Value of n : ");
//        int n = sc.nextInt();
//        //        Problem 1  ************
//        int a [][] = new int[2][2]; // [Rows]  [Columns]
//        System.out.println(a[0][1]); // [Rows]  [Columns]
//        //        Problem 2  ************
//        int b [][] = {{3,5,7,9},
//                        {2,4,6,8}};
//        System.out.println(b[1][3]);
        System.out.print("Enter  Dimensions : ");
        int rows =sc.nextInt();
//        System.out.print("Enter Columns : ");
        int column = sc.nextInt();
        int arr[][] = new int[rows][column];
        int arr2[][] = new int[rows][column];
        System.out.println("Enter Array arr1 Values : ");
        for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = 0 ; j < column ; j++ ) {
                    arr[i][j ] = sc.nextInt();       }
        }
        System.out.println("Enter Array arr2 Values : ");
                for ( int i = 0 ; i < rows ; i++ ) {
                        for ( int j = 0 ; j < column ; j++ ) {
                            arr2[i][j ] = sc.nextInt();       }
                }
                    int result[][] = new int[rows][column];
                        for ( int i = 0 ; i < rows ; i++ ) {
                            for ( int j = 0 ; j < column ; j++ ) {
                                result[i][j] = arr[i][j] + arr2[i][j];
                            }
                        }
        System.out.println(" Result Array is : ");
                        for ( int i = 0 ; i < rows ; i++ ) {
                                for ( int j = 0 ; j < column ; j++ ) {
                                    System.out.print(result[i][j] + " ");
                                }
                            System.out.println();
                        }




    }
}
