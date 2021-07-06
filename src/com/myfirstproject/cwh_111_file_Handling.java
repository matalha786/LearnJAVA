package com.myfirstproject;
/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * @author Talha
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file_Handling {
    public static void main(String[] args) {
        // Code to create a new file
        File file = new File("www.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Code to write to a existing file
        try {
            FileWriter fileWriter = new FileWriter("www.txt");
            fileWriter.write("Hello I am talha. \n \n Have a good day.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file1 = new File("www.txt");
        try {

            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
//                or
//                System.out.println(scanner.nextLine());
            }

//            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        Deleting a file
        File f = new File("1.txt");
        if (f.delete()){
            System.out.println("I have deleted "+ f.getName() + " Successfully ");
        }
        else {
            System.out.println("I cant delete file");
        }


    }
}
