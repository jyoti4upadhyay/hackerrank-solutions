// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
// Problem     A Very Big Sum
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-07, 10:59 p.m.
// Technique   linear-accumulation-long-sum
// Time        O(n)
// Space       O(n)
// Insight     The implementation iterates through the input list once, accumulating values into a 64-bit long variable to prevent overflow during summation.
// Interview   Before: "I will use an integer to store the sum." After: "I used a long to store the sum, ensuring O(n) time complexity, which correctly handles the constraint where individual elements reach 10^10 and the total sum exceeds the 32-bit integer limit."
// Pitfalls    (1) Using a 32-bit integer for the sum variable will cause overflow when the total exceeds 2,147,483,647.  (2) Failing to parse input elements as long integers will result in NumberFormatException or overflow during the initial list population.
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
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
    long sum=0;
    for(int i=0;i<ar.size();i++){
        sum=sum+(ar.get(i));
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

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
