// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
// Problem     Birthday Cake Candles
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:06 a.m.
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
    
