package com.company;

public class akj_14_ch3_stringmethods {
    public static void main(String[] args) {
        String name="Aman";  //a m a n  indexing            | A m a n_ k u m a r _ J h a
                             //0 1 2 3                      | 0 1 2 3 4 5 6 7 8 9 10 11 12 13
        String n1="Aman kumar jha";
        System.out.println(n1);
        int value1=n1.length(); //returns length of String (14){character including white space } in the above case.
        System.out.println(value1);
        System.out.println(name);
        int value=name.length();    // returns length of String (4) in the above case.
        System.out.println(value);

        String lstring=name.toLowerCase();//convert all uppercase characters of string to lowercase letters and return new string.
        System.out.println(lstring);

        String ustring=name.toUpperCase();//convert all lowercase characters of string to uppercase letters and return new string.
        System.out.println(ustring);

        String n2= "    Aman     ";
        System.out.println(n2);
        String trimn2=n2.trim(); //	Returns a new String after removing all the leading and trailing spaces from the original string.
        System.out.println(trimn2);

        System.out.println(n1.substring(4));
        //Returns a substring from start to the end. Substring(4) returns “ kumar jha”. [Note that indexing starts from 0]

        System.out.println(n1.substring(4,13));
        //	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.

        System.out.println(name.replace('n','r'));
        //Returns a new string after replacing n with r. Amar is returned in this case. (This method takes char as argument)
        System.out.println(name.replace("an","ha"));
        //replace "an" with "isha" and return new string (Amha)
        System.out.println(n1.replace("a","ha"));
        //here it replace "a" with "isha" at all places where a is available.

        System.out.println(name.startsWith("Am"));//Returns true if the name starts with the string “Am”. (True in this case)
        System.out.println(name.endsWith("Am")); // Returns true if the name ends with the string “Am”. (False in this case)
        System.out.println(name.endsWith("n")); //(True in this case)

        System.out.println(n1.charAt(13));//Returns the character at a given index position. ('a' in this case)

        System.out.println(name.indexOf("a")); //{Searching from L to R}
        //Returns the index of the first occurrence of the specified character in the given string.(2 in this case)
        System.out.println(n1.indexOf("ku")); //[here is 5]
        System.out.println(n1.indexOf("a",4));
        //[here it will read the first occurrence of given character after specified index ][in this case 8]
        System.out.println(n1.indexOf("tu")); //[if the character does not occur in the current string tnen, it will return -1]

        System.out.println(n1.lastIndexOf("a"));//{searching from R to L}
        //Returns the last index of the specified character from the given string. (13 in this case)
        System.out.println(n1.lastIndexOf("a",12));//{8 in this case}

        System.out.println(name.equals("Aman"));
        //Returns true if the given string is equal to “Aman,” false otherwise[Case sensitive]
        System.out.println(name.equalsIgnoreCase("amAn"));
        // Returns true if two strings are equal, ignoring the case of characters.

       // *********************ESCAPE SEQUENCES***********************************
        System.out.println("escape sequences\nadd new lines ");
        System.out.println("escape sequences\b use for backspace");
        System.out.println("escape sequences\ttab escape ");
        System.out.println("escape sequences\\ insert backslash ");
        System.out.println("escape sequences\r insert backslash ");

    }
}

