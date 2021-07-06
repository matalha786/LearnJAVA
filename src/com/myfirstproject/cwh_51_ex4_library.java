package com.myfirstproject;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

class library{
    String[] aBooks = new String[100];
    String[] issuedBooks = new String[100];
    String rbook;
    String adbook;
    String ibook;

    void addBook(){
        System.out.println("Which book do you want to add : ");
        Scanner sc = new Scanner(System.in);
        adbook = sc.nextLine() ;

    }
    void issueBook(){
        System.out.println("Witch book you want to take : ");
        Scanner sc = new Scanner(System.in);
        ibook = sc.nextLine() ;
        System.out.println("This Book will be issued to you : " + ibook);

    } void returnBook (){
        System.out.println("Which book do you want to return : ");
        Scanner sc = new Scanner(System.in);
         rbook = sc.nextLine() ;
        System.out.printf("You Returned  '%s'  Book.  ",rbook);
    }
    void showAvailableBooks(){
        System.out.println("The Books Available are : ");
        aBooks = new String[]{"Raze-Bismal","Khuda or mhbt", "Dua khan"," mhbt k drd" , "jaz e janm","hinsa or mhbt", "do boll","so sonar ki 1 lohar ki" , "Raze-Ulfat",
         "kum kum","do janha","soo mhbtainy" ,"Jaiz or na jaiz","kum kran" ,"Tum or main","hum tum" ,"Kbi lor kr na ana","dam drud" ,"yariyan","boj-e-mhbt \n"  };
        for (String ele : aBooks ){
            System.out.println(ele);
        }
        if (adbook != null){
            System.out.print(adbook);
        }
    }

}

public class cwh_51_ex4_library {
    public static void main(String[] args) {
        library lb = new library();
        int a = 0;
        while (a<=4) {
            System.out.println(" \n Press 1 to Add a Book  ,Press 2 to issue a Book  ,Press 3 to return  a Book  ,Press 4 to show available a Books & and press 5 to exit and close Program:");
            Scanner sc = new Scanner(System.in);
             a = sc.nextInt();
            if (a == 1) {
                lb.addBook();
            }
            if (a == 2) {
                lb.issueBook();
            }
            if (a == 3) {
                lb.returnBook();
            }
            if (a == 4) {
                lb.showAvailableBooks();
            }
        }


    }
}
