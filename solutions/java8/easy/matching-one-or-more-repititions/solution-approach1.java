// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-one-or-more-repititions/problem?isFullScreen=true
// Problem     Matching One Or More Repetitions
// Difficulty  Easy
// Subdomain   Repetitions
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:56 a.m.
// Technique   regex-pattern-matching
// Time        O(N)
// Space       O(1)
// Insight     The regex pattern uses anchors to enforce strict sequence requirements for digits, uppercase letters, and lowercase letters at the start, middle, and end of the string respectively.
// Interview   Before: "How do I enforce specific character counts at string boundaries?" After: "Use anchors like ^ and $ with the + quantifier to ensure the entire string matches the sequence of digits, uppercase, and lowercase letters in O(N) time."
// Pitfalls    (1) Failing to use the ^ and $ anchors allows partial matches that do not span the entire string.  (2) Using * instead of + would incorrectly allow zero occurrences of the required character classes.  (3) Omitting the escape character for backslashes in Java strings causes compilation errors for regex metacharacters.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{1,}[A-Z]{1,}[a-z]{1,}$"); // Use \\ instead of using \ 
    
    }
}

