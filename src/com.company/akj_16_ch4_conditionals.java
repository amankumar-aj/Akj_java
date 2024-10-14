package com.company;
import java.util.Scanner;
public class akj_16_ch4_conditionals {
    public static void main(String[] args) {
        int age=17;
        if (age>=18){ //we can use boolean also to check the condition and after that pass it to if condition
            System.out.println("You can Drive");
        }
        else{
            System.out.println("Your age is less than permit-able limits you can't drive\n");
        }

        System.out.println("getting input From users ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age to check whether you can drive or not!");
        int check_age=sc.nextInt();

        if (check_age>=18& check_age<=70){
            System.out.println("your age is correct as per permit-able limits so, you Can drive ");
        }
        else {
            System.out.println("Your age is not according to permit-able limits you can't drive");
        }



    }
}
