// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Problem     Java Stdin and Stdout II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:08 a.m.
// Technique   scanner-buffer-clearing
// Time        O(1)
// Space       O(1)
// Insight     The scanner consumes tokens sequentially, requiring an explicit call to nextLine() to clear the trailing newline character left in the buffer after reading numeric types.
// Interview   Before: "How do you handle mixed input types in Java?" After: "I use Scanner methods like nextInt() and nextDouble(), but I must call nextLine() to consume the leftover newline character before reading a string, ensuring O(1) time complexity for each input operation."
// Pitfalls    (1) Failing to consume the newline character after nextInt() or nextDouble() causes the subsequent nextLine() to return an empty string.  (2) Assuming nextLine() behaves like next() when reading input tokens, which leads to incorrect string capture.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
       
        scan.nextLine();
        String s=scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
