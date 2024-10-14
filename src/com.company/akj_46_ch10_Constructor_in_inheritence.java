package com.company;
class Base1{
    Base1(){
        System.out.println("I am a constructor of base class ");
    }
    Base1(int x){
        System.out.println("I am a overloaded constructor of base  with a value of a as: "+x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(0);//calling parametrized constructor from base class
        System.out.println("I am a constructor of Derived class ");
    }
    Derived1(int x,int y){
        super(5);
        System.out.println("I am a overloaded constructor of derived  with a value of a as: "+y);
    }

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a constructor of child of derived1 class");
    }
    ChildOfDerived(int x,int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of childOfDerived  with a value of a as: "+z);

    }

}
public class akj_46_ch10_Constructor_in_inheritence {
    public static void main(String[] args) {

       Base1 b=new Base1();//after creating object of base class it automatically call constructor of base class
       Derived1 d=new Derived1();//if derived class contains constructor it will call that and also call Base class constructor
    /*Output of above two lines
    * I am a constructor of base class
    I am a constructor of base class
    I am a constructor of Derived class */
   Derived1 d1=new Derived1(4,9);
   ChildOfDerived cd=new ChildOfDerived(6,7,3);
/*When a derived class is extended from the base class,
the constructor of the base class is executed first followed by the constructor of the derived class.*/
/*When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class.
If we want to call the constructor with parameters from the parent class, we can use the super(argument) keyword.
super(a, b) calls the constructor from the parent class which takes 2 variables*/
//constructor call as -- c1-->c2-->c3  if object of c3 created


    }
}
