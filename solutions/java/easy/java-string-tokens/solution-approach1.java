// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 01:17 p.m.
// Technique   regex-split-tokenization
// Time        O(N)
// Space       O(N)
// Insight     The implementation uses a regular expression to identify non-alphabetic delimiters, effectively isolating contiguous sequences of English letters as tokens while handling leading or trailing whitespace via trim.
// Interview   Before: "I would iterate through the string character by character to build tokens." After: "Using String.split with the regex [^a-zA-Z]+ is more idiomatic and efficient, achieving O(N) time complexity while correctly handling the specified delimiters and empty input cases."
// Pitfalls    (1) Failing to handle empty or whitespace-only strings, which causes the split method to return an array containing an empty string instead of zero tokens.  (2) Neglecting the trim method, which results in an incorrect leading empty token if the input string starts with non-alphabetic characters.  (3) Misinterpreting the regex [^a-zA-Z]+, which correctly treats any sequence of non-alphabetic characters as a single delimiter.
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

