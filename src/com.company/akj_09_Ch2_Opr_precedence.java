package com.company;

public class akj_09_Ch2_Opr_precedence {
    public static void main(String[] args) {
        System.out.println("we are learning precedence and associativity of operators ");
        int p= 6*5-34/2; // operator with higher precedence will be evaluated first
        /*
        =30-34/2
        =30-17
        =13
        */
        System.out.println(p);

       int q= 60/5-34*2;
       // here the precedence of / and * is same, so we have checked the associativity (left to right)
        // because associativity is same for / and * so / comes first, so it will be evaluated first.
       /*
       =12-34*2
       =12-68
       =-56
       */
       System.out.println(q);

        int r;  // here associativity is R to L so, value is associated to d first then it will be associated to c.
        int s=r=45;
        System.out.println(r);
        //QUICK QUiZ----------------------------------------------------------------------------------------------
        int a=3; int b=3; int c=-9; int d=5; int x=20; int y=10; int v=30; int u=40;
        int k= (x-y)/2;
        System.out.println(k);

        int l=(b*b-4*a*c)/2*a;
        /*=(9-(108))/2*3
          =117/2*3    / not return answer to decimals
          =58*3
          =174
        */
        System.out.println(l);

        int m=v*v-u*u;
        System.out.println(m);

        int n=a*b-d;
        System.out.println(n);
    }
}
