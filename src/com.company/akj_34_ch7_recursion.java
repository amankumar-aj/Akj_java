package com.company;

import java.util.Scanner;

public class akj_34_ch7_recursion {
    static long factorial_recursive(int n){
// here using a long data type instead of int because to get output of factorial for a very long range
        if (n==0||n==1){
            return 1;
        }
        else {
            return n*factorial_recursive(n-1);
        }
    }
    static long factorial_iterative(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            int g=1;
            long factorial1=1;
            for (g=1;g<=n;g++){
                factorial1 *=g;
            }
            return factorial1;
        }
    }
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to find its factorial value: ");
        int x=sc.nextInt();
        System.out.println("the value of "+x +" factorial is: "+factorial_recursive(x));
        System.out.println("the value of "+x +" factorial is: "+factorial_iterative(x));

        //Quick Quiz: Write a program to calculate (recursion must be used) sum of Fibonacci series  of a number in Java?
        System.out.println("Enter number of  terms upto which you want  fibonacci series: ");
        int y=sc.nextInt();
        System.out.println("Fibonacci series upto "+y+ " is terms as follows  :" );
        for (int i=0;i<=y;i++) {
            System.out.println(fibonacci(i));
        }

    }
}
