package com.company;

public class akj_31_ch7_methods {
    static int addition(int x,int y) {// defining or creating new method for own purpose
        int z;//if we can not use static function then we have to create a new object and then call the method
        if (x > y) {                            /*DON'T REPEAT YOURSELF---DRY*/
            z = x + y;                          /*Use methods and call it when needed*/
        } else {
            z = (x + y) * 6;
        }
        return z;
    }
    int substraction(int x, int y){// without static keyword so we need to create an object then call the functions
        int z;
        if (x>y){
            z=(x-y);
        }else {
            z=x-y;
        }
        return z;
    }
    public static void main(String[] args) {
/*for calculating output, we have to use below logic repeatedly,
 which is not good practice, so we can create separate method for certain logics, and we can call that method in our program when needed */
        int a=4;
        int b=5;
        int c;
        if (a>b){                            /*DON'T REPEAT YOURSELF---DRY*/
             c=a+b;                          /*Use methods and call it when needed*/
        }else {
            c=(a+b)*6;
        } System.out.println(c);

        int a1=6;
        int b1=5;
        int c1;
        if (a1>b1){
            c1=a1+b1;
        }else {
            c1=(a1+b1)*5;
        }
        System.out.println(c1);

        //using addition method which is built above  [static int addition(int x,int y) ]
        System.out.println("printing calculated value by calling addition method which was built above: ");
        int a2=4;
        int b2=5;
        int c2=addition(a2,b2);//use created method
        System.out.println(c2);

        int a3=6;
        int b3=5;
        int c3=addition(a3,b3);
        System.out.println(c3);

        //createing new object for method and call it(substration method which was created above)
        akj_31_ch7_methods obj=new akj_31_ch7_methods();
        // class name   variavbleName = new class name   - creating object
        c3=obj.substraction(a3,b3);
        System.out.println("using new object calling a method ");
        System.out.println(c3);

    }
}
