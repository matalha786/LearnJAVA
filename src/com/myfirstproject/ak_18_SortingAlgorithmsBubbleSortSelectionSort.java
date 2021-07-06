package com.myfirstproject;

public class ak_18_SortingAlgorithmsBubbleSortSelectionSort {
    public static void main(String[] args) {
//        // Problem 1 ****** Sorting Algorithms Bubble Sort
//        int[] arr = {3,4,6,2,-4,7 , -7,9,-1,};
//        int n = arr.length;
//        for ( int i = 0 ; i <n-1  ; i++ ) {
//            for ( int j = 0 ; j <n-1  ; j++ ) {
//                if (arr[j+1] < arr[j]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for ( int a: arr  ) {
//            System.out.print(a + ", ");
//                }

        // Problem 3  (1.1) Optimized  Way ****** Sorting Algorithms Bubble Sort
//        Change inner loop from j <n2-1  --> j <n2-1-i
//        Added boolean sorted = true;
//        int[] arr2 = {3,4,6,2,-4,7 , -7,9,-1,};
//        int n2 = arr2.length;
//        boolean sorted = true;
//        for ( int i = 0 ; i <n2-1  ; i++ ) {
//            for ( int j = 0 ; j <n2-1-i  ; j++ ) {
//                if (arr2[j+1] < arr2[j]){
//                    int temp = arr2[j+1];
//                    arr2[j+1] = arr2[j];
//                    arr2[j] = temp;
//                    sorted = false;
//                }
//            }
//            if (sorted) break;
//        }
//        for ( int a: arr2  ) {
//            System.out.print(a + ", ");
//                }
        // Problem 3  Sorting Algorithms --> Selection Sort
        int[] arr3 = {3,-1, -4,5,8,-9,5,0,2 ,1,6};
        int n3 = arr3.length;
        for ( int i = 0 ; i <n3-1  ; i++ ) {
                int minIndex = i;
                for ( int j = i ; j <n3  ; j++ ) {
                    if (arr3[j] < arr3[minIndex])
                        minIndex =j;
            }
                int temp3 = arr3[i];
                arr3[i] = arr3[minIndex];
                 arr3[minIndex] = temp3;
        }
        for ( int e :arr3 ) {
            System.out.print(e + ", ");

        }

    }
}




