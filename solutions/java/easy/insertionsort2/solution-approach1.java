// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insertionsort2/problem?isFullScreen=true
// Problem     Insertion Sort - Part 2
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 01:27 a.m.
// Technique   iterative-insertion-sort
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm maintains a sorted prefix of the array by repeatedly shifting elements larger than the current target value to the right and inserting the target into its correct sorted position.
// Interview   Before: "How do you sort an array in-place while showing every step?" After: "I use insertion sort, which builds a sorted subarray by shifting elements. It has O(n^2) time complexity, which is acceptable for the given constraints, and I print the array state after each insertion as required."
// Pitfalls    (1) Failing to print the array after every iteration starting from the second element as specified in the problem.  (2) Incorrectly handling the inner loop condition j >= 0, which leads to an ArrayIndexOutOfBoundsException when the target element is smaller than all elements in the sorted prefix.  (3) Using an incorrect loop range for the outer loop, which must start at index 1 to correctly process the array.
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
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
    int[] arr1=new int[n];
    for(int p=0;p<arr.size();p++){
        arr1[p]=arr.get(p);
    }
    for(int i=1;i<arr1.length;i++){
        int temp=arr1[i];
        int j=i-1;
        while(j>=0 && temp<arr1[j]){
            arr1[j+1]=arr1[j];
            j--;
        }
        arr1[j+1]=temp;
        for(int p=0;p<arr1.length;p++){
            System.out.print(arr1[p]+" ");
        }
        System.out.println();
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

        Result.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
