package com.company;

import java.util.Scanner;

public class akj_23_ch5_forloops {
    public static void main(String[] args) {
        System.out.println("For loops");
        for (int i=20; i!=0;i--){//here i will print only once as it is an initialization expression.
            // After that it will check for the boolean condition if its true then execute code
            System.out.println(i);
        }

    //Quick Quiz 1: Write a program to print first n odd numbers using a for loop.
        Scanner sc=new Scanner(System.in);//2n--even number
        int i=0;                          //2n+1-odd numbers
        System.out.println("Enter number up to which you want to print first odd number");
        int n= sc.nextInt();
        for (i=0; i<n;i++){
            System.out.println(2*i+1);
        }

    //Quick Quiz 2: Write a program to print first n natural numbers in reverse order.
        int p=0;
        System.out.println("enter number to print Natural number in reverse order");
        int m=sc.nextInt();
        for (p=m; p!=0;p--){
            System.out.println(p);
        }
    }
}
