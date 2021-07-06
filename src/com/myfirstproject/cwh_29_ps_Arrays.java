package com.myfirstproject;

public class cwh_29_ps_Arrays {
    public static void main(String[] args) {

//        int [] arr =  {45,46,98,93,999,20,9};
//       int max =0;
//       for (int e: arr){
//           if (e>max){
//               max = e;             } }
//        System.out.println(max);

//       int [] arr =  {45,46,98,93,999,20020,87};
//       int min = 999999999;
//       for (int e: arr){
//           if (e<min){
//               min = e;
//               }
//               }
//           System.out.println(min);
//    }}
        int [] ar = {2,3,5,6,7,999};
           int mi =Integer.MAX_VALUE;
           for (int el :ar) {
               if (el < mi) {
                   mi=el;

               }
           }
        System.out.println(mi);

    }
}