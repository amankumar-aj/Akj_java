package com.company;

//Question1
class Circle1{
    public int radius;

    public double area(int r){
        this.radius=r;
        return 3.14*radius*radius;
    }
}
class Cylinder extends Circle1{
   public  int height;
    public double area(int r,int h){
        this.radius=r; this.height=h;
        return  (2*3.14*radius*height)+(2*3.14*radius*radius);
    }
    public  double volume(int r,int h){
        this.radius=r; this.height=h;
        return 3.14*radius*radius*height;

    }

}

//Question2
class Rectanglee{
    int breadth;
    int length;

    public int area(int b,int l){
        this.breadth=b; this.length=l;
        return 2*(length+breadth);

    }
}

class Cuboid extends Rectanglee{
    int height;
//Question 4 getter and Setter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int volume(int l,int b,int h){
        this.length=l; this.breadth=b; this.height=h;
        return length*breadth*height;
    }
}


public class akj_52_Chapter10_Practice_set10_Inheritence {
    public static void main(String[] args) {
       //Question3
        Circle1 c=new Circle1();
        System.out.println("Area of circle: "+c.area(5) );

        /*Cylinder c1=new Cylinder();
        System.out.println("Area of cylinder: "+c1.volume(4,5));*/

        //Question 4
        //object of Rectangle
        Rectanglee r=new Rectanglee();
        System.out.println("Area of rectangle: "+r.area(4,5));

        Cuboid co=new Cuboid();
        System.out.println("Volume of cuboid: "+co.volume(2,4,6));



        //Question5
        //Ans-Constructor execution follows bellow aorder;-
        //1.Base
        //2.Derived1
        //3.Derived2

    }
}
