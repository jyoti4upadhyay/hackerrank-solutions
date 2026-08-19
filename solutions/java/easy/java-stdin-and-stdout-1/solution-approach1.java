// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
// Problem      Java Stdin and Stdout I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:01 a.m.
// Technique   scanner-while-loop-input
// Time        O(N)
// Space       O(1)
// Insight     The implementation uses a Scanner to continuously poll the standard input stream for integers until no further tokens remain, printing each integer immediately upon retrieval.
// Interview   Before: "I would use a fixed-size array to store the inputs." After: "Using a while loop with sc.hasNext() is more robust for unknown input sizes, achieving O(N) time complexity where N is the number of integers provided in the stream."
// Pitfalls    (1) Failing to handle the end of the input stream by omitting the hasNext() check.  (2) Assuming a fixed number of inputs when the problem statement implies an arbitrary number of lines.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            System.out.println(num);
        }
       
    }
}
