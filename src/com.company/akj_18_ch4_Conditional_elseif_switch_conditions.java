package com.company;
import java.util.Scanner;
public class akj_18_ch4_Conditional_elseif_switch_conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check whether you can drive or not! ");
        int age = sc.nextInt();

        if (age >= 18 && age <= 40) {
            System.out.println("your age is correct as per permit-able limits so, you Can drive!");
        } else if (age >= 70) {
            System.out.println("your age is over the limits of driving vehicals, you can't Drive!!");
        } else if (age >= 40 && age < 60) {
            System.out.println("you have to renew your Driving licence then, you can Drive");
        } else if (age >= 60 && age < 70) {
            System.out.println("you can extend your licence max upto " + (70 - age) + " years from now");
        } else {
            System.out.println("Your age is not according to permit-able limits you can't drive");
        }

//******************************** SWITCH CASES**************************************
        System.out.println("Enter your age");
        int age1 = sc.nextInt();//Variable can be an integer, character, or string in Java.
        switch (age1) {
            //Switch-Case is used when we have to make a choice between the number of alternatives for a given variable.
            case 18:
                System.out.println("You are going to become an Adult");
                break;
            //Never forget to include the break statement after every switch case otherwise the switch case will not terminate.
            case 23:
                System.out.println("you are going to join a job");
                break;
            case 60:
                System.out.println("You are going to be retired!");
                break;
            default:
                //Every switch case must contain a default case. The default case is executed when all the other cases are false.
                System.out.println("Enjoy your life!");
        }
        //**************************** Enhanced switch*************************************
        System.out.println("Enter your age again");
        // in enhanced case no break statement needed
        int age2 = sc.nextInt();//Variable can be an integer, character, or string in Java.
        switch (age2) {
            //Switch-Case is used when we have to make a choice between the number of alternatives for a given variable.
            case 18 -> System.out.println("You are going to become an Adult");
            case 23 -> System.out.println("you are going to join a job");
            case 60 -> System.out.println("You are going to be retired!");
            default -> System.out.println("Enjoy your life!");
            //Every switch case must contain a default case. The default case is executed when all the other cases are false.
        }
    }
}
