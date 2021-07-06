package com.myfirstproject;

import java.util.Scanner;

class democ {
    static void meth1() {
        System.out.print("Input a Number : ");
        Scanner sce = new Scanner(System.in);
        System.out.println("The Input Number was : " +sce.nextInt());
}
 void meth2() {
        System.out.print(" \n Input a Number : ");
        Scanner sce = new Scanner(System.in);
        System.out.println("The Input Number was : " +sce.nextInt());
}
}
class cl1{
    int x = 5;
    protected int y = 11;
    void methd1(){
        System.out.println("I am Cl1 Class Method Default methd1");
        System.out.println(x);
        System.out.println(y);
    }
    protected void methd2(){
        System.out.println("I am Cl1 Class Method Protected methd1");
    }
}
class cl2 extends cl1{
    void m(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class cwh_67_ps12_c12 {
    public static void main(String[] args) {
//        Poblem 1  -->
        democ.meth1();
//        democ.meth2(); --> Throws an error

    democ dc =new democ();
    dc.meth2();

//  Problem 2
        cl1 cl = new cl1();
        cl.methd1();
        cl.methd2();
        cl2 c = new cl2();
        c.methd1();
        c.methd2();
        System.out.println(c.x);
        System.out.println(c.y);


    }
}
