package com.company;

public class akj_26_ch6_Arrays {
    public static void main(String[] args) {
        //Arrays in java
        /* classroom of 500 student -- you have to store a marks of 500 student
        you have two options
        1. create 500 variables
        2. use Arrays{RECOMMENDED}*/
        int [] marks=new int [5]; // syntax-- data type[]ArrayName;  method-1
    //•	The indexing of the array starts from 0., i.e 1st element will be stored at the 0th index
    // 2nd element at 1st index, 3rd at 2nd index, and so

        //Method-2
        //int [] marks; -- declaration
        //marks=new int[5];  -- memory allocation
        // int [] marks={95,89,89,85,84} Method-3   {declare +initialize }
        marks[0]=95;
        marks[1]=89;
        marks[2]=89;
        marks[3]=85;
        marks[4]=84;
        System.out.println(marks[2]);
        //System.out.println(marks[5]); --- throws an error because we are accessing element 6 with array length 5
        for (int i=0; i<marks.length; i++)// array.length() is a function give length of and array
        {
            System.out.println(marks[i]);    //Array Traversal

        }System.out.println("length of array{marks} is "+marks.length);
        //Quick Quiz: Write a Java program to print the elements of an array in reverse order
        System.out.println("Printing marks in reverse order");
        for (int p= marks.length-1;p>=0;p--){
            System.out.println(marks[p]);
        }
    }
}
