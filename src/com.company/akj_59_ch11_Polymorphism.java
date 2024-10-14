package com.company;
interface  MyCamera2{
    void takeSnap();
    void recordvedio();
    default void record4k(){//using default, we need not to define the particular method in all implemented class
        System.out.println("recording in 4k..");
        name();//default method use private method of interface
    }
    private  void name(){//we can create it as private,
// but it is not used by any implimented class it can be only used by defalt method of that interface
        System.out.println("realme camera"+"  - using default this private name() method is called");
    }

}
interface Mywifi2{
    String [] getNetwork();
    void ConnectToNetwork(String network);

}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting to call");
    }
}

//we cannot achive multiple inheretence directly in java but it can be possible using interface
//A class can implement multiple interfaces and extend a class at the same time
//A class implementing the interface must need to implements all methods of interface
//but A class implementing the interface need not implement the default methods.
class MySmartphone2 extends MyCellPhone2 implements Mywifi2,MyCamera2{//implementing interface and extend a class
    @Override
    public void takeSnap(){
        System.out.println("taking photo");
    }
    @Override
    public void recordvedio(){
        System.out.println("Recording Vedio ");
    }

    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String [] networkList={"Aman","Realme7","ooppo"};
        return networkList;
    }

    @Override
    public String[] getNetwork() {
        return new String[0];
    }

    @Override
    public void ConnectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class akj_59_ch11_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1=new MySmartphone2();//we use smartphone as camera only not other classes can be used.
   /* cam1.getNetworks();  //this is not allowed because it can only access Mycamera2 class because
        it get reference from camera2 and object of Mysmartphone2 */
        cam1.record4k();
        cam1.recordvedio();


    }

}
//