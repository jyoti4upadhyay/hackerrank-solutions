// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
// Problem     Java Primality Test
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 01:25 a.m.
// Technique   big-integer-probabilistic-primality
// Time        O(log^3 n)
// Space       O(log n)
// Insight     The BigInteger.isProbablePrime method utilizes a Miller-Rabin primality test to determine if a number is prime with a specified degree of certainty.
// Interview   Before: "I would implement a trial division loop up to the square root of n." After: "For very large integers, trial division is inefficient. Using BigInteger.isProbablePrime provides a probabilistic result in O(log^3 n) time, which is optimal for numbers with up to 100 digits."
// Pitfalls    (1) The isProbablePrime method is probabilistic, meaning it may return true for composite numbers with a very small probability defined by the certainty parameter.  (2) The certainty parameter of 10 provides a probability of error of at most 1 - 1/2^10, which may not be sufficient for cryptographic applications requiring higher precision.
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

        String n = bufferedReader.readLine();
        BigInteger bg=new BigInteger(n);
        if(bg.isProbablePrime(10)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
