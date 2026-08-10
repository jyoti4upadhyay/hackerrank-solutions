// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tutorial-intro/problem?isFullScreen=true
// Problem     Intro to Tutorial Challenges
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 12:02 a.m.
// Technique   linear-scan-search
// Time        O(n)
// Space       O(n)
// Insight     The algorithm performs a linear search through the sorted list to identify the index where the target value V matches the current element.
// Interview   Before: "I would use binary search to find the index in O(log n) time." After: "Since the constraints are small (n ≤ 1000), a linear scan with O(n) time complexity is sufficient to locate the unique element V as specified in the problem statement."
// Pitfalls    (1) Assuming binary search is required when the constraints n ≤ 1000 allow for a simpler O(n) linear scan.  (2) Failing to account for the zero-based indexing requirement explicitly mentioned in the problem statement.
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
     * Complete the 'introTutorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER V
     *  2. INTEGER_ARRAY arr
     */

    public static int introTutorial(int V, List<Integer> arr) {
    // Write your code here
    for(int i=0;i<arr.size();i++){
        if(V==arr.get(i)){
            return i;
        }
    }
    return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int V = Integer.parseInt(bufferedReader.readLine().trim());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.introTutorial(V, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
