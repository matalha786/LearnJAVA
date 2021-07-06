package com.myfirstproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class  gc{
    @Deprecated
    public void meth1(){
        System.out.println("I am method 1 *********");
    }
}
public class cwh_112_psc16 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//
//        gc g = new gc();
//        g.meth1();
        int a =2;
        StringBuilder table = new StringBuilder();

   for (int i =0; i< 10; i++) {
     table.append(a).append("X").append(i + 1).append("=").append(a * (i + 1)).append("\n");
        }
        try {
            FileWriter f = new FileWriter("MultiTab.txt");
            f.write(table.toString());
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
