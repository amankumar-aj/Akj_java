package com.company;

import java.util.Random;    //importing random to generate random numbers
import java.util.Scanner;

public class akj_20_Exercise2_ch4_Rock_Paper_scissors {
    public static void main(String[] args) {
        System.out.println("we are going to play Rock_Paper_scissor ");

        // Getting choice from user
        Scanner sc=new Scanner(System.in);
        System.out.println("For Rock, Press: 1");
        System.out.println("For Paper, Press: 2");
        System.out.println("For Scissor, Press: 3");
        System.out.println("Enter any number given above: ");
        int user_choice=sc.nextInt();

        if (user_choice==1){
            System.out.println("Your choice is Rock!");
        } else if (user_choice==2) {
            System.out.println("Your choice is Paper!");
        } else if (user_choice==3) {
            System.out.println("Your choice is Scissor");
        }
        //Getting choice from computer
        Random rn=new Random();   // creating a random object
        int com_choice=rn.nextInt(1,4);    //choosing random numbers
        if (com_choice==1){
            System.out.println("Computer choice is Rock! ");
        } else if (com_choice==2) {
            System.out.println("Computer choice is Paper! ");
        } else if (com_choice==3) {
            System.out.println("Computer choice is Scissor");
        }

        // Comparing choice b/w computer and user
        if (user_choice==com_choice){
            System.out.println("You and computer opt same choice, its a TIE!!");
        } else if (user_choice==1&& com_choice==2) {
            System.out.println("Your choice is Rock, and computer choice is Paper, YOU LOSE");

        } else if (user_choice==1&& com_choice==3) {
            System.out.println("Your choice is Rock, and computer choice is Scissor, YOU WON");
        } else if (user_choice==2&& com_choice==1) {
            System.out.println("Your choice is Paper, and computer choice is Rock, YOU WON");
        } else if (user_choice==2&&com_choice==3) {
            System.out.println("Your choice is Paper, and computer choice is scissor, YOU LOSE");
        } else if (user_choice==3&& com_choice==1) {
            System.out.println("Your choice is Scissor, and computer choice is Rock, YOU LOSE");
        } else if (user_choice==3&& com_choice==2) {
            System.out.println("Your choice is Scissor, and computer choice is Paper, YOU WON");
        }else {
            System.out.println("Sorry, Your choice was Wrong!!");
        }
    }
}


