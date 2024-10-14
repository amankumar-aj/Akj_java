package com.company;

class Ekclass{
    int a;

    public int getA() {
        return a;
    }
    Ekclass(int v){
        System.out.println("Constructor assigning value to a: ");
        this.a=v;
    }
    public  int returnone(){
        return 1;
    }
}

class cwh {
    int x;

    //    getter of x
    public int getX() {
        return x;
    }

    // Constructor with a parameter
    cwh(int x) {
        System.out.println("because variable name is same and we have not use this keyword  it will give output as ZERO");
        x = x;
    }
    cwh(int y,int x) {
        System.out.println("with the help of this keyword");
        this.x = x;//this keyword eliminates the confusion between the parameters and the class attributes with the same name
    }
}
class Doclass extends Ekclass{

    Doclass(int c){  //by defalt [There is no default constructor available in 'com.company.Ekclass']
                     //so we use super keyword to call parameterized constructor other than default constructor.
        super(c);//used for invoke a costum constructor
        System.out.println("mai Doclass ka constructor hoon");
    }

}
public class akj_47_ch10_super_this_keyword {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(7);
        System.out.println(e.getA());

        //creating object of cwh class
        cwh c1=new cwh(89);
        System.out.println(c1.getX());
        cwh c2=new cwh(4,6);
        System.out.println(c2.getX());

        //cobject od Doclass
        Doclass d=new Doclass(89);

    }
}
/* USE OF SUPER KEYWORD
A reference variable used to refer an immediate parent class object.
It can be used to refer immediate parent class instance variable.
It can be used to invoke the parent class method.*/