package com.company;

import java.util.Scanner;

public class test {
    static int fib(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        for (int i = 0;i<=num;i++){
            System.out.println(fib(i));
        }

        System.out.println("enter number");
        int sum =0;
        int z= sc.nextInt();
        for (int k=1;k<=z;k++){
            sum+=k;
        }
        System.out.println(sum);


    }
}
