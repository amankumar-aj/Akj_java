package com.company;

public class akj_33_ch7_method_variables_arguments {
 /*   static int sum(int a, int b){
        return a+b;
    } static int sum(int a, int b,int c){
        return a+b+c;
    } static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }*/
    //when we increase the arguments, we need to increase repeatedly overloaded methods which increase line in code, so
    //we use Varargs to solve this problem

    //using varArgs{all, outputs of the above methods will be displayed by single method given below}
    static int sum(int ...arr){// [...] this is used as varArgs
        //Available as int [] arr
        int result=0;
        for(int a:arr){
            result +=a;
        }return  result;
    }
    static int sum1(int x, int ...arr1){ //x is a compulsory argument, so we must pass at least one argument
        int result1=x;
        for (int a:arr1){
            result1 +=a;
        }return result1;
    }

    public static void main(String[] args) {
        System.out.println("we are learning variable argument(varArgs)");
        System.out.println("the sum of 6 and 7 is: "+ sum(6,7));
        System.out.println("the sum of 6,7 and 6 is: "+ sum(6,7,6));
        System.out.println("the sum of 6,7,6 and 5 is: "+ sum(6,7,6,5));
        System.out.println("the sum of 6,7,6,5,8 and 9 is: "+ sum(6,7,6,5,8,9));
        System.out.println("the sum of Nothing is: "+sum());
        System.out.println("the sum of 2 and 5 is: "+sum1(2,5));//from sum1 method


    }
}
