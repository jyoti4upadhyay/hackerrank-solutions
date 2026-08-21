// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 01:17 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().isEmpty()){
            System.out.println(0);
        }
        else{
        s=s.trim();
        String[] word=s.split("[^a-zA-Z]+");
        scan.close();
        System.out.println(word.length);
        for(int i=0;i<word.length;i++){
            System.out.println(word[i]);
        }
        }
    }
}

