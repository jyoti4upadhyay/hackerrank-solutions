// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Problem     Java End-of-file
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 01:02 p.m.
// Technique   scanner-has-next-loop
// Time        O(N)
// Space       O(1)
// Insight     The scanner continuously checks for available input tokens using hasNext, allowing the program to process an arbitrary number of lines until the end-of-file condition is met.
// Interview   Before: "How do I handle an unknown number of input lines in Java?" After: "Use Scanner.hasNext() to loop until EOF. This approach runs in O(N) time, where N is the total number of lines, ensuring efficient processing without needing to know the input size beforehand."
// Pitfalls    (1) Using next() instead of nextLine() will only read individual words rather than entire lines, causing incorrect output formatting.  (2) Failing to increment the line counter variable inside the loop results in all lines being labeled with the number one.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(i+" " +str);
            i++;
        }
        
    }
}
