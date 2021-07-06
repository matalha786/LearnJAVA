package com.myfirstproject;
class base1 {
    base1() {
        System.out.println("i am a 1st simple constructor of parent or Super Class"); }
    base1(int x) {
        System.out.println("i am a overloaded constructor that takes x value : "+ x); }}
    class derived1 extends base1 {
        derived1() {
//            super(7);
            System.out.println("i am a 2nd constructor of derived_1 class"); }
        derived1(int x, int y){
            super(x);
            System.out.println("i am a overloaded constructor that takes y value : "+ y + "\n" +x); }}

class childofderived extends derived1 {
    childofderived() {
        System.out.println("I am a child most class constructor with no arguments");
    }
    childofderived(int x, int y, int z) {
            super(x, y);
            System.out.println("I am an overloaded constructor of Derived with value of z as: " + z); }}


public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args){
//base1 b = new base1();
//base1 b1 = new base1(4);
//derived1 d = new derived1();
//derived1 d1 = new derived1(8,9);
    childofderived cd = new childofderived();
    childofderived cde = new childofderived(34,54,66);
    }}
