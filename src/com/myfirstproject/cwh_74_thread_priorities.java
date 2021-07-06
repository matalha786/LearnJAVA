package com.myfirstproject;
class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }

    public void run(){

                 while (true) {
                     System.out.println("Thank You..." + this.getName());

//                     System.out.println("I am Thread ");

         }
    }
}
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        myThr1 t1 = new myThr1("tal1");
        myThr1 t2 = new myThr1("tal2"  );
        myThr1 t3 = new myThr1("tal3"  );
        myThr1 t4 = new myThr1("tal4"  );
        myThr1 t5 = new myThr1("tal5   ( Most Important )"  );
      t5.setPriority(Thread.MAX_PRIORITY);
      t4.setPriority(Thread.MIN_PRIORITY);
      t3.setPriority(Thread.MIN_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
