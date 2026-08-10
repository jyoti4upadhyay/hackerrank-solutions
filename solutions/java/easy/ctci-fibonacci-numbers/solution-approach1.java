// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?isFullScreen=true
// Problem     Recursion: Fibonacci Numbers
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 10:54 a.m.
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
