package com.myfirstproject;
class mynewThr1 extends Thread{
    public void run(){

        while (true) {
            System.out.println("Thank You***");
            try {
                Thread.sleep(59844);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class mynewThr2 extends Thread{
    public void run(){

        while (true) {
            System.out.println("Thank You... Thread 2" );

        }
    }
}
public class cwh_75_threadMethods {
    public static void main(String[] args) {
        mynewThr1 t1 = new mynewThr1();

        mynewThr2 t2 = new mynewThr2();
        t1.start();
//        try {
//            t1.join();
//
////            t1.join(456);
//        }
//        catch (Exception c){
//            System.out.println(c);
//        }
//        t2.start();
    }
}
