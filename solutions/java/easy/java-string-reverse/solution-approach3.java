// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:20 p.m.
// Technique   two-pointers-comparison
// Time        O(n)
// Space       O(1)
// Insight     The algorithm verifies a palindrome by comparing characters at symmetric indices moving inward until the pointers meet or a mismatch is found.
// Interview   Before: "I could reverse the string and compare it to the original." After: "Using two pointers is more efficient, achieving O(n) time and O(1) space by comparing characters from both ends simultaneously, which handles the palindrome check without extra memory allocation."
// Pitfalls    (1) Using an incorrect loop condition like start < end instead of start <= end may fail to verify the middle character in odd-length strings.  (2) Failing to initialize the flag as true before the loop will result in incorrect output for valid palindromes.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int start=0;
        int end=A.length()-1;
        boolean flag=true;
        while(start<=end){
            if(A.charAt(start)!=A.charAt(end)){
                flag=false;
                break;
            }
            start++;
            end--;
        }
        if(flag==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }    
        
    }
}



