// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
// Problem     Java Interface
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-20, 03:17 p.m.
// ──────────────────────────────────────────────────


class MyCalculator implements AdvancedArithmetic{
    
    public int divisor_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;    
    }
}

