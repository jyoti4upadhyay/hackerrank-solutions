// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-specific-string/problem?isFullScreen=true
// Problem     Matching Specific String
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:18 a.m.
// Technique   literal-string-regex-matching
// Time        O(N)
// Space       O(1)
// Insight     The regex engine performs a literal character-by-character comparison to identify the exact sequence hackerrank within the provided test string.
// Interview   Before: How do I match a specific word in a string using regex? After: You simply provide the literal string as the pattern, which runs in O(N) time where N is the length of the test string, ensuring case-sensitive matching for the target sequence.
// Pitfalls    (1) Failing to account for case sensitivity as the problem explicitly requires matching hackerrank exactly.  (2) Assuming the regex pattern requires special anchors like ^ or $ when the task only asks to match the substring anywhere in the input.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(hackerrank)"); 
    
    }
}

