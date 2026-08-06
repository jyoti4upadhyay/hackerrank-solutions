// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
// Problem     Simple Array Sum
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 04:49 p.m.
// Technique   linear-summation-loop
// Time        O(n)
// Space       O(1)
// Insight     The algorithm maintains a running total by iterating through the list exactly once, adding each element to the accumulator until the end of the list is reached.
// Interview   Before: "I would use a recursive approach to sum the elements." After: "A simple iterative loop is more efficient here, providing O(n) time complexity and O(1) auxiliary space, which is optimal for processing the entire array once."
// Pitfalls    (1) Integer overflow may occur if the sum of the array elements exceeds the maximum value of a 32-bit signed integer.  (2) The implementation assumes the input list is non-null and contains valid integers as per the problem constraints.
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
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
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
