// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/30-recursion/problem?isFullScreen=true
// Problem     Day 9: Recursion 3  
// Difficulty  Easy
// Subdomain   30 Days of Code
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 10:38 a.m.
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
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
    // Write your code here
    if(n==1){
        return 1;
    }
    return n*factorial(n-1);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
