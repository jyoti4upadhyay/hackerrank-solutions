// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true
// Problem     Java Exception Handling (Try-catch)
// Difficulty  Easy
// Subdomain   Exception Handling
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 11:16 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int res=a/b;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println(e);  
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }
}
