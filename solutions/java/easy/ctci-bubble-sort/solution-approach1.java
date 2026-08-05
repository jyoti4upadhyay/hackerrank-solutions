// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?isFullScreen=true
// Problem     Sorting: Bubble Sort
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 02:35 a.m.
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
