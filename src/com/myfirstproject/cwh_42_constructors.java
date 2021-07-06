package com.myfirstproject;

class MyMainEmployee {
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String name1, int id1 , int salary1){
        id = id1;
        name = name1;
        salary = salary1;

    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
    public void setSalary(int i) {
        this.salary = i;
    }

    public int getSalary() {
        return salary;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee h = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(h.getId());
        System.out.println(h.getName());
        MyMainEmployee my = new MyMainEmployee("talha" , 7 , 10000);
        System.out.println(my.getId());
        System.out.println(my.getName());
        System.out.println(my.getSalary());
    }
}
