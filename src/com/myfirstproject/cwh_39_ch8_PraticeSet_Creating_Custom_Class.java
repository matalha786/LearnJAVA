package com.myfirstproject;
class square {
    int length;
    int width;

    public int area() {
        return length * width;
    }

    public int perimeter1() {
        return 2 * (length + width);
    }
}
class circle {
        int radius;
        public  double area (){
            return (22/7d)*radius;
        }
        public double perimeter(){
            return 2*22/7d*radius;
    }
    }


public class cwh_39_ch8_PraticeSet_Creating_Custom_Class {
    public static void main(String[] args) {
        // Problem ----- 4 ----
        square sq = new square();
        sq.length = 5;
        sq.width = 8;
        System.out.println("Area is : " + sq.area());
        System.out.println("Perimeter is : " + sq.perimeter1());
        // Problem ----- 6 ----
        circle c = new circle();
        c.radius = 4;
        System.out.println("Area is : " + c.area());
        System.out.println("Perimeter is : " + c.perimeter());

    }
}
