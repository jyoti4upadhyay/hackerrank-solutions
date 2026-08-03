// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
// Problem     Birthday Cake Candles
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:06 a.m.
// Technique   two-pass-max-frequency-count
// Time        O(n)
// Space       O(n)
// Insight     The algorithm identifies the maximum candle height in a first pass and counts its occurrences in a second pass.
// Interview   Before: "I would sort the array to find the largest value and count duplicates." After: "Sorting takes O(n log n), but this two-pass approach achieves O(n) time complexity by tracking the maximum value and its frequency independently, which is optimal for the given constraints."
// Pitfalls    (1) Initializing max to 0 instead of Integer.MIN_VALUE would fail if all candle heights were negative, though constraints specify positive integers.  (2) Using a single pass to count occurrences requires resetting the counter whenever a new maximum is found, which this two-pass implementation avoids.
// ──────────────────────────────────────────────────

import java.util.*;


public class Candles{
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                continue;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
    
