package com.company;

public class akj_10_ch2_resulting_data_types {
    public static void main(String[] args) {

        System.out.println("we are learning Resulting data type after arithmetic operation ");
        byte x=5;
        int y=7;
        short z= 8;
        int l=y+z;
        float m =8.78f+x;
        System.out.println(m);

        //Increment and decrement operators

        int p=34;
        System.out.println(p++); //first p is assigned then incremented (34)
        System.out.println(p); //incremented p will be print as output(35)
        System.out.println(++p);//first p will be incremented(36)then assigned
        System.out.println(p);//incremented p will be print as output (36)

        int q=90;
        System.out.println(q--);
        System.out.println(q);
        System.out.println(--q);
        System.out.println(q);

        //QUICK QUIZ Q1. what will be the value of expression(x)?
        int u=7;
        int v=++u*8;//the value of u will be incremented then assigned to u
        System.out.println(v);

        char E='b';
        E++;
        System.out.println(E);//now E, which is previously (b), is now incremented to (c)




    }
}
/*akj_11_solution video of ex1  at D:\java\firstjavaprogramAkj\src\com.company\akj_06Exercise1_1_Percent.java */