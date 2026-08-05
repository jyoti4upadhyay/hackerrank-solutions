// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insertionsort2/problem?isFullScreen=true
// Problem     Insertion Sort - Part 2
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 01:27 a.m.
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
