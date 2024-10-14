package com.company;

public class akj_08_ch2_Operaters {
    public static void main(String[] args) {
        System.out.println("today we learn about operators");
        //Arithmetic operators
        int a=50;
        int b=30;
        int c=20;
        int d=20;
        int d1=d/2;
        int c1=4*c;
        int b1=60-b;
        int a1=6+a;
        int x1=d%6; // modulus operators

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(x1);
        // Assigment operator
        int z=9;   //here we call system that multiply z i.e 9 by 3
        z *=3;
        System.out.println(z);

        int y=9; // here we call java to add 4 to y
        y +=4;
        System.out.println(y);
        //comparison operates    returns true / false
        System.out.println(34>32);
        System.out.println(0<-1);
        System.out.println(2==2); // double equals is comparison operator and single equals is assignment operators
        System.out.println(2>=1);
        System.out.println(5<=7);
        // logical operates
        System.out.println(5>2&&5<6); //And(&&) Returns true if both operands are true.

        System.out.println(6>5||2>3); // OR(||)Returns true if any of the operand is true
        System.out.println(!(6>5)); // NOT (!)Returns true if the result of the expression is false and vice-versa

        // Bitwise operator
        System.out.println(2&3); // These operators perform the operations on every bit of a number.
                                // Let x =2 and y=3. So 2 in binary is 100, and 3 is 011.
        
    }
}
