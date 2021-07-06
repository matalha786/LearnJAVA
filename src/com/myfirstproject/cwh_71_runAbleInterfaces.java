package com.myfirstproject;
class myThreadRunnable implements Runnable{




    @Override
    public void run() {
        int i = 1;
        while (i <4000) {
            System.out.println("I am a thread 1 Runnable ///*** ***");
            i++;
        }
    }
}
class myThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while (i<4000) {
            System.out.println("I am a thread 2  and 2nd Runnable 2..... ");
            i++;
        }
    }
}

public class cwh_71_runAbleInterfaces {
    public static void main(String[] args) {
        myThreadRunnable bullet = new myThreadRunnable();
        Thread gun1 = new Thread(bullet);

        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
