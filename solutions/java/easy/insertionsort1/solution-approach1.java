// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true
// Problem     Insertion Sort - Part 1
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 12:55 a.m.
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
