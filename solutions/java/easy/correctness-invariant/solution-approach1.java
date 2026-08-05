// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/correctness-invariant/problem?isFullScreen=true
// Problem     Correctness and the Loop Invariant
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 01:31 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >=0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
