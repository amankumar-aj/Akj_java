package com.company;

public class akj_15chapter3_Practice_set3 {
    public static void main(String[] args) {
        //Q1. Write a Java program to convert a string to lowercase.
        String name="AMAN KUMAR JHA";
        name=name.toLowerCase();
        System.out.println(name);

        //Q2. Write a Java program to replace spaces with underscores.
        name=name.replace(" ","_");
        System.out.println(name);

        /*Q3 Write a Java program to fill in a letter template which looks like below:
               letter = “Dear <|name|>, Thanks a lot”
               Replace <|name|> with a string (some name) */
        String  letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","Aman"));
        //Q4. Write a Java program to detect double and triple spaces in a string.
        String check_D_T="To  check whether   this string contains double and triple spaces";
        System.out.println(check_D_T.length());//65
        System.out.println(check_D_T.indexOf("  "));// 2  {if something we find is missing then, it returns -1 }
        System.out.println(check_D_T.indexOf("   "));//17
        /*Q5. Write a program to format the following letter using escape sequence characters.
              Letter = “Dear Harry, This Java Course is nice. Thanks”  */
        String letter1="Dear Harry,\n\tThis Java Course is nice.\n\tThanks";
        System.out.println(letter1);
    }
}
