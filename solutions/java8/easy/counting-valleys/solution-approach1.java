// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true
// Problem     Counting Valleys
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-31, 01:02 a.m.
// Technique   altitude-tracking-counter
// Time        O(n)
// Space       O(1)
// Insight     The algorithm increments the valley count only when an uphill step returns the altitude to sea level from below.
// Interview   Before: "I would track the current altitude and increment a counter whenever I return to zero." After: "I track the altitude and increment the valley count specifically when an 'U' step brings the altitude to zero, ensuring O(n) time and O(1) space complexity for any valid path length."
// Pitfalls    (1) Incrementing the valley count on any return to sea level, which incorrectly counts mountains as valleys.  (2) Failing to distinguish between returning to sea level from below versus returning from above.  (3) Assuming the path string length is always equal to the steps parameter without validating the input.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    int count=0;
    int sum=0;
    for(int i=0;i<steps;i++){
        if(path.charAt(i)=='U'){
            sum=sum+1;
            if(sum==0){
                count=count+1;
            }
        }
        else if(path.charAt(i)=='D'){
            sum=sum-1;
        }
       
    }
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
