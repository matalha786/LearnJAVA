package com.myfirstproject;

import java.util.Scanner;

class Library2 {
    String[] books;
    int noOfBooks;

    Library2() {
        this.books = new String[50];
        this.noOfBooks = 0;
    }
    void showAvailableBooks() {
        System.out.println("Available Books Are:  ");
        for (String bok : this.books) {
            if (bok != null)
                System.out.println("* " + bok);
        }
    }
    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + "  Has Been Added To Library... ");
    }
    void issueBook(String bok) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(bok)) {
                System.out.println("\n * "+bok +" . : This book has been issued ...");
                this.books[i] = null;
                return;
            } }
        System.out.println("This book does not exist..." );
    }
    void returnBook(String bo){
        this.books[noOfBooks] = bo;
    }
}
public class cwh_61_ex4sol {
    public static void main(String[] args) {
        Library2 central = new Library2();
        Scanner sc = new Scanner(System.in);
        central.addBook("Tum ho agr");
        central.addBook("Be dared");
        central.addBook("C++ with moray");
        central.addBook("c++");
        central.showAvailableBooks();
        central.issueBook("C++ with moray");
        central.showAvailableBooks();
        central.returnBook("c++");
        central.returnBook("Be dared");
        System.out.println("\n  Enter 1 to show Available Books. & Enter 2 to add book & 3 to issue a book and 4 to return a book : ");
        int a = sc.nextInt();
        if (a == 1){
            central.showAvailableBooks();
        }
        if (a == 2){
            central.addBook("java");
            Scanner s = new Scanner(System.in);
            System.out.println(" Which book do you want to add : ");
            System.out.println(s.nextLine() +"  : Has Been Added To Library..." );
        }
        if (a == 3){
            central.issueBook("fortran");
        }
        if (a == 4){
            central.returnBook("Nova");
        }





    }
    }


