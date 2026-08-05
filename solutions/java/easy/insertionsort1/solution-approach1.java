// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true
// Problem     Insertion Sort - Part 1
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 12:55 a.m.
// Technique   in-place-insertion-sort-simulation
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm maintains a sorted prefix by repeatedly shifting elements greater than the target value to the right until the correct insertion position is found.
// Interview   Before: "I would implement a standard insertion sort." After: "I implemented the specific brute-force insertion required by the problem, which prints the array state at every shift, resulting in O(n^2) time complexity for the worst-case scenario where the target element is the smallest."
// Pitfalls    (1) Failing to print the array state after every individual shift operation as required by the problem statement.  (2) Incorrectly handling the loop termination condition when the target element is smaller than all elements in the sorted portion.  (3) Overwriting the target element before it is stored in a temporary variable.
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
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=arr.get(i);
    }
    for(int i=a.length-1;i>=0;i--){
        int temp=a[i];
        int j=i-1;
        while(j>=0 && temp<a[j]){
            a[j+1]=a[j];
            j--;
            for(int k=0;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
        a[j+1]=temp;
        }
         for(int p=0;p<a.length;p++){
            System.out.print(a[p]+" ");
         }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
