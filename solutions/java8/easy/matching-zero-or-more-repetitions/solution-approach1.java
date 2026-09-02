// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-zero-or-more-repetitions/problem?isFullScreen=true
// Problem     Matching Zero Or More Repetitions
// Difficulty  Easy
// Subdomain   Repetitions
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:55 a.m.
// Technique   regex-pattern-matching
// Time        O(N)
// Space       O(1)
// Insight     The regex pattern uses anchors to enforce strict start and end constraints while applying quantifier rules to digit, lowercase, and uppercase character classes.
// Interview   Before: "How do I enforce specific counts for character classes?" After: "Use quantifiers like {2,} for minimums and * for zero-or-more. This regex runs in O(N) time relative to string length, ensuring the string starts with at least two digits, followed by optional lowercase and uppercase sequences."
// Pitfalls    (1) Failing to include the start anchor ^ and end anchor $ results in partial matches rather than validating the entire string.  (2) Using \d* instead of \d{2,} incorrectly allows strings with fewer than two digits at the start.  (3) Omitting the escape character for backslashes in Java strings causes compilation errors when defining regex patterns.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2,}[a-z]*[A-Z]*$"); // Use \\ instead of using \ 
    
    }
}

