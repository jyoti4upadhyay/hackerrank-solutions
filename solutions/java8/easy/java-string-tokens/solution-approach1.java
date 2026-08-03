// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:08 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        if(s.length()==0){
            System.out.println(0);
        }
        else{
            String str[]=s.split("[^A-Za-z]+");
            
            System.out.println(str.length);
            
            for(int i=0;i<str.length;i++){
                System.out.println(str[i]);  
                
            }
        }
    }
}

