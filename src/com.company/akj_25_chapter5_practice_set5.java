package com.company;

import java.util.Scanner;

public class akj_25_chapter5_practice_set5 {
    public static void main(String[] args) {

        /*Question 1: Write a program to print the following pattern :
         ****
         ***
         **
         *

         */
        int n=4;
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //Question 2: Write a program to sum first n even numbers using a while loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number up to which you want to find sum of even numbers: ");
        n=sc.nextInt();
        int i=0;
        int sum=0;
        while (i<n){
            sum=sum+(2*i);

            i++;
        }
        System.out.println("sum of first "+n+" even number is: "+sum);
        //Question 3: Write a program to print the multiplication table of a given number n.

        System.out.println("\nEnter number to print its multiplication table");
        int m = sc.nextInt();
        for (int p=1;p<=10;p++){
            System.out.printf("%d X %d = %d\n", m, p, m*p);
        }
        //Question 4: Write a program to print a multiplication table of 10 in reverse order.
        System.out.println("\nPrinting multiplication table of 10 in reverse order");
        int r=10;
        for (int q=r;q>=1;q--){
            System.out.printf("%d X %d = %d\n", r, q, r*q);

        }

        //Question 5: Write a program to find the factorial of a given number using for loops.
        System.out.println("\nFactorial using for loop");
        System.out.println("Enter number to find factorial");
        int f=sc.nextInt();
        int g=1;
        int factorial1=1;
        for (g=1;g<=f;g++){
            factorial1 *=g;
        }
        System.out.println("Value of "+f+" factorial is: "+factorial1);

        //Question 6: Repeat problem 5 using a while loop.
        System.out.println("\nfactorial using While loops");
        System.out.println("Enter number to find factorial");
        int c=sc.nextInt();
        int d=1;
        int factorial=1;

        while (d<=c){
            factorial *= d;
            d++;
        }
        System.out.println("Value of "+c+" factorial is: "+factorial);

        //Question 7 Repeat problem 1 using while/for loop.
        System.out.println("\nPrinting star pattern");
        int row=4,t=1,u=1;
        while (t<=row){
            while (u<=t){
                System.out.print("*");
                u++;
            } System.out.print("\n");
            t++;
            u=1;
        }
        //Question 8: What can be done using one type of loop can also be done using the other two types of loops - True or False.
        //Ans- True

        //Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int h=8;
        int sum1=0;
        for (int k=1;k<=10;k++){
            sum1 +=h*k;
        }
        System.out.println(sum1);
        //Question 11: Repeat problem 2 using for loop.
        System.out.println("\nEnter number");
        int ab = sc.nextInt();
        int abc=0;
        int sum2=0;
        for (abc=0;abc<ab;abc++){
            sum2 +=(2*abc);
        }
        System.out.println("Sum of given even numbers "+sum2);

    }

}
