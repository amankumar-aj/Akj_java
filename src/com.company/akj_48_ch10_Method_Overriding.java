package com.company;
class A{
    public int a;
    public int aman(){
        return 113;
    }
    public void method2(){
        System.out.println("I am method2 of class A ");
    }
    public void method3(){
        System.out.println("I am method3of class A ");
    }
}
class B extends A{
    public void method4(){
        System.out.println("I am method4 of class B");
    }
    @Override // override  notation
    public void method3(){//override method -- when subclass has the same method as parent class
        System.out.println("I am method3of class B ");
    }
}
public class akj_48_ch10_Method_Overriding {
    public static void main(String[] args) {
        //object of class A
        A a=new A();
        a.method2();

        //object of class B
        B b=new B();
        b.method2();//as b inherits  Property of A
        b.method3();//override method 3 in B from A
        //in case of overriding the return tpe of override method is either the same or its subtype

    }
}
