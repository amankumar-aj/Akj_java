package com.company;

public class akj_29_chapter6_practice_set6 {
    public static void main(String[] args) {
        //Q1.Create an array of 5 floats and calculate their sum.
        float[] marks = {89.5f, 89.5f, 95.5f, 85.5f, 84.5f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("sum of marks is :"+sum);

        //Q2.Write a program to find out whether a given integer is present in an array or not.
        float[] marks1 = {89.5f, 89.5f, 95.5f, 85.5f, 84.5f};
        float number = 85.5f;
        boolean isInArray = false;
        for (float element : marks1) {
            if (number == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("\nthe value  is present in the given array");
        } else {
            System.out.println("\nThe value is not present in the given array");
        }

        //Q3 Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        float[] marks2 = {89.5f, 89.5f, 95.5f, 85.5f, 84.5f};
        float sum2 = 0;
        for (float element : marks2) {
            sum2 = sum2 + element;
        }
        System.out.println("\nAverage of marks of student is :"+sum2/ marks2.length);
        //Q4Create a Java program to add two matrices of size 2x3.
        int [][] matrix1={{2,4,6},
                {1,2,3}};
        int [][] matrix2={{3,6,9},
                {5,4,1}};
        int [][] resMatrix={{0,0,0},
                {0,0,0}};
        for (int i=0;i< matrix1.length;i++){//number of rows
            for (int j=0;j<matrix1[i].length;j++){ // numbers of columns
                System.out.format("Setting value for i=%d and j=%d\n",i,j );
                resMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        //printing the element of 2-D array
        for (int i=0;i< matrix1.length;i++){//number of rows
            for (int j=0;j<matrix1[i].length;j++){
                System.out.print(resMatrix[i][j]+ " " );
                resMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }System.out.println("");
        }
        System.out.println("\n");
        //Q5 Write a Java program to reverse an array.
        System.out.println("Reversing an array ");
        int [] aj={1,2,3,4,5,6,7,8,9,10};
        int l=aj.length;
        int n=Math.floorDiv(l,2);
        int temp;

        for (int i=0;i<n;i++){
            //swapping a[i] and a[l-i-1];
            // a    b    temp
            //|4|    |3|    | |
            temp=aj[i];
            aj[i]=aj[l-1-i];
            aj[l-1-i]=temp;
        }
        for (int element:aj){
            System.out.print(element + " ");
        }

        //Q6 Write a Java program to find the maximum element in an array.
        int [] maxarray={1,-210,-3,544,3,4,7,8,14};
        int max=Integer.MIN_VALUE;
        for (int element:maxarray){
            if (element>max){
                max=element;
            }
        }
        System.out.println("\nThe value of maximum element in given array is: "+max);

        //Q7Write a Java program to find the maximum element in a Java array.
        System.out.println("\nPrinting maximum and minimum value in java");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);// use for max and min value in java

        //Q8 Write a Java program to find whether an array is sorted or not.
        System.out.println("\nfinding whether an array is sorted or not" );
        boolean issorted=true;
        int [] aj1={1,2,5,7,6,9,12,34,54};
        for (int i=0;i<aj1.length-1;i++){
            if (aj1[i]>aj1[i+1]){
                issorted=false;
                break;
            }
        }if (issorted){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }


    }
}
//class 30 -- intelij idea configration so no file