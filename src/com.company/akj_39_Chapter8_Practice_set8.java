/*QUESTIONS
1.	Create a class Employee with the following properties and methods:
•	Salary (property) (int)
•	getSalary (method returning int)
•	name (property) (String)
•	getName (method returning String)
•	setName (method changing name)
2.	Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
3.	Create a class Square with a method to initialize its side, calculating area, perimeter etc.
4.	Create a class Rectangle & problem 3.
5.	Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
6.	Repeat problem 4 for a circle.

*/
//SOLUTIONS
package com.company;


import java.util.Scanner;

class Employee{
     int Salary;
     String name;

     public int getSalary(){
         return Salary;
     }
     public String  getName(){
         return name;
     }
     public void  setName(String n){
         name=n;
     }
 }
 class Cellphone{
     public  void ring(){
         System.out.println("Ringing.....");
     }
     public  void Vibrate(){
         System.out.println("Vibrating.....");
     }
     public  void callFriend(){
         System.out.println("\nCalling Aj.....");
     }
     public  void message(){
         System.out.println("message to Mi.. \n Hi oyeee kya haal chaal!");
     }

 }
 class square{
     int side;
     public int area(){
         return side*side;
     }
     public  int perimeter(){
         return 4*side;
     }
 }
 class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
 }

 class circle{
    int radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public  double perimeter(){
        return  2*3.14*radius;
    }
 }

 class TommyVecetti{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("enemy is running");
    }
    public void fire(){
        System.out.println("fireing on enemy");
    }

 }
public class akj_39_Chapter8_Practice_set8 {
    public static void main(String[] args) {
        //Question1
        Employee aman=new Employee(); // new is a keyword which allocate a space in memory for a given object
// and Employee() is a constructor function{constuctors are method but only differences is they don't return anything}
        System.out.println("Details of Employee");
        aman.setName("Aman Kumar Jha");
        aman.Salary=4;
        System.out.println("Emp_Name: "+aman.getName());
        System.out.println("EMp_Salary :"+aman.getSalary()+"L");

        //Question2
        Cellphone realme7=new Cellphone();
        System.out.println("\nFeatures of Test_Cellphone:");
        realme7.callFriend();
        realme7.ring();
        realme7.Vibrate();
        realme7.message();

        //Question3
        square sqr=new square();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nCalculating Area and Perimeter of Square!");
        System.out.println("Entre side length: ");
        int s1=sc.nextInt();
        sqr.side=s1;
        System.out.println("the area of square is "+sqr.area());
        System.out.println("the perimeter of  square is "+sqr.perimeter());


        //question4
        Rectangle rtgl=new Rectangle();
        System.out.println("\nCalculating Area and Perimeter of Rectangle!");
        System.out.println("Enter length of Rectangle: ");
        int l= sc.nextInt();
        rtgl.length=l;
        System.out.println("Enter Breadth of Rectangle: ");
        int b=sc.nextInt();
        rtgl.breadth=b;
        System.out.println("the area of  rectangle is "+rtgl.area());
        System.out.println("the perimeter of  rectangle is "+rtgl.perimeter());

        //Question5
        System.out.println("\nPrinting game task");
        TommyVecetti tom=new TommyVecetti();
        tom.hit();
        tom.run();
        tom.fire();

        //Question6
        System.out.println("\nCalculating Area and Perimeter of Circle");
        circle crl=new circle();
        System.out.println("Enter radius of circle: ");
        int r=sc.nextInt();
        crl.radius=r;
        System.out.println("the area of  Circle is "+crl.area());
        System.out.println("the perimeter of  Circle is "+crl.perimeter());


    }
}
/*
Constuctors are olny called once at the time of object creation
*/