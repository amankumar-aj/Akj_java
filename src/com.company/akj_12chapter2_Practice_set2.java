package com.company;

import java.util.Scanner;

public class akj_12chapter2_Practice_set2 {
    public static void main(String[] args) {
        System.out.println("Today we will practice some question based on chapter-2 operators");
        //Q1. What will be the result of the following expression?
        float w=7/4*9/2;/*9/2=4.5 but both no. is integer, so we get integer as answer i.e., 4,
                         but we defined a(float), so the final answer is 4.0*/
        System.out.println(w);
        float z=7/4.0f*9/2.0f; // here all numbers are in float data type so answer will be directly in float.
        System.out.println(z);


        //Q2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        //Encrypting grades
        char grade='A';
        grade = (char) (grade+ 8);/* Here a resultant data type of grade+8 is integer(R=c+i=integer)
        so we cast (char) for getting output in character(char)
        we directly use this statement [grade+=8;] we will directly get the desired result without any casting */
        System.out.println(grade);

        //Decrypting grades
        grade -=8;//we directly use this statement [grade-=8;] we will directly get the desired result without any casting
        System.out.println(grade);

        //Q3. Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
         boolean k=num1>num2;
        System.out.println("number1 is grater than number 2 : "+k);
        //Q4. Write the following expression in a java program
        //(v^2-u^2)/2as
        int a=1; int s=3; int v=4; int u=5;
        int j=(v*v-u*u)/2*a*s;
        System.out.println("the value of above expression is "+ j);

        //Q5. Find the value of 'a' in the expression given below :
        int x = 7;
        int t = x*49/7 + 35/x;
        System.out.println(t);

    }
}
