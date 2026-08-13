// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true
// Problem     Viral Advertising
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 11:07 a.m.
// Technique   iterative-simulation-with-accumulator
// Time        O(n)
// Space       O(1)
// Insight     The cumulative number of likes is calculated by iteratively updating the daily shared count and likes based on the previous day's results, starting with a base case of two likes on day one.
// Interview   Before: "I would use recursion to track the daily growth." After: "Since the state only depends on the previous day, an iterative approach with O(n) time and O(1) space is more efficient, especially given the constraints on n."
// Pitfalls    (1) The loop starts at day two, meaning the initial two likes from day one must be added to the sum separately.  (2) Integer division in Java truncates towards zero, which correctly implements the floor function required by the problem statement.
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
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n){
    // Write your code here 
    //on day1 5 ppl
    int sum=0;
    int share=5;
    int like=2;
    for(int i=2;i<=n;i++){
        share=like*3;
        like=share/2;
        sum=sum+like;
    }
    return sum+2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
