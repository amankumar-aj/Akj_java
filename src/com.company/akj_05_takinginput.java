package com.company;
import java.util.Scanner;    //importing scanner class

//Scanner class of java.util package is used to take input from the user's keyboard.
// The Scanner class has many methods for taking input from the user depending upon the type of input.
//To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class.

public class akj_05_takinginput {
    public static void main(String[] args) {
        System.out.println("Today we will get input from users");    // use sout for print statement or get output.
        Scanner sc= new Scanner(System.in); //creating an object named sc of scanner class.   (system.in-taking input from keyboard)
        System.out.println("Enter number 1");

        int a= sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of these number is:"+ sum); //  this statement is used for alternative of below two statements
        System.out.println("The sum of these number is");
        System.out.println(sum);

       // boolean b1=sc.hasNextInt();       for checking the input number is according to datatype i.e here it is integer
        //System.out.println(b1);
        //String str=sc.next();       //sc.next() is used to read a word until a space.
        //System.out.println(str);
        String str1=sc.nextLine();   //sc.nextline() is used to read whole line
        System.out.println(str1);

        System.out.println("");
    }
}
