// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
// Problem     Staircase
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 12:44 a.m.
// Technique   nested-loop-string-construction
// Time        O(n^2)
// Space       O(1)
// Insight     The algorithm prints n lines where each line i contains n-i-1 leading spaces followed by i+1 hash symbols to achieve right-alignment.
// Interview   Before: "How would you print a right-aligned staircase of size n?" After: "I use nested loops to print n-i-1 spaces followed by i+1 hashes per row, resulting in O(n^2) time complexity and O(1) auxiliary space, ensuring the last line has zero leading spaces as required."
// Pitfalls    (1) Incorrectly calculating the number of spaces as n-i instead of n-i-1, which would shift the entire staircase one position to the right.  (2) Failing to account for the requirement that the last line must have zero leading spaces, which is handled by the n-i-1 loop condition.  (3) Using an incorrect loop range for the hash symbols, which would result in a staircase of the wrong width or height.
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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int j=n-i-1;j<n;j++){
            System.out.print("#");
        }
         System.out.println();
    }
   
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
