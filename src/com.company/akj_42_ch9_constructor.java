package com.company;

class Student1{
    String name;
    int rollno;
    int age;
    String stream;
    public void studentinfo(){
        System.out.println("Name   : "+name);
        System.out.println("Age    : "+age);
        System.out.println("Roll_No: "+rollno);
        System.out.println("Stream : "+stream);
    }
    Student1(){// constructor created[non Parameterized constructor]   [101]
        System.out.println("Constructor called[non-Parameterized constructor]");
    }//java automatically creates a constructor even if we can't
    Student1(String name,int age){//Parameterized constructor  [102]
        this.name=name;
        this.age=age;
    }
    Student1(Student1 std3){//Copy constructor  [103]
        this.name=std3.name;
        this.age=std3.age;
        this.rollno= std3.rollno;
        this.stream=std3.stream;
    }
}
//Quick quiz: Overloaded the employee constructor to initialize the salary to Rs 10,000
class MyEmploye{
    String name;
    int salary;
    public MyEmploye(int sal){
        this.salary=sal;
    }
}
public class akj_42_ch9_constructor {
    public static void main(String[] args) {

        MyEmploye e1=new MyEmploye(10000);
        System.out.println(e1.salary);


        // Student1() is a constructor function that doesn't return anything
        Student1 std1=new Student1();
        std1.name="AMAN KUMAR JHA";
        std1.age=19;
        std1.rollno=101;
        std1.stream="Computer_Science_Engeneering";
        //displaying details of student1
        System.out.println("\nDetails of Students are given below: ");
        std1.studentinfo();

        //Calling non Parameterized constructor
        System.out.println("\nParameterized constructor");
        Student1 std2=new Student1("aman",19);
        std2.studentinfo();

        //calling copy constructor
        System.out.println("\ncopy constructor");
        Student1 std3=new Student1(std1);
        std3.studentinfo();



    }
}
/*
(New) is a keyword that allocates space in the memory of object.
[101]
Constructor : Constructor is a special method which is invoked
automatically at the time of object creation. It is used to initialize the data members of new objects generally.
Non-Parameterized constructor : A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor).
It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java

[102]
Parameterized constructor : Constructor which has parameters is called a parameterized constructor. It is used to provide
different values to distinct objects.

[103]
Copy Constructor : A Copy constructor is an overloaded
constructor used to declare and initialize an object from another object.
There is only a user defined copy constructor in Java(C++ has a default one too)

********NOTE*****
Note : Unlike languages like C++, Java has no Destructor. Instead,
Java has an efficient  garbage collector that deallocates memory automatically.

 */