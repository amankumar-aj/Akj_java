package com.company;

interface Sampleinterface{
    void meth1();
    void meth2();
}

//we can inherit interface from another interface by using 'extend' keyword
//we cannot inherit a subclass or class from interface using 'extend' keyword we have to use implement.

interface samplechildinterface extends Sampleinterface{//valid
    //[class child extend sampleinterface{}- thros an error]-Invalid
    void meth3();
    void meth4();
}
class MySampleClass implements samplechildinterface{
   public void meth3(){
       System.out.println("Method 3");
    }
    public void meth4(){
        System.out.println("Method 4");
    }
     public void meth1(){
        System.out.println("Method 1");
    }
     public void meth2(){
        System.out.println("Method 2");
    }

}
public class akj_58_ch11_inheritence_in_interface {
    public static void main(String[] args) {
        MySampleClass obj=new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
