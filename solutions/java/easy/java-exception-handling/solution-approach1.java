// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-exception-handling/problem?isFullScreen=true
// Problem     Java Exception Handling
// Difficulty  Easy
// Subdomain   Exception Handling
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 11:29 a.m.
// Technique   exception-handling-conditional-guards
// Time        O(1)
// Space       O(1)
// Insight     The implementation validates input constraints using sequential conditional checks before performing the power calculation via the standard library.
// Pitfalls    (1) Failing to check the n=0 and p=0 condition before the negative check, which would incorrectly trigger the negative exception.  (2) Using an incorrect exception message string that does not match the exact requirements for the zero or negative cases.  (3) Returning an integer result without considering potential overflow for large inputs, though the problem constraints imply standard integer usage.
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

