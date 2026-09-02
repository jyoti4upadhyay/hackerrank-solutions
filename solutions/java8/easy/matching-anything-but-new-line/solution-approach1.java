// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem?isFullScreen=true
// Problem     Matching Anything But a Newline
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:34 a.m.
// Technique   regex-dot-metacharacter-pattern
// Time        O(n)
// Space       O(1)
// Insight     The regex pattern uses the dot metacharacter to match any single character except a newline, structured to match the specific sequence of three characters followed by a literal dot repeated three times, ending with three characters.
// Interview   Before: "How do you match any character except a newline in a regex?" After: "You use the dot metacharacter, which matches any character except the newline. This solution validates the string in O(n) time complexity, where n is the length of the input string."
// Pitfalls    (1) Failing to escape the literal dot character in the regex pattern, which would cause it to match any character instead of the literal period.  (2) Misinterpreting the dot metacharacter as matching newline characters, which violates the problem constraint that the dot excludes newlines.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Tester tester = new Tester();
        tester.check("^([^\\n]{3}\\.){3}([^\\n]{3})$"); 
    
    }
}

