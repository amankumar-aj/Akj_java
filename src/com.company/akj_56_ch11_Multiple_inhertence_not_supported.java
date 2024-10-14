package com.company;

public class akj_56_ch11_Multiple_inhertence_not_supported {
    public static void main(String[] args) {

    }
}
/*Is multiple inheritance allowed in Java?
•	Multiple inheritance faces problems when there exists a method with the same signature in both the superclasses.
•	Due to such a problem, java does not support multiple inheritance directly, but the similar concept can be achieved using interfaces.
•	A class can implement multiple interfaces and extend a class at the same time.
Some Important points :
1.	Interfaces in java are a bit like the class but with a significantly different.
2.	An Interface can only have method signatures field and a default method.
3.	The class implementing an interface needs to declare the methods ( not field )
4.	You can create a reference of an interface but not the object
5.	Interface methods are public by default
*/