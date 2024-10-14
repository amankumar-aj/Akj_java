package com.company;

interface  MyCamera{
    void takeSnap();
    void recordvedio();
    default void record4k(){//using default we need not define thi particular method in all implemented class
        System.out.println("recording in 4k..");
        name();//default method use private method of interface
    }
    private  void name(){//we can create it as private,
// but it is not used by any implimented class it can be only used by defalt method of that interface
        System.out.println("realme camera"+"  - using default this private name() method is called");
    }

}
interface Mywifi{
    String [] getNetwork();
    void ConnectToNetwork(String network);

}
class MyCellPhone{
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
class MySmartphone extends MyCellPhone implements Mywifi,MyCamera{//implementing interface and extend a class
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
public class akj_57_ch11_interface_Default_method {
    public static void main(String[] args) {
        MySmartphone ms=new MySmartphone();
        ms.takeSnap();
        ms.recordvedio();
        ms.ConnectToNetwork("Aj");
        ms.callNumber(931);
        ms.pickCall();
        String[] aj=ms.getNetworks();
        for (String item:aj){
            System.out.println(item);
        }
        ms.record4k();//default method [it is defined in camera interface and not used in mysmartphone, although it is used]
        //we can overload a default method in implemented class.overloded method is called at a time when it is called by user
        //ms.name()://[throw ERROR -name()' has private access in 'com.company.MyCamera']
    }
}
