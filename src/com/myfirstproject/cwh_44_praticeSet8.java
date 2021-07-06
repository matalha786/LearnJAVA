package com.myfirstproject;
class sphere{
     private int radius;
    private int height;

    public sphere() {
        this.radius = 4;
        this.height = 3;
    }
    public sphere(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() { return radius; }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return  (4*Math.PI*radius* radius);}

     public double volume(){
        return  ((4.0/3)*Math.PI*radius* radius* radius);
    }
}

public class cwh_44_praticeSet8 {
    public static void main(String[] args) {
        sphere sp = new sphere();
//        sp.setHeight(3);
//        sp.setRadius(4);
        System.out.println(sp.getHeight());
        System.out.println(sp.getRadius());
        System.out.println(sp.volume());
        System.out.println(sp.surfaceArea());
        sphere spe = new sphere(5 , 7);
//        sp.setHeight(3);
//        sp.setRadius(4);
        System.out.println(spe.getHeight());
        System.out.println(spe.getRadius());
        System.out.println(spe.volume());
        System.out.println(spe.surfaceArea());



    }
}
