package com.myfirstproject;

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString(){

//        return super.toString() + " I am toString() *** ";
        return  " I am toString() *** ";
    }
    @Override
    public String getMessage() {
//        return super.getMessage() + " I am a getMessage() ... ";
        return " I am a getMessage() ... ";
    }
}
public class cwh_83_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a  = sc.nextInt();
        if (a <9){
            try {
//                throw new myException();
                throw new ArithmeticException("This is an ");
            }
            catch (Exception w){
                System.out.println(w.getMessage());
                System.out.println(w);
                System.out.println(w.toString());
                System.out.println(w);
                w.printStackTrace();
            }
        }


    }
}
