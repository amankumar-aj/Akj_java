package com.company;

import java.util.Scanner;

public class akj_07chapter1_Practice_set1 {
    public static void main(String[] args) {
    //Q1 write a program to sum three numbers.
        int a=100;                                       /*   -these are used for multiline comments----*/
        int b=200;
        int c=200;
        int sum=a+b+c;
        System.out.println(sum);

    //Q2 Write a program to calculate CGPA using marks of three subjects (out of 100)
        float sub1=95;
        float sub2=89;
        float sub3=89;
        float cgpa=(sub1+sub2+sub3)/30;
        System.out.println(cgpa);
    //Q3 Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
        System.out.println("What is your name?");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello "+name +" have a good day!!");

    //Q4 Write a Java program to convert Kilometers to miles.
        System.out.println("Enter distance in kilometers");
        float dis_km= sc.nextFloat();

        float dis_miles= (float) (dis_km/1.609);
        System.out.println(dis_km +" kilometers is equal to " + dis_miles +" miles");


    //Q5 Write a Java program to detect whether a number entered by the user is an integer or not.
        System.out.println("Enter the number  to check whether it is integer or not");
        boolean a1= sc.hasNextInt();
        System.out.println(a1);

    }
}

