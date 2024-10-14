package com.company;

public class akj_28_ch6_multi_Dim_arrays {
    public static void main(String[] args) {
        int []marks;// 1-D Array
        int [][] flats;// 2-D Arrays

        flats=new int [2][3];
        flats[0][0]=100;
        flats[0][1]=200;
        flats[0][2]=300;
        flats[1][0]=101;
        flats[1][1]=102;
        flats[1][2]=103;
        for (int i=0;i< flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
