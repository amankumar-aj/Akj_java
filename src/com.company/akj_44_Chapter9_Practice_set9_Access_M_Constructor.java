package com.company;

import java.net.HttpRetryException;

/*
1.	create a class cylinder and use getter and setters to set its radius and height
2.	use ➊ to calculate surface and volume of the cylinder
3.	Use a constructor and repeat ➊
4.	Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
5.	Repeat ➊ for a sphere
*/
 class cylinder{
   private int radius;
   private int height;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

     public double surfaceArea(){
         return (2*3.14*radius*(radius+height));
     }
     public double Volume(){
         return (3.14*radius*radius*height);
     }
     cylinder(int r,int h){
        this.height=h; this.radius=r;
    }   cylinder(){
        int radius; int height;
    }
}

class Rectangle1{
    private int length;
    private int breadth;
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public Rectangle1(){
        this.breadth=5; this.length=4;
    }
    public Rectangle1 (int l,int b){
        this.length=l; this.breadth=b;
    }

}

class Sphere{
    private int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

}

public class akj_44_Chapter9_Practice_set9_Access_M_Constructor {
    public static void main(String[] args) {
        //Question 1
        System.out.println("Assigning radius and height using setters and getters ");
        cylinder c1=new cylinder();
        c1.setHeight(4);
        System.out.println("Height: "+c1.getHeight());
        c1.setRadius(5);
        System.out.println("Radius: "+c1.getRadius());

        //Question2
        System.out.println("calculating Surface area  & volume of cylinder");
        System.out.println("Surface_Area: "+c1.surfaceArea());
        System.out.println("Volume: "+c1.Volume());

        //question 3
        System.out.println("calculating area and volume using constructor");
        cylinder c2=new cylinder(6,7);
        System.out.println("Surface_area:"+c2.surfaceArea());
        System.out.println("Volume: "+c2.Volume());

        //Question4
        Rectangle1 rt1=new Rectangle1();
        System.out.println("Breadth: "+rt1.getBreadth());
        System.out.println("Length: "+rt1.getLength());

        Rectangle1 rt2=new Rectangle1(4,8);
        System.out.println("Breadth: "+rt2.getBreadth());
        System.out.println("Length: "+rt2.getLength());

        //Question5
        Sphere sp1=new Sphere();
        sp1.setRadius(5);
        System.out.println("Sphere radius: "+sp1.getRadius());




    }
}
