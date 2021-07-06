package com.myfirstproject;
import java.util.Scanner;
public class marks21 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int totalMarks[];
        totalMarks = new int[10];
        int studentNumber;
        for(int i=0; i<10; i++){
            studentNumber = i + 1;
            System.out.println("Enter the Marks of Student Number "+studentNumber+" in 3 Subjects and Press Enter After Typing Each Subject Number: : ");
            int total = 0;
            for(int j=0; j<3; j++){
                total = total + sc.nextInt();
                totalMarks[i] = total; } }
        int max = totalMarks[0];
        int index = 0;
        for(int k=0; k<10; k++){
            if(max <totalMarks[k]){
                max = totalMarks[k];
                index = k; } }
        int stdnumber;
        stdnumber = index + 1;
        System.out.println("Student "+stdnumber+" has max marks "+max);


    }


}
