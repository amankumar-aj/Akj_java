package com.company;
interface Bycycle1 {//creating interface using keyword interface.
    int a=78;//it final it cant be modified later
    void applyBreak(int decrement);
    void speedUp(int increment);

    void changegear(int increment);
}
interface  HornBycycle{
  void blowHorn1();
  void blowHorn2();
}

class AvonCycle implements Bycycle1,HornBycycle{//we can implement multiple interfaces in child class
    //impementing all method and property of Bycycle1 and Hornbycle interface into AvonCycle class Altogether
    int speed=7;
    @Override
    public void applyBreak(int decrement){//must need to define all implimented methods to be public
        System.out.println("Break applied");
        speed =speed -decrement;
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Incresing speed");
        speed =speed +increment;
    }

    @Override
    public void changegear(int increment){
        System.out.println("Changing gear");
        speed =speed +increment;
    }

    @Override
    public void blowHorn1(){
        System.out.println("Sound 1");
    }
    @Override
    public void blowHorn2(){
        System.out.println("Sound 2");

    }


}
public class akj_55_ch11_Abstract_vs_interface {
    public static void main(String[] args) {
        //Bycycle b1=new Bycycle();  [Error [we cannot create an object of interface ]]
        AvonCycle by1=new AvonCycle();//object of implimented class
        //An interface cannot contain a constructor (as it cannot be used to create objects)
        by1.applyBreak(6);
        by1.speedUp(10);
        by1.changegear(9);
        System.out.println(by1.a);//we can create property in interface
        //we cannot modify the property in interfaces as they are final
        //b.a=98;{throw an error as variable a is final it can't be modified}
        by1.blowHorn1();
        by1.blowHorn2();


    }
}
