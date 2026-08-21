// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true
// Problem     Java Exception Handling (Try-catch)
// Difficulty  Easy
// Subdomain   Exception Handling
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 11:16 a.m.
// Technique   try-catch-exception-handling
// Time        O(1)
// Space       O(1)
// Insight     The implementation utilizes a try-catch block to intercept and print specific exception types when integer division fails due to non-integer input or division by zero.
// Interview   Before: "How do you handle runtime errors in Java?" After: "I use try-catch blocks to catch specific exceptions like ArithmeticException or InputMismatchException, ensuring O(1) time complexity while gracefully handling invalid inputs or division by zero."
// Pitfalls    (1) Printing the full exception message for InputMismatchException instead of just the class name as required by the sample output.  (2) Failing to catch InputMismatchException when the input is not a valid 32-bit signed integer.  (3) Neglecting to handle the ArithmeticException specifically when the divisor is zero.
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
