package com.myfirstproject;
//import java.util.Arrays;
public class array_Uni_work_3 {
    public static void main(String[] args) {
//        int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//        int[] arr2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

//        int [] c = new int[arr1.length];
//       int first = arr1.length;
//       int second = arr2.length;
//       int[] result = new int[first+ second];
//       System.arraycopy(arr1,0,result,0, first);
//       System.arraycopy(arr2,0,result, first, second);
//        System.out.println(Arrays.toString(result));
//        System.out.println("\n");
        // 2nd Method  --> ****************************************************************




        int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr2 = { 3, 5, 7, 9, 11, 13, 15, 17, 19,21};
        int length = arr1.length + arr2.length;
        int[] mergedArray3 = new int[length];
        int temp = 0;
        for (int element : arr1)
        {
            mergedArray3[temp] = element;
            temp++;
        }
        for (int element : arr2)
        {
            mergedArray3[temp] = element;
            temp++;
        }
        System.out.print("{");
        for (int i =0; i<mergedArray3.length; i++){
            System.out.print(mergedArray3[i] +", ");
        }
        System.out.println("}");

    }

}

