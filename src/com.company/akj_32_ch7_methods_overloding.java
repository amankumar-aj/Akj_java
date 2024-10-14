package com.company;

public class akj_32_ch7_methods_overloding {
    static void telljoke(){
        System.out.println("I invented a new word!\n"+"plagiarism");
    }// when we don't want to return anything from our program, then we use void as a return type.
    static  void change(int a){
        a=89;
    }
    static void change2(int [] arr){
        arr [0]=85;
    }
    //method overloading-- creating method with the same name with different purpose

    static void hi(){
        System.out.println("hello dear user");
    }
    static void hi(int a){// here a is parameter which do not have assigned any value yet
        System.out.println("hello " +a+" dear user");
    }
    static void hi(int a,int b){
        System.out.println("hello "+a+" dear "+b+" user");
    }
/*
 static int hi(int a,int b){
        System.out.println("hello "+a+" dear "+b+" user");
        return 4;
    }//Note: Method overloading cannot be performed by changing the return type of methods.
*/

    public static void main(String[] args) {
        telljoke();   //calling telljoke() method

        //case1 changing integer
        int x= 54;
        System.out.println("\nthe value of x after change is: "+x);
        change(x);  //here it is not change because it only copy the value of x to change method

        //case2 changing the array
        int [] marks={86,89,95,84,89};
        System.out.println("\n the value of x before change2 is:"+marks[0]);
        change2(marks);
        System.out.println("\nthe value of x after change2 is: "+marks[0]);
        //Change function will update the value of arr at index 0 because when we pass an array to function/method,
        // it will actually pass the address of the value,
        // therefore, it is call by reference, and it will definitely change the value of array at index 0 and print 85

        //METHOD OVERLOADING--------------------------------------------
/*In Java, it is possible for a class to contain two or more methods with the same name but with different parameters.
 Such methods are called Overloaded methods
 */
        //calling hi method created above
        hi();
        hi(200);// 200 is argument which is passes to the parameter a.
        hi(2,5);


    }
}
