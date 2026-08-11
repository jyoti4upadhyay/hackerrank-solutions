// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true
// Problem     Extra Long Factorials
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 01:34 a.m.
// Technique   big-integer-iterative-multiplication
// Time        O(n^2 log n)
// Space       O(n log n)
// Insight     The implementation iteratively computes the factorial by multiplying the current BigInteger accumulator by each integer from two up to n.
// Interview   Before: "I would use a long variable to store the factorial." After: "Since n can be up to 100, the result exceeds 64-bit limits, so I used BigInteger to handle arbitrary-precision arithmetic, resulting in O(n^2 log n) time complexity due to the cost of multiplying large numbers."
// Pitfalls    (1) Using primitive types like long or int will cause overflow for n > 20.  (2) Failing to initialize the BigInteger accumulator to BigInteger.ONE results in an incorrect product of zero.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
    // Write your code here
    BigInteger fact=BigInteger.ONE;
    for(int i=2;i<=n;i++){
        fact=fact.multiply(BigInteger.valueOf(i));
    }
    System.out.println(fact);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
