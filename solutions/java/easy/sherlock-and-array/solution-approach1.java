// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/sherlock-and-array/problem?isFullScreen=true
// Problem     Sherlock and Array
// Difficulty  Easy
// Subdomain   Search
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-07, 01:21 p.m.
// Technique   prefix-sum-tracking
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a running left sum and a decreasing right sum, checking for equality at each index after subtracting the current element from the total sum.
// Pitfalls    (1) Failing to initialize the right sum as the total sum minus the current element before the equality check.  (2) Incorrectly updating the left sum before checking the equality condition, which violates the requirement that the current element is excluded from both sides.  (3) Assuming the array must have more than one element, whereas the logic correctly handles single-element arrays by comparing zero to zero.
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
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
    // Write your code here
    int[] num =new int[arr.size()];
    int tsum=0;
    //list=>array && total sum
    for(int i=0;i<arr.size();i++){
        num[i]=arr.get(i);
        tsum=tsum+num[i];
    }
    int lsum=0;//0
    int rsum=tsum;
    for(int i=0;i<num.length;i++){
        int mid=num[i];
        rsum=rsum-mid;
        if(lsum<rsum){
            lsum=lsum+mid;
        }
        else if(lsum==rsum){
            return "YES";
        }
         
    }
    return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            String result = Result.balancedSums(arr);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
