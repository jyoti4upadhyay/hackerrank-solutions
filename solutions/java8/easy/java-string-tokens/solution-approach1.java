// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:08 a.m.
// Technique   regex-split-tokenization
// Time        O(N)
// Space       O(N)
// Insight     The implementation uses a regular expression to identify non-alphabetic delimiters, effectively isolating contiguous sequences of English letters as tokens.
// Interview   Before: "I would use a manual loop to check character types." After: "Using String.split with the regex [^A-Za-z]+ provides an O(N) solution that handles empty strings and multiple delimiters correctly, ensuring all tokens are captured as required by the problem constraints."
// Pitfalls    (1) Failing to handle empty input strings leads to an incorrect token count of one instead of zero.  (2) Using split without trimming the input string causes leading delimiters to produce an empty string as the first token.  (3) Misinterpreting the regex [^A-Za-z]+ as only splitting on spaces ignores other required delimiters like commas and apostrophes.
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

