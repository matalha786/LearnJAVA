package com.myfirstproject;
@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2();
//    void tdgfdfds();
}

class NewPhone extends phone{
    @Override
    public void showTime(){
        System.out.println("Time is 9 PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class cwh_108_java_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}
