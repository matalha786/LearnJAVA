package com.myfirstproject;
abstract class parent{
    parent(){
        System.out.println("I am a constructor of parent class ");}
    abstract public void sumup();
}
class child extends parent{
    public void sumup(){
        System.out.println("I am a function of class child");
    }
    public void re(){
        System.out.println("DJ");
    }
}
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class cwh_53_abstract_class {
    public static void main(String[] args) {
//        parent p = new parent() {
//            @Override
//            public void sumup() {
//             }};
//        p.sumup();

//        child c = new child();
//              c.sumup();
        Parent2 p = new Parent2() {
            @Override
            public void greet() { }
            @Override
            public void greet2() {  }     };
        Child3 c3 = new Child3() {
            @Override
            public void greet() { }
            @Override
            public void greet2() { }  };

        Child2 c2 = new Child2() ;
        c2.greet();
        c2.greet2();



    }
    }

