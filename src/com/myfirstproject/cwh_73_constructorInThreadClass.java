package com.myfirstproject;
class myThr extends Thread{
     public myThr(String name){
         super(name);
    }

    public void run(){
        System.out.println("Thank You...");
//         int i = 1;
//         while (i<4000) {
//             System.out.println("I am Thread ");
//             i++;
//         }
         }
}
class mt1 implements Runnable{
    public mt1(String name , Runnable r) {

    }
    @Override
    public void run() {
    }
}

public class cwh_73_constructorInThreadClass {
    public static void main(String[] args) {

        myThr t1 = new myThr("tal");
        myThr mt = new myThr("tal"  );
        Thread n = new Thread(mt);
        System.out.println(n.getId());

        myThr t2 = new myThr("ahmed");
        t1.start();
        t2.start();

        System.out.println("The id of Thread is : " + t1.getId());
        System.out.println("The id of Thread is : " + t1.getName());
        System.out.println("The id of Thread is : " + t2.getId());
        System.out.println("The id of Thread is : " + t2.getName());

    }
}
