// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-word-non-word/problem?isFullScreen=true
// Problem     Matching Word & Non-Word Character
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:49 a.m.
// Technique   regex-pattern-matching
// Time        O(n)
// Space       O(1)
// Insight     The regex pattern uses character classes to enforce a specific sequence of three word characters, one non-word character, ten word characters, one non-word character, and three word characters.
// Interview   Before: "How do I match a specific sequence of word and non-word characters?" After: "Use the \w and \W tokens to define the character types, resulting in O(n) time complexity where n is the string length."
// Pitfalls    (1) Failing to escape the backslash character as \\ in Java strings, which causes the regex engine to misinterpret the escape sequence.  (2) Miscounting the required number of word characters in the sequence, leading to incorrect pattern matching results.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(\\w){3}(\\W)(\\w){10}(\\W)(\\w){3}"); // Use \\ instead of using \ 
    
    }
}

