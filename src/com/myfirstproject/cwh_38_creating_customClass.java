package com.myfirstproject;

class empolyee {
    String name;
    int eid;
    int age;
    int salary;
    public void printDetails(){
        System.out.println("My Name is : "+ name);
        System.out.println("My Age is : "+ age);
        System.out.println("My Employee ID is : "+ eid);
        System.out.println("My Salary is : "+ salary);
    }

    public int getSalary() {
        return salary;
    }
}

public class cwh_38_creating_customClass {
    public static void main(String[] args) {
        empolyee tal = new empolyee();  // Instantiating a new Employee Object
        // Setting Attributes for Talha
        tal.name = "Talha";
        tal.eid = 7;
        tal.age = 18;
        tal.salary = 50000;
// Setting Attributes for Ahmed
        empolyee ahm = new empolyee();
        ahm.name = "Ahmed";
        ahm.eid = 9;
        ahm.age = 21;
        ahm.salary = 30000;
        System.out.println(ahm.name);
        System.out.println(tal.name);
        tal.printDetails();
        ahm.printDetails();
        System.out.println(tal.getSalary());
        int salary = ahm.salary;
        System.out.println(salary);
        }

}
