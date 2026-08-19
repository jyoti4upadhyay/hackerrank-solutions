// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 10:27 p.m.
// Technique   string-manipulation-and-lexicographical-compari…
// Time        O(N+M)
// Space       O(N+M)
// Insight     The solution leverages the String.compareTo method to determine lexicographical order and uses substring concatenation to capitalize the first character of each input string.
// Interview   Before: "How would you compare two strings lexicographically and modify their casing?" After: "I use compareTo for O(N+M) lexicographical comparison and substring concatenation for O(N+M) capitalization, ensuring the first character is transformed while preserving the remainder of the string."
// Pitfalls    (1) Using the == operator instead of compareTo for lexicographical comparison will compare object references rather than character sequences.  (2) Calling substring(1) on a single-character string is valid in Java, but calling charAt(0) on an empty string would throw a StringIndexOutOfBoundsException.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA=A.length();
        int lenB=B.length();
        int sum=lenA+lenB;
        System.out.println(sum);
        int res=A.compareTo(B);
        if(res>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        String str1=Character.toUpperCase(A.charAt(0))+A.substring(1);
        String str2=Character.toUpperCase(B.charAt(0))+B.substring(1);
        System.out.println(str1+" "+str2);
        
        
          
        
    }
}



