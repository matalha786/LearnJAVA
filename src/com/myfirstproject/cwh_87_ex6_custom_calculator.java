package com.myfirstproject;
import java.util.Scanner;
class invalidInput extends Exception{
    @Override
    public String toString() {
        return "Invalid Input --- ";
    }
}
class cantdivide0 extends Exception{
    @Override
    public String toString() {
        return "Can not divide by zero ";
    }
}
class maxinput extends Exception{
    @Override
    public String toString() {
        return "The Input values are should be less than 100000 . ";
    }
}
class maxmultiplier extends  Exception{
    @Override
    public String toString() {
        return "For Multiplication Both input values should be less then 7000 ";
    }
}

public class cwh_87_ex6_custom_calculator {
    public static void main(String[] args) throws invalidInput , cantdivide0 ,maxinput ,maxmultiplier {
        System.out.println(" --> Press 1 To addition +  , Press 2 To subtraction -  , Press 3 To Multiplication *  , Press 4 To Division /  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 1st Number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 1st Number : ");
        double num2 = sc.nextDouble();
        if (num1 >100000 || num2 > 100000){
           try {
               throw new maxinput();
           }
           catch (Exception e){
               System.out.println(e.toString());
           }
        }
        if (a == 1){
            if (num1 < 100000 && num2 <100000 ){
            System.out.printf("The answer of %f + %f is : ", num1,num2);
            System.out.println(num1+num2);}}
        else if (a == 2){
            if (num1 < 100000 && num2 <100000 ){
            System.out.printf("The answer of %f - %f is : ", num1,num2);
            System.out.println(num1-num2);}}
        else if (a == 3){
            if (num1 < 100000 && num2 <100000 ){
                if (num1 < 7000 && num2 <7000){
            System.out.printf("The answer of %f * %f is : ", num1,num2);
            System.out.println(num1*num2);
                }
                else try {
                    throw new maxmultiplier();
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
            }
        }
        else if (a == 4){
            if (num2 ==0 ){
                try {
                    throw new cantdivide0();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
           if (num2 != 0){
               if (num1 < 100000 && num2 <100000 ){
            System.out.printf("The answer of %f /  %f  is : ", num1,num2);
            System.out.println(num1/num2);}}}

        else if (a >4 ) {
            try {
            throw new invalidInput();
        }
            catch (Exception e){
                System.out.println(e.toString());
            }


    }
}}
