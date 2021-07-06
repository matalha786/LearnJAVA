package com.myfirstproject;
import java.util.Scanner;
import java.util.Random;
public class cwh_20_Rock_sesier_game {
    public static void main(String[] args) {
//        Note If User And Computer Chooses same no output will show
        System.out.print("Chose between 1 to 3 While; 1=Rock 2=Paper, 3=Scissor: ");
        Random rando = new Random();
        Scanner sc = new Scanner(System.in);
       int user = sc.nextInt();
        int computer = 0;
        while (true){
            computer = rando.nextInt(4);
            if(computer !=0) break; }
        System.out.println("Computer Chooses: "+ computer);
        if (user==1 && computer==2)
            System.out.println("Computer Wins");
        if (user==1 && computer==3)
            System.out.println("You Wins");
        if (user==2 && computer==3)
            System.out.println("You Wins");
        if (user==2 && computer==1)
            System.out.println("Computer Wins");
        if (user==3 && computer==1)
            System.out.println("Computer Wins");
        if (user==3 && computer==2)
            System.out.println("You Wins");



    }
}
