// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/30-abstract-classes/problem?isFullScreen=true
// Problem     Day 13: Abstract Classes
// Difficulty  Easy
// Subdomain   30 Days of Code
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 09:51 a.m.
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
