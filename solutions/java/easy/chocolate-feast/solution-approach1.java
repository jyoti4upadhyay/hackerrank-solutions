// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true
// Problem     Chocolate Feast 
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-15, 12:11 a.m.
// Technique   iterative-wrapper-exchange
// Time        O(log_m(n/c))
// Space       O(1)
// Insight     The total number of chocolates is calculated by summing initial purchases with subsequent exchanges, where each exchange cycle reduces the remaining wrapper count by a factor related to m.
// Interview   Before: "I would use a recursive function to simulate the exchange process." After: "I implemented an iterative approach with O(log_m(n/c)) time complexity, ensuring the loop terminates correctly when the remaining wrappers fall below the exchange threshold m."
// Pitfalls    (1) The special case handling for purchase equals m is logically redundant and potentially incorrect for cases where m is 1.  (2) The loop condition rem >= m fails to account for scenarios where m is 1, leading to an infinite loop.  (3) Integer division in the exchange logic may cause premature termination if the remainder logic is not strictly aligned with the problem's wrapper accumulation rules.
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
     * Complete the 'chocolateFeast' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c
     *  3. INTEGER m
     */

    public static int chocolateFeast(int n, int c, int m) {
    // Write your code here
    int purchase=n/c;
    if(purchase==m){
        purchase=purchase+1; 
        return purchase;
    }
    int rem=purchase;
    while(rem>=m){
        purchase=purchase+rem/m;
        rem=rem%m+rem/m;
                 
    }
    return purchase;

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int c = Integer.parseInt(firstMultipleInput[1]);

            int m = Integer.parseInt(firstMultipleInput[2]);

            int result = Result.chocolateFeast(n, c, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
