package com.company;

class MyEmployee{
    int id;
    String name;
    private int pin; //it can only be accessable within the class
    //for setting pin for user we can create a method in MyEmployee class

    public  void  setPin(int i){
        pin=i;
    }
    public  int getpin(){
        return pin;
    }

}
public class akj_40_ch9_Access_modifier {
    public static void main(String[] args) {
        MyEmployee e1=new MyEmployee();
        e1.id=101;
        e1.name="Aj";
        //e1.pin=113;  can not access pin from outside the MyEmployee class as it is private
        //for setting pin for user we can create a method in MyEmployee class
        e1.setPin(111);
        System.out.println(e1.getpin());
    }
}


/*
akj_41_sol exercise 2 -- already done :D:\java\firstjavaprogramAkj\src\com.company\akj_20_Exercise4_2_Rock_Paper_scissors.java
* */