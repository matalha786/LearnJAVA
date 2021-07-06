package com.myfirstproject;
class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }}
class derived extends base {
    int y;
    public int getY() {
        return y;
    }
 static class der extends base{
        int z;
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
}
    public void setY(int y) {
        this.y = y;
    }
}
class animal{
    String ane = "Hi This is an Animal Class";
    public static String speak(){
        return "Hello i am animal class method";
    }

}
class dog extends animal{
    String dg = "Ye Hai Dog parent class";
public boolean spek() {
    System.out.println("Dog is barking");
    return false;
}
    public String spekk(){
    return "Dog is barking again";
}

}
public class cwh_45_Inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        base b = new base ();
        b.setX(4);
        System.out.println(b.getX());
        // Creating an object of derived class
        derived d = new derived();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(13);
        System.out.println(d.getY());
        derived.der de = new derived.der();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(13);
        System.out.println(d.getY());
        de.setX(8);
        System.out.println(d.getX());
        de.setZ(29);
        System.out.println(de.getZ());
        animal an = new animal();
        System.out.println(an.ane);
        dog dd = new dog();
        System.out.println(dd.ane);
        System.out.println(dd.dg);
        System.out.println(dd.spek());
        System.out.println(dd.spekk());
        System.out.println(animal.speak());
        System.out.println(animal.speak());
        System.out.println(dd.speak());
    }
}
