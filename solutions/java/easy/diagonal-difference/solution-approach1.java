// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
// Problem     Diagonal Difference
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 12:15 a.m.
// Technique   nested-loop-and-index-decrement
// Time        O(n^2)
// Space       O(1)
// Insight     The primary diagonal sum is calculated using a nested loop where row index equals column index, while the secondary diagonal sum is computed in a single pass by decrementing the column index.
// Interview   Before: "I would iterate through the matrix twice to find both diagonal sums." After: "I can optimize the secondary diagonal calculation to O(n) by using a single loop with a decrementing index, resulting in an overall O(n^2) time complexity for the matrix traversal."
// Pitfalls    (1) The nested loop for the primary diagonal performs unnecessary O(n^2) iterations instead of O(n).  (2) The secondary diagonal index j must be initialized to arr.size() - 1 to correctly access elements from the top-right to the bottom-left.
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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum1=0;
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr.size();j++){
            if(i==j){
                sum1=sum1+arr.get(i).get(j);
            }
        }
    }
    int sum2=0;
    int j=arr.size()-1;
    for(int i=0;i<arr.size();i++){
        sum2=sum2+arr.get(i).get(j);
        j--;  
    }
    
    int diff=Math.abs(sum1-sum2);
    return diff;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
