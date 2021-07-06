package com.myfirstproject;
class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "You cannot provide negative Radius";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }}
public class cwh_84_ThrowvsThrows {
    public static double area(int r) throws negativeRadiusException {
        if (r<0){
            throw new  negativeRadiusException();
        }
        double result = Math.PI * r *r;
        return result;
    }

    public static int divide(int a , int b) throws ArithmeticException{
        // Made By Harry
       int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try {
            divide(23,0);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            double ar = area(4);
            System.out.println(ar);
        } catch (negativeRadiusException e) {
            e.printStackTrace();
        }
    }
}
