// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/30-abstract-classes/problem?isFullScreen=true
// Problem     Day 13: Abstract Classes
// Difficulty  Easy
// Subdomain   30 Days of Code
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 09:51 a.m.
// Technique   abstract-class-inheritance
// Time        O(1)
// Space       O(1)
// Insight     The MyBook class extends the abstract Book class by providing a concrete implementation of the abstract display method and initializing the additional price field via a parameterized constructor.
// Interview   Before: "How do I implement an abstract class in Java?" After: "You define a subclass that extends the abstract class, calls the super constructor, and provides the implementation for all abstract methods. This approach has O(1) time and space complexity for the display operation."
// Pitfalls    (1) Adding a public access modifier to the MyBook class causes a compilation error because the problem requires package-private access.  (2) Failing to call the super constructor in the MyBook class prevents the initialization of the title and author fields inherited from the Book class.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book book=new MyBook(title,author,price);
        book.display();
    }
}
abstract class Book{
    String title;
    String author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    abstract void display();
}

class MyBook extends Book{
    int price;
    MyBook(String title,String author,int price){
        super(title,author);
        this.price=price;     
    }
    @Override
   public void display(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
   }
}
