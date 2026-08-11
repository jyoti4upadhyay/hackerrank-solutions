// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/bigger-is-greater/problem?isFullScreen=true
// Problem     Bigger is Greater
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 02:47 a.m.
// Technique   next-lexicographical-permutation
// Time        O(N)
// Space       O(N)
// Insight     The algorithm identifies the rightmost character that is smaller than its successor, swaps it with the smallest character to its right that is larger, and reverses the remaining suffix to achieve the next lexicographical permutation.
// Interview   Before: "How do I find the next permutation of a string?" After: "By scanning from right to left to find the first pivot, swapping it with the smallest larger element, and reversing the suffix, we achieve the next lexicographical string in O(N) time, handling cases with no answer when the string is non-increasing."
// Pitfalls    (1) Failing to handle the case where the entire string is in descending order, which requires returning no answer.  (2) Incorrectly identifying the pivot point by using an improper comparison operator in the first while loop.  (3) Forgetting to reverse the suffix after the swap, which prevents the result from being the smallest possible lexicographical increase.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static String biggerIsGreater(String w) {
        char[] arr=w.toCharArray();
    // Write your code here
    int len=w.length();
    int small=len-2;
    while(small>=0 && arr[small]>=arr[small+1]){
        small--;                                                
    }
    if(small<0){
        return "no answer";
    }
    int big=len-1;
    while(arr[big]<=arr[small]){
        big--;
    }
    char temp=arr[small];
    arr[small]=arr[big];
    arr[big]=temp;
    
    int end=len-1;
    int start=small+1;
    while(end>start){
        char tem=arr[start];
        arr[start]=arr[end];
        arr[end]=tem;
        start++;
        end--;
    }
    
    return new String(arr);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            String w = bufferedReader.readLine();

            String result = Result.biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
