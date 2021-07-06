package com.myfirstproject;
class a{
    public void meth2(){
        System.out.println("Hi   I am a method 2 of class a "); }
        public void meth2(int a){
        System.out.println("Hi   I am a method 2 of class a  taking an argument");
    }
}
class b extends a{
        @Override
    public void meth2(){
        System.out.println("I am a method 2 of class b ");}
    public void meth2(int a){
        System.out.println("I am a method 2 of class b taking argument in class b ");}
    public void meth3(){
        System.out.println("I am a method 3 of class b ");
    }
}
public class cwh_48_MethodOverriding {
    public static void main(String[] args) {
        a aa = new a();
//        aa.meth2();
//        aa.meth2(9);

        b bb = new b();
        bb.meth2();
        bb.meth2(6);


    }
}
