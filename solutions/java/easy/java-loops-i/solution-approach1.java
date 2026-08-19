// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:23 a.m.
// Technique   for-loop-multiplication
// Time        O(1)
// Space       O(1)
// Insight     The loop iterates exactly ten times, calculating the product of the input integer and the current loop index to satisfy the required output format.
// Interview   Before: "I would use a while loop to print the multiples." After: "A for loop is more idiomatic here, providing O(1) time complexity as it performs exactly ten iterations regardless of the input N."
// Pitfalls    (1) Incorrect loop bounds, such as starting at 0 or ending before 10, will fail to print the required ten multiples.  (2) Failing to format the output string exactly as 'N x i = result' will result in a presentation error.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }

        bufferedReader.close();
    }
}
