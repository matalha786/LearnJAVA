package com.myfirstproject;

import org.w3c.dom.ls.LSOutput;

public class cwh_35_PSonMethods {
    static void pat1(int n ) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat2( int n2 ) {
        for (int i2 = 1; i2 <= n2; i2++) {
            for (int j = n2; j >= i2; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static String pat2_rec_Question_8(int n3 ) {

        if (n3 > 0) {
            pat2_rec_Question_8(n3-1);
            for (int i3 = 0; i3 < n3; i3++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return "";
    }
    static String pat2_rec_Question_7(int n3 ) {

        if (n3 > 0) {
            pat2_rec_Question_7(n3-1);
            for (int i3 = 5; i3 > n3; i3--) {
                System.out.print("*");
            }
            System.out.println();
        }
        return "";
    }
    public static int sum(int ...arr){
        int result = 0;
        for (int a:arr ) 
        {
            result +=a;
        }
        return result/ arr.length;
    }
    static  int ab(int no){
return no;
    }
    //         Problem 7    (0°C × 9/5) + 32 = 32°F
 static double c2f(double a) {
     double b = (a * 9 / 5) + 32;
     return b;
 }
  static int sumn(int a) {
      int sum = 0;
      for (int i = 0; i <= a; i++){
          sum = sum + i;}
      return sum;
  }

    static int naturalNumberSum(int n) {
        int sum = 0;
//executes until the condition becomes false
        for (int i = 0; i <= n; i++)
//adding the value of i to the sum variable
            sum = sum + i;
        return sum;
    }
    public static void main(String[] args) {
//        Problem 2
//        pat1(4);
//        System.out.println("Now In Reverse Order");
//        Problem 4
//        pat2(4);
//        Concept of return
//        System.out.println(ab(7));
//         Problem 6
//        System.out.println(sum(100,200,300));
//         Problem 7
//        System.out.println(pat2_rec_Question_8(4));
        //         Problem 7    (0°C × 9/5) + 32 = 32°F
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Temperature in Celsius : " );
//        double a = sc.nextDouble();
//        System.out.println("Temperature in Frahnhite is :" );
//        System.out.println((a*9/5)+32);
//        System.out.println(c2f(11));
        //         Problem 7
        int a =4;
        System.out.println(sumn(a));
//        int n = 3;
//calling method and prints the sum
//        System.out.println("Sum of Natural Numbers is: "+naturalNumberSum(n));
    }
}
