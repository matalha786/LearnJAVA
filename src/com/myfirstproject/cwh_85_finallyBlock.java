package com.myfirstproject;

public class cwh_85_finallyBlock {
    public static int add(){
       try {
           int a = 15;
           int b = 3;
           int c = a / b;
           return c;
       }
       catch (Exception e) {
           System.out.println(e);
       }
        finally {
           System.out.println("This is the end of function ");
       }
        return 0;
    }
    public static String loop(){
       try {
           for (int i =0; i<=10 ; i++){
               System.out.println(i);
               if (i==7)
                   break;

           }
           return "";
       }
       catch (Exception e) {
           System.out.println(e);
       }
        finally {
           System.out.println("This is the end of function ");
       }
        return "";

    }

    public static void main(String[] args) {
//        int k =add();
        loop();
        int a =5;
        int b= 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally at value of b is " + b);
            }
            b--;
        }
        try {
            System.out.println("i am just a try ");
        }
        finally {
            System.out.println("I am finally at last of the program ");
        }

    }
}
