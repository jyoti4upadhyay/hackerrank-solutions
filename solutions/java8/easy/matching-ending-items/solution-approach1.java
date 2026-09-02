// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-ending-items/problem?isFullScreen=true
// Problem     Matching Ending Items
// Difficulty  Easy
// Subdomain   Repetitions
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:58 a.m.
// Technique   regex-boundary-matching
// Time        O(n)
// Space       O(1)
// Insight     The regex pattern uses a character class for letters followed by the literal character s and the end-of-line anchor to ensure the string terminates correctly.
// Interview   Before: "How do I enforce a specific ending character while restricting the character set?" After: "Use the anchor $ to match the end of the string and a character class [A-Za-z] to restrict input, resulting in O(n) time complexity for the regex engine."
// Pitfalls    (1) Failing to include the asterisk quantifier allows only single-character strings ending in s.  (2) Including numbers or symbols in the character class violates the requirement that the string consists only of letters.  (3) Omitting the start anchor ^ allows the regex to match substrings rather than the entire string.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[A-Za-z]*s$"); // Use \\ instead of using \ 
    
    }
}

