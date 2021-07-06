package com.myfirstproject;

import java.util.ArrayList;

//import  java.util.*;
public class cwh_91_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(6);
        l2.add(13);
        l2.add(17);
        l2.add(19);
        l2.add(11);

        l1.add(5);
        l1.add(9);
        l1.add(7);
        l1.add(4);
        l1.add(1);
        l1.add(3);
        l1.add(6);
        l1.add(7);
        l1.add(1,3); // Updating array index 1 element -->
        l1.add(1,6); // Updating array index 1 element -->
//        l1.addAll(0, l2);   // adding array from l2 to l1  from index 1 -->
        l1.addAll(l2);   // adding array from l2 to l1 -->
//        l1.clear();   // Removes all of the elements from this list.
//        System.out.println(l1.contains(3));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.indexOf(11));
        System.out.println(l1.lastIndexOf(7));
        l1.remove(0); // Removes the element at the specified position (index) in this list.
//        l1.remove(1); // Removes the element at the specified position (index) in this list.
        l1.set(1 , 764); // Replaces the element at the specified position in this list with the specified element
        l1.iterator();
        System.out.println( l1.isEmpty());
        System.out.println(l1.equals(l2));

         for (int i =0; i < l1.size(); i++) {
//            System.out.println(l1.get(0));
//            System.out.println(l1.get(1));
            System.out.print(l1.get(i) +" , ");
//            System.out.println(l1);
        }

    }
}
