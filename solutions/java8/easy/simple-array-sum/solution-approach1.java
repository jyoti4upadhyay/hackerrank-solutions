// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
// Problem     Simple Array Sum
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 01:58 a.m.
// Technique   linear-accumulation-loop
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a running total by iterating through the input array exactly once and adding each element to the accumulator variable.
// Interview   Before: "I would use a loop to iterate through the array and add each element to a sum variable." After: "This approach runs in O(n) time and O(n) space, where n is the array size, ensuring we process every element exactly once to compute the total sum."
// Pitfalls    (1) Using an integer for the sum variable may cause overflow if the sum of array elements exceeds the maximum value of a 32-bit signed integer.  (2) Failing to account for the input size n being zero, although the loop correctly handles this by not executing and returning the initial sum of zero.
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
