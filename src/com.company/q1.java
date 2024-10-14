package com.company;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        String s=Integer.toString(n);
        int count=0;
        for(int i=s.length();i>=0;i--){
            if(n%10==0){
                n=n/10;
                count++;
            }else{

                n=n-k;
                count++;

            }
        }System.out.println(count);
    }
}
