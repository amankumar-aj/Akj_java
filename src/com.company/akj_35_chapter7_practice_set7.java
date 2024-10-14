package com.company;

import java.util.Scanner;

public class akj_35_chapter7_practice_set7 {
    //Q1Write a Java method to print the multiplication table of a number n.
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i, n*i);
        }
    }

   /* Q2 Write a program using functions to print the following pattern:
    *
    **
    ***
    ****
    */

    static void pattern2(int n){
        System.out.println("\nprinting pattern2");
        for (int i=0; i<n;i++){// how many rows we needed {0 to n-1}
            for (int j=0;j<i+1;j++){// how many stars are in each rows{0 to n+1}
                System.out.print("*");
            }
            System.out.println("");
        }
    }
// Q3.Write a recursive function to calculate the sum of first n natural numbers.
//sum(n)= 1+2+3...+n
//sum(n)=1+2+...+(n-1)+n
//sum(n-1)=1+2+3+....+n-1
    static int sumrecursive(int n){        //example sum(3)=3+sum(2)
       //base condition                              sum(3)=3+2+sum(1)
        if (n==1){                                 //sum(3)=3+2+1
            return 1;
        }
        return n+sumrecursive(n-1);

    }
/*4.	Write a function to print the following pattern:
            ****
            ***
            **
            *

 */
    static void pattern4 (int n) {
        System.out.println("\nprinting pattern4");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
//Q5. Write a function to print the nth term of the Fibonacci series using recursion.

    static long fibonacci(int n){//formula fist term 0 2nd term 1 and next term is sum of previous 2 terms
        if (n==1){
            return 1;
        } else if (n==0) {
            return 0;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

//Q9.Write a function to convert Celsius temperature into Fahrenheit.
    static float temperature_convt(float n){
       float celsius=n;
        float fahrenheit = 0;
        fahrenheit = (float) ((n * 1.8) + 32);
        //System.out.println(fahrenheit);

        return fahrenheit;
    }


//Q10. Write function to calculate the sum of first n natural numbers.
    static int Sum(int n) {
        int sum = 0;

        for (int k = 1; k <= n; k++) {
            sum += k;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
   //Q1 calling method multiplication
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to print its multiplication table: ");
        int y=sc.nextInt();
        multiplication(y);

    //Q2 calling method pattern2

    pattern2(4);

    //Q3 calling method sumrecursive
        System.out.println("\n enter number upto which sum of natural numbers");
        int p=sc.nextInt();
        int q=sumrecursive(p);
        System.out.println("the sum of first "+p +" natural number is: "+q);

    //Q4 calling  method Pattern4
        pattern4(4);

    //Q5 Calling fibonacci function
        System.out.println("Enter number of  terms upto which you want  fibonacci series: ");
        int d=sc.nextInt();
        System.out.println("Fibonacci series upto "+y+ " is terms as follows  :" );
        for (int i=0;i<=d;i++) {
            System.out.println(fibonacci(i));
        }

    //Q9 calling temprature function
        System.out.println("Enter tempurature in celcius:");
        float t=sc.nextFloat();
        float c=temperature_convt(t);
        System.out.println(t+" degree celcius is equal to "+c+" degree fahrenheit");

    //Q10 Calling sum function
        System.out.println("Enter no upto which you find the sum of natural number: ");
        p= sc.nextInt();
        Sum(p);
        

    }
}
