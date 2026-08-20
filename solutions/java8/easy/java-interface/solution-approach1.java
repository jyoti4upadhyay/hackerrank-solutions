// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
// Problem     Java Interface
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-20, 02:24 p.m.
// Technique   linear-scan-divisor-summation
// Time        O(n)
// Space       O(1)
// Insight     The implementation iterates through all integers from one to n, accumulating the value of each integer that divides n without a remainder.
// Interview   Before: "I should use a square root optimization to find divisors." After: "Since n is at most 1000, a simple O(n) linear scan is efficient enough to calculate the sum of divisors correctly."
// Pitfalls    (1) Failing to include the number n itself as a divisor in the summation loop.  (2) Using an incorrect loop range that excludes n, violating the requirement to sum all divisors including n.  (3) Declaring the MyCalculator class as public, which violates the specific constraint provided in the problem statement.
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

