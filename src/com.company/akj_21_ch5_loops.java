package com.company;

public class akj_21_ch5_loops {
    public static void main(String[] args) {
        System.out.println("We are learning about loops in java");
        int a=1;
        while(a<=4){
//The while loop in Java is used when we need to execute a block of code again and again based on a given boolean condition.
            System.out.println(a); //here (a) is printed untill condition in while will return false
            a++;//here while check a is less than 4 or not then it will execute code under while block i.e a will be printed
                //and the value will increase by 1 {a++}
        }

        /*  while(true){//it is an infinite while loop it will not stop because condition under while will never be false
              System.out.println("Aman");
          }*/

    //QUIK QUIZ Write a program to print natural numbers from 100 to 200.

        int b=100;
        System.out.println("Natural number b/w 100 & 200 are: ");
          while (b<=200){
              System.out.println(b);
              b++;

          }
    }
}

