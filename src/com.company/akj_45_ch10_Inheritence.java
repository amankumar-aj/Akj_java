package com.company;

class Base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class and setting x now");
        this.x = x;
    }

    public  void printme(){
        System.out.println("I am a method");
    }

}
class Derived extends Base{//child or derived class created it can use all method and variables of base class
    int y;

    public int getY() {
        System.out.println("I am in derived class and setiing y now");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
  class Animal{
    int eyes=2;
    int legs=4;

    public void drink(){
        System.out.println("water");
    }

  }
  class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
  }
public class akj_45_ch10_Inheritence {
    public static void main(String[] args) {
        Base b=new Base(); //creating object of base class
        b.setX(90);
        System.out.println(b.getX());

        Derived d=new Derived();// object is created for derived class
        d.setX(4);      //but use property of base class
        System.out.println(d.getX());
        d.setY(6);
        System.out.println(d.getY());

        // creating object of Dog class
        Dog d1=new Dog();
        System.out.println("about dog");
        System.out.println(d1.eyes);
        System.out.println(d1.legs);
        d1.bark();

    }
}
