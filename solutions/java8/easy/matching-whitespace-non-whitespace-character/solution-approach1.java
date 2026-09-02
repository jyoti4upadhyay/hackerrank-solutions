// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-whitespace-non-whitespace-character/problem?isFullScreen=true
// Problem     Matching Whitespace & Non-Whitespace Character
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:47 a.m.
// Technique   regex-pattern-matching
// Time        O(n)
// Space       O(1)
// Insight     The regex pattern uses character classes to enforce a strict sequence of two non-whitespace characters followed by one whitespace character, repeated twice, and ending with two non-whitespace characters.
// Interview   Before: "How do you match a specific sequence of whitespace and non-whitespace characters?" After: "I use the \S and \s tokens to define the pattern XXxXXxXX, which runs in O(n) time relative to the input string length, ensuring each character is checked against the specified constraints."
// Pitfalls    (1) Failing to escape the backslash character as \\ in Java strings, which causes the regex engine to misinterpret the escape sequence.  (2) Miscounting the number of repetitions required by the pattern XXxXXxXX, leading to incorrect matches for strings of different lengths.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(\\S){2}(\\s)(\\S){2}(\\s)(\\S){2}"); // Use \\ instead of using \ 

    }
}

