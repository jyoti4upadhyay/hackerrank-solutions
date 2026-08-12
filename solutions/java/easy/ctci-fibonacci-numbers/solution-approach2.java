// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?isFullScreen=true
// Problem     Recursion: Fibonacci Numbers
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 11:42 a.m.
// Technique   naive-recursive-fibonacci
// Time        O(2^n)
// Space       O(n)
// Insight     The function computes the nth Fibonacci number by recursively summing the results of the two preceding terms until reaching the base cases of zero or one.
// Interview   Before: "I will implement the Fibonacci sequence using a simple recursive approach." After: "While this recursive solution is intuitive, it has an exponential time complexity of O(2^n) due to redundant calculations, making it inefficient for larger values of n compared to iterative or memoized approaches."
// Pitfalls    (1) The naive recursive implementation leads to redundant calculations of the same subproblems, resulting in exponential time complexity.  (2) The recursion depth of n causes a stack space complexity of O(n), which may trigger a StackOverflowError for very large inputs.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        // Complete the function.
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
