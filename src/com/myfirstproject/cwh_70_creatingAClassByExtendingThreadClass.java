package com.myfirstproject;

class myThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000) {
            i++;
            System.out.println("MY THREAD IS Cooking  AND I AM HAPPY");
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000) {
            i++;
            System.out.println("THREAD2 IS Chatting......... AND I AM sad ");

        }
    }
}
public class cwh_70_creatingAClassByExtendingThreadClass {
    public static  void main(String[] args) {
/*     ******** Parameters  vs    Arguments  ********
            void fun(int a , int b) --> PARAMETERS
          fun (5,8)               --> ARGUMENTS ... Arguments are actual

    ******* Concurrency vs Parallelism  ******
 Concurrency --> Working Multiple Works But Actually you are working 1 work at a time
 Parallelism -->  Working Multiple Works But Actually Working Paralleley Multiple Both works
                    at a Time (You have assigned Your Work to another person & He may helping you)
*/
myThread t= new myThread();
myThread2 t2= new myThread2();
    t.start();
    t2.start();
        System.out.println(t2.getId());


    }
}
