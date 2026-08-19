// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 10:27 p.m.
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



