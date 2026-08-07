// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
// Problem     Mini-Max Sum
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 01:08 a.m.
// Technique   sorting-and-linear-summation
// Time        O(N log N)
// Space       O(N)
// Insight     The algorithm sorts the input array to identify the four smallest elements for the minimum sum and the four largest elements for the maximum sum.
// Interview   Before: "I could iterate through the array five times, each time excluding one element to find the sums." After: "Sorting the array allows me to compute both sums in O(N log N) time, ensuring I handle the 64-bit integer requirement for large sums correctly."
// Pitfalls    (1) Failing to use long integers for the sum variables will cause integer overflow given the constraints.  (2) Assuming the input array is already sorted leads to incorrect minimum and maximum calculations.  (3) Using a fixed loop size of 4 without sorting the array first fails to identify the correct subset of elements.
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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int[] num=new int[arr.size()];
    for(int i=0;i<num.length;i++){
        num[i]=arr.get(i);
    }
    Arrays.sort(num);
    long minSum=0;
    long maxSum=0;
    for(int i=0;i<4;i++){
        minSum=minSum+num[i];    
    }
    int count=4;
    for(int j=num.length-1;j>0 && count>0;j--,count--){
        maxSum=maxSum+num[j];
    }
    System.out.println(minSum+" "+maxSum);
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
