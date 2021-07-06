package com.myfirstproject;
import java.util.Random;
import java.util.Scanner;

class game{

    public int number;
    public int inputNumber;
    public int numOfGuesses=0;
   game () {
      Random rand = new Random();
   this.number = rand.nextInt(10);
}
void takeInputUser() {
    System.out.println("Input A Number From 0 to 10 : ");
    Scanner sc = new Scanner(System.in);
      inputNumber= sc.nextInt();

  }
    boolean isCorrectNumber() {
       numOfGuesses++;
      if (inputNumber == number){
          System.out.format("Congrats You Guessed Number Successfully it was %d \n Number of guesses are : %d \n",number,numOfGuesses);
          return true;
      } else if (inputNumber<number) {
          System.out.println("To Low...");
      }else if (inputNumber>number) {
          System.out.println("To Large...");
      }
          return false;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumOfGuesses() {
        return numOfGuesses;
    }

    public void setNumOfGuesses(int numOfGuesses) {
        this.numOfGuesses = numOfGuesses;
    }


}

public class cwh_43_exersize3 {
    public static void main (String[] args) {
       game gm = new game();
       boolean bl = false;
      while (!bl) {
          gm.takeInputUser();
         bl = gm.isCorrectNumber();

      }

    }
}
