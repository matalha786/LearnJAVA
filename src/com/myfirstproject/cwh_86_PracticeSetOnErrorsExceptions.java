package com.myfirstproject;

import java.util.Scanner;
class maxRetrieve extends Exception{
    @Override
    public String getMessage() {
        return  "ERROR Custom Exception ";
    }
}

public class cwh_86_PracticeSetOnErrorsExceptions {
    public static String maxfunc(int i) throws maxRetrieve {
      if (i>=5) {
                throw new maxRetrieve();
             }
        return "Good";
    }
    public static void main(String[] args) {
//        Problem 2 .........
        try {
            int a = 77/0;
        }
        catch (ArithmeticException e){
            System.out.println("Haha  ");
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe   ");
        }
//        Problem 3 & 4 .........
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        int [] marks = new int[5];
        marks[0] =33;
        marks[1] =42;
        marks[2] =51;
        marks[3] =62;
        marks[4] =76;
        while (flag && i<=3){
           try {
               System.out.print("Enter index Value or number : ");
               index = sc.nextInt();
               System.out.println("THe value of marks[index]  is =  " + marks[index]);
                 break;
           }
           catch (Exception e){
               System.out.println("Invalid index");
               i++;

           }

        }
//        try {
//            if (i>=5) throw  new  maxRetrieve();
//        }
//        catch (maxRetrieve e){
//            System.out.println(e.getMessage());
//        }
        try {
            System.out.println("Enter a index value ");
            maxfunc(sc.nextInt());
        }
        catch (maxRetrieve e) {
            System.out.println(e.getMessage());        }
    }
}
