// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-17, 10:34 a.m.
// Technique   two-pointers-palindrome-check
// Time        O(n)
// Space       O(1)
// Insight     The algorithm verifies a palindrome by comparing characters at symmetric positions from both ends, terminating early if a mismatch is found.
// Interview   Before: "I would reverse the string and compare it to the original." After: "I used two pointers to compare characters from both ends, achieving O(n) time and O(1) space, which is more efficient than creating a new reversed string object."
// Pitfalls    (1) Using string concatenation inside a loop instead of two-pointer comparison, which increases space complexity to O(n).  (2) Incorrectly setting the loop condition to start <= end, which causes unnecessary comparisons for the middle character in odd-length strings.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String res=reverseString(A);
        System.out.println(res);
        
    }
    public static String reverseString(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return "No";
            }
            start++;
            end--;
        }
        
        return "Yes";
    }
}
 
