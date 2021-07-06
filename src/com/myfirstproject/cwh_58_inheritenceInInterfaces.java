package com.myfirstproject;
interface sampleInterface{
    void meth1();
    void meth2();
    void meth3();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
    void meth5();
}
class sampleClass implements childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("method 1");
    }
    @Override
    public void meth2() {
        System.out.println("method 2");
            }
    @Override
    public void meth3() {
        System.out.println("method 3");
    }
    @Override
    public void meth4() {
        System.out.println("method 4");
    }
    @Override
    public void meth5() {
        System.out.println("method 5");
    }
}


public class cwh_58_inheritenceInInterfaces {
    public static void main(String[] args) {
        sampleClass sc = new sampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
        sc.meth5();

    }
    }
