package com.company;

class Employeee{//Creating new class first letter of class should be capital
    int id;
    String name;
    int salary;
    public void Printdetails(){
        System.out.println("My ID is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class akj_38ch8_Oops_javaclass {
    public static void main(String[] args) {
        System.out.println("This is our custom class: ");

        Employeee aman=new Employeee();  // Instantiating a new Employee Object
        //reference      object  ^ above line
        Employeee anurag=new Employeee();

        //Setting Attributes(properties) for aman
        aman.id=101;
        aman.name="Aman kumar jha";
        aman.salary=13;
        //Setting Attributes(properties) for anurag
        anurag.id=102;
        anurag.name="Anurag Tripathi";
        anurag.salary=11;


        //Printing the Attributes
        System.out.println(aman.id);
        System.out.println(aman.name+"\n");
        //calling printdetails method for printing
        aman.Printdetails();
        int salary101= aman.getSalary();
        System.out.println(salary101);

        anurag.Printdetails();
        int salary102 = anurag.getSalary();
        System.out.println(salary102);



    }
}
