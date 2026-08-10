// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 11:38 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
         int start=0;
         int end=a.length()-1;
         String res=pallindrom(start,end,a);
         System.out.println(res);
        
    }
    public static String pallindrom(int start,int end,String s){
       
        if(start>=end){
            return "Yes";
        }
        else if(s.charAt(start)!=s.charAt(end)){
            return "No";
        }
        return pallindrom(start+1,end-1,s);
    } 
    
}



