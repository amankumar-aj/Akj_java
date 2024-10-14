package com.company;
class Phone{
    public void time(){
        System.out.println("11pm");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on Smartphone");
    }
}

public class akj_49_ch10_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone p=new Phone(); //allowed
        p.on();
        SmartPhone smp=new SmartPhone();//allowed
        smp.on();

        Phone p1=new SmartPhone(); //allowed
    // reference      object  ^ above line
        p1.on();
        //p1.music();//it is not allowed because this method is not class phone {}
        //SmartPhone smp2=Phone();//not allowed as reference of subclass and object of superclass
        p1.time();

    }
}
/*In the below code, we've created two classes: Phone & SmartPhone.
The Phone is the parent class and the SmartPhone is the child class.
The method on() of the parent class is overridden inside the child class.
Inside the main() method, we've created an object obj of the Smartphone() class by taking the reference of the Phone() class.
When obj.on() will be executed, it will call the on() method of the SmartPhone() class
because the reference variable obj is pointing towards the object of class SmartPhone().*/

/*akj_50_ solution for Ex-3 at [D:\java\firstjavaprogramAkj\src\com.company\akj_43_Exercise_9_3guessNumber_oops.java]*/