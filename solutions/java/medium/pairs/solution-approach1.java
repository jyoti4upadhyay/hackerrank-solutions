// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/pairs/problem?isFullScreen=true
// Problem     Pairs
// Difficulty  Medium
// Subdomain   Search
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 03:34 p.m.
// Technique   hash-set-lookup
// Time        O(n)
// Space       O(n)
// Insight     The algorithm identifies pairs by storing all array elements in a hash set and checking for the existence of each element plus the target difference k.
// Interview   Before: "I could use nested loops to check every pair." After: "Using a HashSet allows O(n) time complexity by performing constant-time lookups for each element's complement, which is efficient given the unique integer constraint."
// Pitfalls    (1) Failing to account for the O(n) space complexity required by the HashSet when memory constraints are tight.  (2) Assuming the input array is sorted, which is not guaranteed by the problem statement.
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
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
    // Write your code here
    HashSet<Integer>hs=new HashSet<>();
    for(int i=0;i<arr.size();i++){
        hs.add(arr.get(i));
    }
    int count=0;
    for(int i=0;i<arr.size();i++){
        if(hs.contains(arr.get(i)+k)){
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

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
