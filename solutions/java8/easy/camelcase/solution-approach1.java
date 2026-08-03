// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
// Problem     CamelCase
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:07 a.m.
// Technique   regex-lookahead-split
// Time        O(n)
// Space       O(n)
// Insight     The implementation uses a positive lookahead regular expression to split the string at every uppercase letter, effectively isolating each word into an array element.
// Interview   Before: "I would iterate through the string and increment a counter whenever I encounter an uppercase character." After: "Using a regex lookahead split is more concise, achieving O(n) time complexity by identifying word boundaries based on the CamelCase rule where each subsequent word starts with an uppercase letter."
// Pitfalls    (1) The regex split approach creates an array of size n, which may lead to memory overhead for very large strings compared to a single-pass counter.  (2) The implementation assumes the input string is non-empty, as an empty string would return an array of length one instead of zero.
// ──────────────────────────────────────────────────

import java.util.*;


public class CamelCase{
    
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        camelWord(str);
    }
    public static void camelWord(String str){
        String[] arr=str.split("(?=[A-Z])");
        System.out.println(arr.length);
    }
}
