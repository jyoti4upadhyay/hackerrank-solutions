// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
// Problem     Arrays - DS
// Difficulty  Easy
// Subdomain   Arrays
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:07 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr);
        
    }
    public static void rev(int[] arr){
        int size=arr.length;
        int[] re=new int[size];
        int j=0;
        for(int i=size-1;i>=0;i--){
            re[j]=arr[i];
            j++;
        }
        
        for(int k=0;k<re.length;k++){
            System.out.print(re[k]+" ");
        }
        
        
    }
}
