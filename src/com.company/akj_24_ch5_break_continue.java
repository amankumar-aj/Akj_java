package com.company;

public class akj_24_ch5_break_continue {
    public static void main(String[] args) {
        //break and continue using loops
        for (int i=0; i<20;i++){
            System.out.println(i);//loops execute block code until either it will false or we use a break statement to stop the code
            System.out.println("Aj");
            if (i==7){
                System.out.println("ending loop using break");
                break;// here when i==7 in for loop it will check the if condition (i==7)then it will terminate the program
                //•	Whenever a ‘break’ is encountered inside the loop, the control is sent outside the loop.

            }

        }System.out.println("loop end here");
        // break using while loop
        System.out.println("\nbreak using while loop");
        int i=1;
        while (i<10){
            System.out.println(i);
            System.out.println("Akj");
            if (i==7){
                System.out.println("Ending loop using break");
                break;//here when i==7 in for loop it will check the if condition (i==7)then it will terminate the program
            }i++;  //for incrementing i variable
        }
        System.out.println("loop end here");

        // break using Do-while loop
        System.out.println("\nbreak using do-while loop");
        int p=1;
        do {
            System.out.println(p);
            System.out.println("akj");
            if (p==5){
                System.out.println("Ending loop using break");
                break;//here when p==5 in for loop it will check the if condition (p==5)then it will terminate the program
            }p++;  //for incrementing p variable
        } while (p<10);
        System.out.println("loop end here");

        //Continue using for loop*******************************************************************
        for (int c=0;c<20;c++){
            if (c==5){
                System.out.println("c==5 will not print or execute");
                continue;// it will skip c==5 and move to c==6 after c==4 and not execute statements below continue
/*	    The continue statement is used to immediately move to the next iteration of the loop.
        The control is taken to the next iteration, thus skipping everything below ‘continue’ inside the loop for that iteration
*/          }
            System.out.println(c);
            System.out.println("amankumarjha");
        }
        // we can use continue in all loops

    }
}
//1.	break statement completely exits the loop
//2.	continue statement skips the particular iteration of the loop.