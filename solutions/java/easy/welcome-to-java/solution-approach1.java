// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/welcome-to-java/problem?isFullScreen=true
// Problem     Welcome to Java!
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 03:11 a.m.
// Technique   standard-output-printing
// Time        O(1)
// Space       O(1)
// Insight     The program executes two sequential print operations to standard output to satisfy the required output format.
// Interview   Before: "How do I output text in Java?" After: "You use System.out.println to print strings to the console. This solution runs in O(1) time and O(1) space, as it performs a fixed number of print operations regardless of input."
// Pitfalls    (1) Failing to include the exact punctuation required in the strings "Hello, World." and "Hello, Java."  (2) Printing the two required lines on a single line instead of using println to ensure a newline character follows each statement.
// ──────────────────────────────────────────────────

public class Solution {

    public static void main(String[] args) {
      System.out.println("Hello, World.");
      System.out.println("Hello, Java.");
    }
}
