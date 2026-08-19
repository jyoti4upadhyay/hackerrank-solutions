// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:20 p.m.
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



