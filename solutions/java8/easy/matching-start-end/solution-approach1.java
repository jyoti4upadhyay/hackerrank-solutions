// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-start-end/problem?isFullScreen=true
// Problem     Matching Start & End
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:51 a.m.
// Technique   regex-pattern-matching
// Time        O(n)
// Space       O(1)
// Insight     The regex pattern enforces a strict structure by anchoring the start with a digit, requiring exactly four word characters, and terminating with a literal dot at the end of the string.
// Interview   Before: "How do you validate a fixed-length string format?" After: "Use regex anchors ^ and $ to ensure the string length is exactly 6, starting with a digit and ending with a literal dot, resulting in O(n) time complexity where n is the string length."
// Pitfalls    (1) Failing to escape the dot character with a backslash, which causes it to match any character instead of the literal period.  (2) Miscounting the total length by forgetting that the digit and the dot count as two of the six required characters.  (3) Using the wrong quantifier for word characters, which would allow strings of incorrect lengths.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d[\\w]{4}\\.$"); // Use \\ instead of using \ 
    
    }
}

