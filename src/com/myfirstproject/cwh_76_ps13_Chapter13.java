package com.myfirstproject;
class practice13 extends Thread{
    public void run(){
        while (true)
        System.out.println("Good Morning*** ");
    }

}
class practice13b extends Thread{
    public void run(){
        int i = 1;
        while (i<4){
            System.out.println("Welcome... ");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    i++;
    }
    }

}
public class cwh_76_ps13_Chapter13 {
    public static void main(String[] args) {
 // ***********   Problem 1 --> *************
        practice13 p1 = new practice13();
        practice13b p2 = new practice13b();

//        p1.start();
        p2.start();
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());

    }
}
