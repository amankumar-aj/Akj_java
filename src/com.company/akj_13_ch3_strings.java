package com.company;
import java.util.Scanner;

public class akj_13_ch3_strings {
    public static void main(String[] args) {
        String name=new String("Aman kumar jha");
        String Name="Aman"; // Strings are immutable and can't be changed
        System.out.println(name); //New line is added at the end
        System.out.print(Name);//no new line is added at the end

        System.out.println( ); //for creating space b/w outputs (ownlogic)
        int a=6;           /* %d for int,  %f for float, %c for char, %s for string */
        float b=9.87f;
        System.out.printf("The value of a is %d and value of b is %f",a,b);

        System.out.println( );
        System.out.printf("The value of a is %d and value of b is %.2f",a,b);
        //if we use %.2f it only show the value up to 2 decimal places
        System.out.println( );
        System.out.printf("The value of a is %d and value of b is %6.2f",a,b);
        // here we use %6.2f then it will take space of character 6, including number up to 2 decimal places

        System.out.println( );
        System.out.format("The value of a is %d and value of b is %f",a,b);
        System.out.println( );
        //ptintf is used to print statements in java it is a format specifier.
        /* we can use System.out.println()
                      System.out.print()
                      System.out.printf()
                      System.out.format()  for printing a statement.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your new string: ");
        String St=sc.next();   //read only character of strings untill space
        System.out.println(St);
/*
        System.out.println("Enter your String Again: ");
        String st1=sc.nextLine(); // read all characters of string even with space
        System.out.print(st1);
*/

    }
}
