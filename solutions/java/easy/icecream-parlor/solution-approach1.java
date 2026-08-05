// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/icecream-parlor/problem?isFullScreen=true
// Problem     Ice Cream Parlor
// Difficulty  Easy
// Subdomain   Search
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-05, 04:27 p.m.
// Technique   nested-loop-brute-force
// Time        O(n^2)
// Space       O(1)
// Insight     The algorithm iterates through all unique pairs of ice cream flavors to identify the two distinct indices whose costs sum exactly to the target amount m.
// Interview   Before: "I will use a hash map to store costs and find the complement in O(n) time." After: "Given the constraints and the requirement for 1-based indexing, a nested loop approach provides a simple O(n^2) solution that correctly identifies the unique pair of indices for the given target sum."
// Pitfalls    (1) The nested loop approach has O(n^2) time complexity, which may exceed time limits for larger input sizes.  (2) The implementation assumes a unique solution exists as per the problem statement, which is required for the logic to return exactly two indices.
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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here
    
    List<Integer> ls=new ArrayList<>();
    for(int i=0;i<arr.size()-1;i++){
        for(int j=i+1;j<arr.size();j++){
            int sum=arr.get(i)+arr.get(j);
            if(sum==m){
                ls.add(i+1);
                ls.add(j+1);
            }
        }
    }
    return ls;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int m = Integer.parseInt(bufferedReader.readLine().trim());

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            List<Integer> result = Result.icecreamParlor(m, arr);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
