package oops;

/* 

statement :
You are building a basic library system that stores information about Books and Magazines.
 Both inherit from an abstract class LibraryItem. Implement the abstract method getDetails() to show details of the item.



steps: 
Create abstract class LibraryItem

Create class Book with attributes: title, author, year

Create class Magazine with attributes: title, issueNumber

Override getDetails() method in both subclasses

output: 
Book: Java Basics, Author: John Smith, Year: 2021
Magazine: Tech Monthly, Issue #: 42

*/

import java.util.Scanner;
abstract class LibraryItem{
    abstract void getDetails();
}

class Book extends LibraryItem{
    String title;
    String author;
    int year;
    @Override
    void getDetails(){
        System.out.println("Book: "+title+" Author: "+author+",Year :"+year);
    }
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

class Magazine extends LibraryItem{
    String title;
    int issueNumber;
    @Override
    void getDetails(){
        System.out.println("Magazine: "+title+", IssueNumber : "+issueNumber);
    }

    Magazine(String title,int issueNumber){
        this.title = title;
        this.issueNumber = issueNumber;
    }
}
public class problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LibraryItem[] items = new LibraryItem[n];
        for(int i = 0; i < n; i++) {
            String type = sc.next();
            if(type.equals("Book")) {
                String title = sc.next();
                String author = sc.next();
                int year = sc.nextInt();
                items[i] = new Book(title, author, year);
            } else if(type.equals("Magazine")) {
                String title = sc.next();
                int issueNumber = sc.nextInt();
                items[i] = new Magazine(title, issueNumber);
            }
        }
    }
}
