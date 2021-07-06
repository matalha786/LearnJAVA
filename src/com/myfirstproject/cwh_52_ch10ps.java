package com.myfirstproject;
class rectangular{
    int length;
    int width;
    int height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    rectangular(){
 System.out.println("I am a default constructor of rectangular/parent class without perameterized");
}
public rectangular(int h){
    this.height = h;
}
    public rectangular(int l, int w) {
        this.length = l;
        this.width = w;
    }
//    public rectangular(int l, int w , int h) {
//        this.length = l;
//        this.width = w;
//        this.height = h;
//    }
    public void volume(){
    int vol = this.length*this.width*this.height;
    System.out.println(vol);
}
public void area(){
    int ar= length*width;
    System.out.println(ar);
}
}
class cuboid extends rectangular{
    int height;
    cuboid(){
        System.out.println("I am a defualt constructor of cuboid/child class without perameterized");
    }
    cuboid(int h, int w , int l){
        super(l ,w);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public void volume(){

        int v =  width*height*length;
        System.out.println(v);
    }
public void area(){
    int a= 2*length*width+2*length*height+2*height*width;
    System.out.println(a);
}
}
public class cwh_52_ch10ps {
    public static void main(String[] args) {
//        rectangular r = new rectangular(4,7,4);
//        rectangular r = new rectangular(4,7);
//        r.area();
//        r.volume();
        cuboid c = new cuboid(8,9,87);
        c.area();
        c.volume();
//        rectangular rc = new cuboid(5,3,9);
//        rc.volume();
//        rc.area();
    }
}
