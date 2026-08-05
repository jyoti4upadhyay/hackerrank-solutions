// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?isFullScreen=true
// Problem     Sorting: Bubble Sort
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 02:35 a.m.
// Technique   nested-loop-bubble-sort
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm performs a fixed number of passes over the array, incrementing a counter whenever an adjacent pair is found in decreasing order and swapped.
// Interview   Before: "I would use a built-in sort method to handle this." After: "The problem requires implementing the specific bubble sort logic provided, which has O(n^2) time complexity, to track the exact number of swaps performed during the sorting process."
// Pitfalls    (1) Failing to initialize the swap counter variable before the nested loops.  (2) Using an incorrect loop boundary for the inner loop, which causes an ArrayIndexOutOfBoundsException when accessing index j+1.  (3) Printing the output in a format that deviates from the exact string requirements specified in the problem statement.
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
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here
    int[] arr=new int[a.size()];
    for(int i=0;i<a.size();i++){
        arr[i]=a.get(i);
    }
    int swap=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swap++;
            } 
        }
    }
   System.out.println("Array is sorted in "+swap+" swaps.");
   System.out.println("First Element: "+arr[0]);
   System.out.println("Last Element: "+arr[arr.length-1]);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
