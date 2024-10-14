package com.company;

public class akj_27_ch6_For_each_loop {
    public static void main(String[] args) {
        // we can  create array of any data type like int float string etc.
        float [] marks1={95.5f,89.5f,89.5f,85.5f,84.5f};
        System.out.println("Length of array is");
        System.out.println(marks1.length);

        String [] students={"Aman","MI","CSK","RCB","Anurag","Aditya",};
        System.out.println("printing Student list");
        /*for (int i=0; i<students.length; i++)// array.length() is a function give length of and array
        {
            System.out.println(students[i]);    //Array Traversal
        }*/
        System.out.println("Length of array is");
        System.out.println(students.length);

        int [] marks={95,89,89,85,84};
        //Displaying the Array (Naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("Length of array is");
        System.out.println(marks.length);

        // above method is not suited for displaying a very large aaray so, we can use for loop also

        System.out.println("\nDisplaying using for loop");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("\nDisplaying in reverse order using for loop");
        for (int p=marks.length-1;p>=0;p--){
            System.out.println(marks[p]);
        }
        //**********************FOR-EACH LOOP******************************
        System.out.println("\nDislplaying using For each lopp");
        for (int element:marks){  //syntax- for(datatype element:Array){statements}
            System.out.println(element);
        }

    }
}
