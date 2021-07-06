package com.myfirstproject;
class phone{
    public void name(){
        System.out.println("I am a function name of class phone i.e parent class and i am Nokia 1100 Phone ");
    }
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class smartphone extends phone{
    public void name(){
        System.out.println("I am a function name of class smartphone i.e child class and i am Samsung Galaxy S 21 SmartPhone ");
    }
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}


public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        /* phone obj = new phone(); // Allowed
         smartphone sob = new smartphone(); // Allowed
        phone obj1 = new smartphone(); // Yes it is allowed
         SmartPhone obj2 = new Phone(); // Not allowed
         obj.name();
          obj.music(); Not Allowed
         */
        phone p = new smartphone();
        p.name();
        p.showTime();

    }
}
