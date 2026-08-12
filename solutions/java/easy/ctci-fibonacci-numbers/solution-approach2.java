// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?isFullScreen=true
// Problem     Recursion: Fibonacci Numbers
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 11:42 a.m.
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
