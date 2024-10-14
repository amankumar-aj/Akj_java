package com.company;

import java.util.Scanner;

public class akj_22_ch5_do_while_loops {
    public static void main(String[] args) {
        int a=0;//in while loops first condition is checked and after that code will execute
        while (a<10){  // if condition is false then loop will not execute the code
            System.out.println(a);
            a++;
        }
        System.out.println("This is do-while loop");
        // Do WHILE loops
//while – executes the code at least once and then checks the condition.
// Because of this reason, the code in the do-while loop executes at least once, even if the condition fails.
        int b=10;
        do {
            System.out.println(b);
            b++;
        }while (b<5); // here the condition is checked
    // here is although condition is false but even it will return(10) as output

        //Quick Quiz: Write a program to print first n natural numbers using a do-while loop.
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Enter number up to which you want to print natural");
        int n=sc.nextInt();
        System.out.println("Natural numbers up to "+n+ " is :");

        while (i<=n){
            System.out.println(i);
            i++;
        }

    }
}
