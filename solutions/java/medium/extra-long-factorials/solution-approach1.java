// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true
// Problem     Extra Long Factorials
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 01:34 a.m.
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
