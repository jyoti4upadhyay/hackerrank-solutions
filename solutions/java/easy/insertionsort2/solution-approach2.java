// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insertionsort2/problem?isFullScreen=true
// Problem     Insertion Sort - Part 2
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 01:57 p.m.
// Technique   iterative-insertion-sort
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm maintains a sorted prefix of the array by repeatedly shifting elements greater than the current target value to the right and inserting the target into its correct position.
// Interview   Before: "How do you sort an array in-place while printing the state after each insertion?" After: "I use an outer loop to pick the next element and an inner while loop to shift larger elements, resulting in O(n^2) time complexity and O(n) space for the array copy."
// Pitfalls    (1) Failing to print the array state after every single insertion as required by the problem statement.  (2) Incorrectly handling the inner loop boundary condition j >= 0, which leads to an ArrayIndexOutOfBoundsException when the target element is the smallest in the array.  (3) Misinterpreting the requirement to start printing only after the second element is placed, which this implementation correctly handles by starting the outer loop at index 1.
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
    int[] num=new int[arr.size()];
    for(int i=0;i<arr.size();i++){
        num[i]=arr.get(i);
    }
    
    for(int i=1;i<num.length;i++){
        int temp=num[i];
        int j=i-1;//sorted part
        while(j>=0 && num[j]>temp){
            num[j+1]=num[j];
            j--;
        }
        num[j+1]=temp;
        for(int k=0;k<num.length;k++){
                    System.out.print(num[k]+" ");
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
