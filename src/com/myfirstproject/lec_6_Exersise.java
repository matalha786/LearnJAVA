package com.myfirstproject;
import java.util.Scanner;

public class lec_6_Exersise {
    public static void main(String[] args) {
        System.out.println("Enter Math Subject Number: ");
        Scanner s = new Scanner(System.in);
        int math = s.nextInt();
        System.out.println("Enter English subject Number: ");
        int english = s.nextInt();
        System.out.println("Enter Urdu subject Number: ");
        int urdu = s.nextInt();
        System.out.println("Enter Science subject Number: ");
        int science = s.nextInt();
        System.out.println("Enter IST subject Number: ");
        int ist = s.nextInt();
        int sum = math+english+urdu+science+ist;

        System.out.print("The Percentage is = ");
        System.out.println(sum*100/500);

    }
}
