package com.company;
import java.util.Scanner;
public class akj_06Exercise1_ch1_Percent {
    public static void main(String[] args) {
        System.out.println("Today we will calculate %age marks of student");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name Of Student:");
        String name=sc.nextLine();
        System.out.println(name);

        System.out.println("Enter marks obtained in PHYSICS");
        int a=sc.nextInt();
        System.out.println("Enter marks obtained in CHEMISTRY");
        int b=sc.nextInt();
        System.out.println("Enter marks obtained in MATHEMATICS");
        int c=sc.nextInt();
        System.out.println("Enter marks obtained in ENGLISH");
        int d=sc.nextInt();
        System.out.println("Enter marks obtained in COMPUTER SCIENCE");
        int e=sc.nextInt();
        int total=a+b+c+d+e;
        System.out.println("Total marks obtained:" + total);

        float score= (float) (total/500.0);
        float percentage=score*100;
        //System.out.print("Marks obtained by " + name);
        //System.out.println(" in percentage is "+ percentage +"%");
        System.out.println("Marks obtained by " + name+ " and percentage is " + percentage +"%");





    }
}
