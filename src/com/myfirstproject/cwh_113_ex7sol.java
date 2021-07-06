package com.myfirstproject;

import java.util.ArrayList;

class Bok{
    public String name;
    public String author;
    public Bok(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Bok{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary {
    public ArrayList<Bok> books;

    public MyLibrary(ArrayList<Bok> books) {
        this.books = books;
    }

    public void addBook(Bok book ) {
        System.out.println(book+" : This book has been added to the library.");
        this.books.add(book);
    }
    public void returnBook(Bok b) {
        System.out.println("the book has been returned .");
        this.books.add(b);
    }
    public void issueBook(Bok bo , String issuedTo) {
        System.out.println("the book has been issued from the library to : " + issuedTo);
        this.books.remove(bo);
    }
}
public class cwh_113_ex7sol {
    public static void main(String[] args) {
        ArrayList<Bok> bk = new ArrayList<>();
        Bok b1 = new Bok("Algorithms", "CLRS");
        bk.add(b1);
        Bok b2 = new Bok("Algorithms2", "CLRS2");
        bk.add(b2);
        Bok b3 = new Bok("Algorithms3", "CLRS3");
        bk.add(b3);
        Bok b4 = new Bok("Algorithms4", "CLRS4");
        bk.add(b4);
        MyLibrary ml = new MyLibrary(bk);
        ml.addBook(new Bok("John-java" , "Paul kate"));
       ml.addBook(new Bok("algo4", "myAuthor"));
        System.out.println(ml.books);

        ml.issueBook(b2 , "talah");
        System.out.println(ml.books);

    }
}
