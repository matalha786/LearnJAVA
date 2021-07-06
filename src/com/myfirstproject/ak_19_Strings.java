package com.myfirstproject;

public class ak_19_Strings {
    public static void main(String[] args) {
//        Problem 1 ******
        String s = new String("talha");
        String s2 = "talha";
        System.out.println(s == s2);  // This will return boolean false because 1 talha i.e ( using new keyword) is created in heap area while other is created in pool area
        //        Problem 2 ******
        String ss = "talha";
        String ss2 = "talha";
        System.out.println(ss == ss2);  // This will return boolean true because both talha are in pool area
        //        Problem 2 ******
        String name = "Ahmed Talha";
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.substring(3)); // This will print from 3rd index of Array
        System.out.println(name.substring(3 , 8));
        System.out.println(name.contains("a"));
        System.out.println(name.contains("aw"));
        System.out.println(name.contains("Ta"));
        System.out.println(name.equals("ahmed Talha"));
        System.out.println(name.equals("Ahmed Talha"));

//        System.out.println(name.charAt(11)); --> This will throw StringIndexOutOfBoundsException
    }
}
