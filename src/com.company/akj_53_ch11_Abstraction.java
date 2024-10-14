package com.company;

abstract class Parent{
    Parent(){
        System.out.println("Mai base two ka constructor hoon");
    }
    public void sayhello(){
        System.out.println("Namste");
    }
    abstract public void greet();//if we use an abstract method in class,
    // then we need to define this class as abstract otherwise it will generate error
    abstract public void greet2();
}

class child2 extends Parent{//here as child2 was inherited from parent and we not declare it as abstract so,
                           // we implement abstract method of parent class in child2 class
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("goot after noon");
    }

}
abstract class child3 extends Parent{ //if we inherit abstract parent class in child class then,
    // we must either declare child class as abstract or implemented abstract method of Parent class in child class.

}

//Abstract class are used when we want to achieve security & abstraction(hide certain details & show only necessary details to the user)
abstract class Phone1{
    abstract void on();
}
class SmartPhone1 extends Phone1 {
    void on(){

    }
    void run() {
        System.out.println("Turning on...");
    }
}
public class akj_53_ch11_Abstraction {
    public static void main(String[] args) {
       // Parent p=new Parent();//parent is an abstract class[error]
       /*We cannot create objects of an abstract class.
        To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.*/

        //child3 c3=new child3(); abstract class[error]

        //object of child2
        child2 c2=new child2();
        c2.greet();
        SmartPhone1  sm=new SmartPhone1();
        sm.run();

    }
}
