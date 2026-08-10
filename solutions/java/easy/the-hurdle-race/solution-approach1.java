// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true
// Problem     The Hurdle Race
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 03:21 a.m.
// Technique   linear-scan-max-finding
// Time        O(n)
// Space       O(1)
// Insight     The algorithm identifies the maximum hurdle height and calculates the difference from the character's natural jump capacity, returning zero if the capacity is already sufficient.
// Interview   Before: "I should sort the list to find the tallest hurdle." After: "Sorting is unnecessary; a single O(n) linear scan to find the maximum value is sufficient to determine the required doses, ensuring optimal O(n) time and O(1) space complexity."
// Pitfalls    (1) Returning a negative value if the maximum hurdle height is less than k, which violates the requirement that the result must be 0 or more.  (2) Initializing the maximum variable to 0 instead of Integer.MIN_VALUE, which would fail if all hurdle heights were negative.
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
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
    int max=Integer.MIN_VALUE;
    for(int i=0;i<height.size();i++){
        if(max<height.get(i)){
            max=height.get(i);
        }
    }
    if(max>k){
        return max-k;
    }
     return 0;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] heightTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> height = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightTemp[i]);
            height.add(heightItem);
        }

        int result = Result.hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
