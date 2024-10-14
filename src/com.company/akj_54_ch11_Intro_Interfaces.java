package com.company;

interface Bycycle{//Declearing interface {pure abstarction}
    //all methods in interfaces are abstract
    //All the methods inside an interface must have empty bodies except default methods and static methods.
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class Stayrider implements Bycycle{//using implements keyword we can impliment an interface
    // we must need to impliment all the methods of interface in implemented class
    //all methods inside child class which is implemented frominterface must need to define with public
    int speed=7;
    @Override
    public void applyBreak(int decrement){
        System.out.println("Break applied");
        speed =speed -decrement;
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Incresing speed");
        speed =speed +increment;

    }

}
public class akj_54_ch11_Intro_Interfaces {
    public static void main(String[] args) {
        //Bycycle b1=new Bycycle();  [Error [we cannot create an object of interface ]]
        Bycycle b=new Stayrider();//object of implimented class
        //An interface cannot contain a constructor (as it cannot be used to create objects)
        b.applyBreak(6);
        b.speedUp(10);


    }
}

