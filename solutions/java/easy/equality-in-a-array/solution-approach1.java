// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true
// Problem     Equalize the Array
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-14, 11:44 a.m.
// Technique   nested-loop-frequency-counting
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm identifies the most frequent element by comparing every pair of integers in the array and calculates the minimum deletions as the difference between the total array size and the maximum frequency found.
// Interview   Before: "I could use a hash map to count frequencies in linear time." After: "This nested loop approach achieves the goal by checking every element against all others, resulting in O(n^2) time complexity, which is acceptable given the constraints on n."
// Pitfalls    (1) The O(n^2) time complexity may exceed execution time limits for large input sizes defined in the constraints.  (2) Creating a new ArrayList inside the outer loop for every element is memory-inefficient and unnecessary for simply counting frequencies.
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
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    int count=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.size();i++){
        List<Integer>ls=new ArrayList<>();
        for(int j=0;j<arr.size();j++){
            if(arr.get(i)==arr.get(j)){
                ls.add(arr.get(j));
            }
        }
        if(max<ls.size()){
            max=ls.size();
        }
    }
    count=arr.size()-max;
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
