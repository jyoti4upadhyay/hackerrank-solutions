// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
// Problem     Simple Array Sum
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-07, 04:44 p.m.
// Technique   linear-accumulation-loop
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a running total by iterating through the list exactly once and adding each element to the accumulator.
// Interview   Before: "I would use a stream to sum the list." After: "I used a simple for-loop to achieve O(n) time complexity, which is optimal for processing all n elements in the array."
// Pitfalls    (1) Integer overflow may occur if the sum of the array elements exceeds the maximum value of a 32-bit signed integer.  (2) The code assumes the input list is not null, which could trigger a NullPointerException if the list is uninitialized.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int simpleArraySum(List<Integer> ar) {
    // Write your code 
    int sum=0;
    for(int i=0;i<ar.size();i++){
        sum=sum+ar.get(i);
    }
    return sum;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
