// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-digits-non-digit-character/problem?isFullScreen=true
// Problem     Matching Digits & Non-Digit Characters
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:44 a.m.
// Technique   regex-pattern-matching
// Time        O(n)
// Space       O(1)
// Insight     The regex pattern uses digit character classes and non-digit character classes to enforce a specific sequence of two digits, one non-digit, two digits, one non-digit, and four digits.
// Interview   Before: How do you validate a string format with specific character types? After: Use regex character classes like \d for digits and \D for non-digits. This approach runs in O(n) time relative to the string length, ensuring the exact sequence xxXxxXxxxx is matched.
// Pitfalls    (1) Failing to escape the backslash character in Java strings, which requires double backslashes to represent a single regex escape sequence.  (2) Miscounting the required number of digits or non-digits specified in the pattern xxXxxXxxxx.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("\\d{2}\\D\\d{2}\\D\\d{4}"); // Use \\ instead of using \ 
    
    }
}

