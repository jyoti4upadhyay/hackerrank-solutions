// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-x-y-repetitions/problem?isFullScreen=true
// Problem     Matching {x, y} Repetitions
// Difficulty  Easy
// Subdomain   Repetitions
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:54 a.m.
// Technique   regex-repetition-quantifiers
// Time        O(N)
// Space       O(1)
// Insight     The regex pattern uses anchored quantifiers to enforce strict sequence constraints on digit counts, letter counts, and trailing symbol counts.
// Interview   Before: "How do you enforce specific repetition counts in regex?" After: "Use the {x,y} quantifier. For this problem, ^[\d]{1,2}[A-Za-z]{3,}(\.){0,3}$ ensures O(N) time complexity by matching 1-2 digits, 3+ letters, and 0-3 dots at the end of the string."
// Pitfalls    (1) Failing to anchor the regex with ^ and $ allows partial matches that violate the string-wide constraints.  (2) Using {3,} instead of {3} for letters incorrectly allows more than three letters when the requirement is exactly three or more.  (3) Forgetting to escape the dot character with \. causes it to match any character instead of the literal period symbol.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[\\d]{1,2}[A-Za-z]{3,}(\\.){0,3}$"); // Use \\ instead of using \ 
    
    }
}

