package com.company;
import java.util.Scanner;
public class akj_19_chapter4_Practice_set4 {
    public static void main(String[] args) {
        //Q1. What is the output of the following program?
       /* int a = 10;
        if (a=11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");
            */

        // the output of the given program will be an ERROR because we cannot use assignment operator in if condition
        //we have to use logical OR comparison operators to check the required conditions.

//Q2.Write a program to find out whether a student is pass or fail;
// if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Calculating marks");
        System.out.println("Enter your Physics marks : ");
        a=sc.nextInt();

        System.out.println("Enter your Chemistry marks : ");
        b= sc.nextInt();

        System.out.println("Enter your Mathematics marks :");
        c=sc.nextInt();
         float t_marks=(a+b+c)/3.0f;
        System.out.println("Your percentage marks is: "+t_marks);

        if (t_marks>=40&&a>=33&& b>=33 && c>=33){
            System.out.println("Congratulations!,\n****RESULT PASSED****\nyou are promoted to next standard");
        }
        else {
            System.out.println("Sorry!\n****RESULT FAILED ****\nyou are not been promoted");
        }

/*Calculate income tax paid by an employee to the government as per the slabs mentioned below:
Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	    30%
Note that there is no tax below 2.5L. Take the input amount as input from the user.*/
        System.out.println("\nWe are calculating your income tax");
        System.out.println("\nEnter your income in LPA ");
        float tax=0;
        float income=sc.nextLong();
        if(income<=2.5){
            tax=tax+0;
            System.out.println("The total income tax paid by the employee is: "+tax);
        } else if (income>2.5f&&income<=5f) {
            tax=  (tax+0.05f*(income-2.5f));
            System.out.println("The total income tax paid by the employee is: "+tax);

        } else if (income>5f&&income<=10.0f) {
            tax =  (tax + 0.05f * (5.0f- 2.5f));
            tax =  (tax + 0.2f * (income - 5f));
            System.out.println("The total income tax paid by the employee is: " + tax);
        } else if (income>10.0f) {
            tax = (long) (tax + 0.05f * (5.0f - 2.5f));
            tax = (long) (tax + 0.2f * (10.0f - 5f));
            tax = (long) (tax + 0.3f * (income - 10.0f));
            System.out.println("\"The total income tax paid by the employee is: "+tax);
        }
//NOT GETTING DESIRED OUTPUT HAVE TO CHECK AND REWRITE CODE BY ADJUSTING VALUES AND FUNCTION!!!!

        /*Q4. Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]*/
        System.out.println("\nFinding day of the week! Please enter day Number i.e from 1-7 to find name of days");
        int day =sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }

//Q5. Write a Java program to find whether a year entered by the user is a leap year or not.
        System.out.println("Enter year to check weather it is leap year or not");
        int year;
        year=sc.nextInt();
        if (((year%4==0)&&(year%100!=0))||(year%400 == 0)){
            System.out.println(year+" is a leap year!");
        }
        else {
            System.out.println(year+" is not a leap year!");
        }

/*Q6.Write a program to find out the type of website from the URL:
.com – commercial website
.org – organization website
.in – Indian website*/
        System.out.println("Enter website name to more about its domain");
        String website=sc.next();
        if (website.endsWith(".com")){
            System.out.println(website +" is a commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println(website+" is an Indian website");
        } else if (website.endsWith(".org")) {
            System.out.println(website+" is an organization website");
        }
    }
}
