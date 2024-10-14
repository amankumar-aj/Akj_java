package com.company;

public class akj_17_ch4_Conditional_logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND(&&)...");
        boolean a=true;
        boolean b=false;

        if (a && b){  //if both oprends are true then its value will be true, and it returns if statement.
            //either both false or one true or other false it will return a false and else statement will be return
            System.out.println("Y");//operator precedence and associativity will always be followed!
        }
        else {
            System.out.println("N");
        }

        System.out.println("For Logical OR(||)...");

        if (a||b){  //if any of op-rends are true then its value will be true, and it returns if statement.
            //if both operends are false then it will return a false and else statement will be returned.
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("For Logical NOT(!)...");//Negates the given logic (true becomes false and vice-versa)
        System.out.println("Not (a) is ");
        System.out.println(!a);
        System.out.println("Not (b) is ");
        System.out.println(!b);

    }
}
