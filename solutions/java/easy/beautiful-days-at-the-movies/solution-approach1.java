// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true
// Problem     Beautiful Days at the Movies
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 11:17 p.m.
// Technique   integer-reversal-simulation
// Time        O((j-i) * log10(j))
// Space       O(1)
// Insight     The algorithm iterates through the inclusive range [i, j], calculating the reverse of each integer using modulo and division operations to verify the divisibility condition against k.
// Interview   Before: "I would convert the integer to a string to reverse it." After: "Using arithmetic operations to reverse the integer is more efficient, resulting in O((j-i) * log10(j)) time complexity, which is optimal for the given constraints."
// Pitfalls    (1) Failing to include the upper bound j in the loop, as the problem specifies an inclusive range [i, j].  (2) Assuming the reverse of a number with trailing zeros, like 120, is 021 rather than 21, which the arithmetic approach handles correctly.  (3) Neglecting the absolute value requirement when calculating the difference between the number and its reverse.
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
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        int count=0;
        for(int idx=i;idx<=j;idx++){
            int num=idx;
            int rev=0;
            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            
            if(Math.abs(idx-rev)%k==0){
                count++;
            }
            
        }
        return count;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
