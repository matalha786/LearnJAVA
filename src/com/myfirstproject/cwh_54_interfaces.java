package com.myfirstproject;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

interface bicycle{
    int tal = 57;
    Scanner sc = new Scanner(System.in);
    String n = "Input a number and press enter : ";
    int v = sc.nextInt();
    void applyBrake(int decrement);
     void speedUp(int increment);
}
interface bicycle2{
     void horonmainhnna();
     void horonkbikhushikbigum ();
}

class avonCycle implements bicycle , bicycle2{
    int b =87;
   public void applyBrake(int decrement){
       System.out.println("Applying Break : ... " + decrement +" Percent");
   }
   public void speedUp(int increment){
       System.out.println("Speeding Up The BiCycle %d  " + increment+ " %");
   }
    public void horonmainhnna(){
        System.out.println("Main hn na po po po po po");
    }
    public void horonkbikhushikbigum (){
        System.out.println("Kbi Khushi kbi gum pe pe pe pe pe");
   }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        avonCycle av = new avonCycle();
        av.applyBrake(5);
        av.speedUp(7);
        // You can create properties in Interfaces
        System.out.println(av.tal);
        System.out.println(av.b);
        System.out.println(av.n);
        System.out.println(av.v);
        av.horonkbikhushikbigum();
        av.horonmainhnna();

        // You cannot modify the properties in Interfaces as they are final
//         av.a = 454;


    }
}
