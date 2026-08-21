// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-exception-handling/problem?isFullScreen=true
// Problem     Java Exception Handling
// Difficulty  Easy
// Subdomain   Exception Handling
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 11:29 a.m.
// ──────────────────────────────────────────────────


class MyCalculator{
    public int power(int n,int p)throws Exception{
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        else if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
    
        int res=(int)Math.pow(n, p);
        return res;
        
    }
}

