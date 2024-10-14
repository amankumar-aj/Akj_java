package com.company;

import java.util.concurrent.CyclicBarrier;

/*You have to implement a library using Java Class "Library"
•	Methods: addBook, issueBook, returnBook, showAvailableBooks
•	Properties: Array to store the available books,
•	Array to store the issued books
*/
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books= new String[1000];
        this.no_of_books=0;

    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ " has been Added sucessfully! ");
    }
    void showBook(){
        System.out.println("\nAvailable books are :");
        for(String book:this.books){
            if (book==null){
                break;
            }
            System.out.println("# "+book);
        }
    }
//    void issueBook( String book){
//        for(String book:){
//
//        }
//    }
}
public class akj_51_Exercise_4_ch10_Online_library {
    public static void main(String[] args) {

    Library Clibrary=new Library();
    Clibrary.addBook("A Brief History of TIME");
    Clibrary.addBook("Physcs HC VERMA");
    Clibrary.addBook("AKJ");
    Clibrary.addBook("JAVA");
    Clibrary.addBook("amankumar_aj");
    Clibrary.addBook("Anurag's Biography");
        Clibrary.addBook("sysrem engineering");

    Clibrary.showBook();
    }
}
