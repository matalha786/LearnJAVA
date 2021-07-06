package com.myfirstproject;

import java.util.ArrayDeque;

//import java.util.*;
public class cwh_93_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(4);
        ad1.add(5);
        ad1.add(6);
        ad1.addFirst(56);
        ad1.addLast(567);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
