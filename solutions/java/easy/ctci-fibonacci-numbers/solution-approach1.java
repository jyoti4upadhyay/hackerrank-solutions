// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?isFullScreen=true
// Problem     Recursion: Fibonacci Numbers
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 10:54 a.m.
// Technique   naive-recursive-fibonacci
// Time        O(2^n)
// Space       O(n)
// Insight     The function computes the nth Fibonacci number by recursively summing the results of the two preceding indices until reaching the base cases of zero or one.
// Interview   Before: "I will implement the Fibonacci sequence using a simple recursive approach." After: "This naive recursive solution has O(2^n) time complexity due to redundant calculations, which is inefficient for large n compared to iterative or memoized approaches."
// Pitfalls    (1) The exponential time complexity O(2^n) causes a timeout for larger values of n.  (2) The recursive stack depth reaches O(n), which may lead to a StackOverflowError for very large inputs.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        // Complete the function.
        if(n==1 || n==0){
            return n;
        }
        int fib=fibonacci(n-1)+fibonacci(n-2);
        return fib;
        
        
      
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
