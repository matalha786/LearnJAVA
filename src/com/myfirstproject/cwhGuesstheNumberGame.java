package com.myfirstproject;

import java.util.Random;
import java.util.Scanner;

class Gamee{
    int randomNumber;
    int userInput;
    int numberOfGuesses = 0;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    public Gamee(){
        Random rn = new Random();
         randomNumber = rn.nextInt(100);
    }
    public void takeUserInput(){
        Scanner scc = new Scanner(System.in);
        userInput = scc.nextInt();
    }
    boolean isCorrectNumber() {
        numberOfGuesses++;
        if (userInput == randomNumber) {
            System.out.println("You Guessed it Correctly");
        }
        if (userInput < randomNumber) {
            System.out.println("You Are Less");
        }
        if (userInput > randomNumber){
            System.out.println("You Are Greater");
    }

        return false;
    }

    }


public class cwhGuesstheNumberGame {
    public static void main(String[] args) {
        System.out.println("Hii");
        Gamee gom = new Gamee();
        while (gom.userInput!=gom.randomNumber){
        System.out.println("Enter a Number From 0 to 100 : ");
        gom.takeUserInput();
       boolean b = gom.isCorrectNumber();
        }
        System.out.println("The Random Number Was : "+gom.randomNumber);
        System.out.println("The Number of Guesses Are : "+ gom.numberOfGuesses);


    }
}