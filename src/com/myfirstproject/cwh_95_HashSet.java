package com.myfirstproject;

import java.util.HashSet;

public class cwh_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>(8,0.5f);
        hs1.add(2);
        hs1.add(6);
        hs1.add(8);
        hs1.add(11);
        hs1.add(11);
        System.out.println(hs1);
        System.out.println(hs1.isEmpty());
        System.out.println(hs1.contains(5));
        System.out.println(hs1.contains(6));
    }
}
