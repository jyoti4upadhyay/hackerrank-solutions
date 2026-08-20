// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
// Problem     Java Abstract Class
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 09:59 a.m.
// Technique   concrete-class-inheritance
// Time        O(1)
// Space       O(1)
// Insight     The implementation satisfies the abstract class contract by providing a concrete subclass that overrides the abstract method and initializes the inherited title field.
// Interview   Before: "How do I handle abstract methods in Java?" After: "You must provide a concrete implementation for every abstract method in a subclass, resulting in O(1) time and space complexity for this specific title assignment."
// Pitfalls    (1) Failing to provide a concrete implementation for the abstract setTiltle method causes a compilation error.  (2) Declaring the MyBook class as public violates the problem constraint requiring it to be non-public.  (3) Attempting to instantiate the abstract Book class directly results in a compilation error.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        Book book=new MyBook(title);
        book.setTiltle(title);
        System.out.println("The title is: "+book.getTitle()); 
        
    }
}
abstract class Book{
    String title;
    abstract void setTiltle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    MyBook(String title){
        this.title=title;
    }
    @Override
    public void setTiltle(String title){
        this.title=title;   
    }
    public String getTitle(){
        return title;
    }
}
