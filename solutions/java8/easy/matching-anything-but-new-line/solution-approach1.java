// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem?isFullScreen=true
// Problem     Matching Anything But a Newline
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:34 a.m.
// ──────────────────────────────────────────────────



public class Solution {    

    public static void main(String[] args) {
        
        Tester tester = new Tester();
        tester.check("^([^\\n]{3}\\.){3}([^\\n]{3})$"); 
    
    }
}

