package com.myfirstproject;

class c1{
    int a = 3;
    public int b = 5;
    private int c = 7;
    protected int d = 9;
     void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
 public void meth2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
 private void meth3(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
 protected void meth4(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

public class cwh_66_accessModifiers_in_Packages {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();
        c.meth2();
//        c.meth3();   --> Throws an error
        c.meth4();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.d);
//        System.out.println(c.c);  --> Throws an error

    }

}
