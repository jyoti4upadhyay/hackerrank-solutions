// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true
// Problem     Minimum Distances
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-14, 03:22 p.m.
// Technique   nested-loop-brute-force
// Time        O(n^2)
// Space       O(1)
// Insight     The algorithm iterates through all possible pairs of indices to identify matching elements and tracks the minimum absolute difference between their positions.
// Interview   Before: "I could use a nested loop to compare every pair." After: "This O(n^2) approach checks every pair for equality, returning -1 if no matches are found, which satisfies the problem constraints for n up to 1000."
// Pitfalls    (1) Failing to initialize the minimum distance variable to Integer.MAX_VALUE, which prevents correct identification of the first valid pair found.  (2) Returning 0 instead of -1 when no matching elements exist, violating the problem requirement for the no-match case.  (3) Using the == operator instead of .equals() for Integer objects, which may fail for values outside the integer cache range.
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
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
    // Write your code here
    int minD=Integer.MAX_VALUE;
    for(int i=0;i<a.size();i++){
        for(int j=i+1;j<a.size();j++){
        if(a.get(i).equals(a.get(j))){
            int diff=Math.abs(j-i);
            if(minD>diff){
                minD=diff;
            }
        }
    }
    }
    if(minD==Integer.MAX_VALUE){
        return -1;
    }
    return minD;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
