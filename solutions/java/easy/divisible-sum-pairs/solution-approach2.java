// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
// Problem     Divisible Sum Pairs
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 10:28 p.m.
// Technique   nested-loop-brute-force
// Time        O(n^2)
// Space       O(1)
// Insight     The algorithm iterates through all unique pairs (i, j) where i < j and increments a counter whenever the sum of the elements at these indices is divisible by k.
// Interview   Before: "I could use a frequency map to track remainders for O(n) time." After: "Given the constraints, a nested loop approach is sufficient with O(n^2) time complexity, ensuring we strictly satisfy the i < j condition for all pairs."
// Pitfalls    (1) Failing to maintain the i < j constraint by starting the inner loop at zero instead of i + 1.  (2) Assuming the input array is sorted, which is not guaranteed by the problem statement.  (3) Neglecting the integer overflow risk if the sum of two array elements exceeds the capacity of a 32-bit integer.
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
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int count=0;
    for(int i=0;i<ar.size()-1;i++){
        for(int j=i+1;j<ar.size();j++){
            if((ar.get(i)+ar.get(j))%k==0){
                count++;
            }
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

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
