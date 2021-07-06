package com.myfirstproject;
abstract class telePhone{
    abstract void ring();
    abstract  void lift();
    abstract  void disconnect();
}
class smartTelePhone extends telePhone {

    @Override
    void ring() {
        System.out.println("Tele Phone is Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lift Up The Tele Phone ....");
    }

    @Override
    void disconnect() {
        System.out.println("Tele Phone is Disconnected ...");
    }
    void incomcall(){
        System.out.println("call is  coming ...");
    }
}
interface TVRemote{
    void chanelchange();
    void  mute();
}
interface smartTVRemote extends TVRemote{
        void chsmartchange ();
}
class tv implements  smartTVRemote{
    @Override
    public void chanelchange() {
        System.out.println("Channel is changing...");
    }

    @Override
    public void mute() {
        System.out.println("Sound has been muted..");
    }


    @Override
    public void chsmartchange() {
        System.out.println("Smartly Changing Channel....");
    }
}
class tv2 implements  TVRemote{
    @Override
    public void chanelchange() {
        System.out.println("Channel is changing...");

    }

    @Override
    public void mute() {
        System.out.println("Sound has been muted..");
    }
    }

public class cwh_60_c11ps11 {
    public static void main(String[] args) {
        // Problem 4 --> Demonstrate a polymorphism
telePhone tp = new smartTelePhone();
tp.disconnect();
tp.lift();
tp.ring();
        System.out.println();
        smartTelePhone spt = new smartTelePhone();
        spt.incomcall();


        System.out.println("\n");
//tp.incomcall(); --> Not Allowed

        // Problem 6 --> inheritance in interfaces

    tv t = new tv();
    t.chanelchange();
    t.chsmartchange();
    t.mute();
        // Problem 7 --> inheritance in interfaces with implements

        tv2 t2 = new tv2();
        System.out.println("\n");
        t2.chanelchange();
        t2.mute();


    }
}
