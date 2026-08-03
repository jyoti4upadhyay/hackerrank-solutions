// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
// Problem     Simple Array Sum
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 01:58 a.m.
// ──────────────────────────────────────────────────

import java.util.*;



public class SumOfArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
