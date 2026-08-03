// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
// Problem     Arrays - DS
// Difficulty  Easy
// Subdomain   Arrays
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:07 a.m.
// Technique   new-array-reverse-copy
// Time        O(N)
// Space       O(N)
// Insight     The implementation populates a new array by iterating through the input array in reverse order and mapping each element to the corresponding index in the new array.
// Interview   Before: "I would swap elements in-place to save memory." After: "I used an auxiliary array to store the reversed elements, which results in O(N) time and O(N) space complexity, ensuring the original array remains unchanged."
// Pitfalls    (1) Allocating a new array of size N consumes O(N) extra space, which may be inefficient for very large input arrays.  (2) The loop condition i >= 0 correctly processes the last index size-1, but failing to initialize the secondary index j to 0 would cause an ArrayIndexOutOfBoundsException.
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
