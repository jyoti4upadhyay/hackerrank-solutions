// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
// Problem     Java Abstract Class
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 09:59 a.m.
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
