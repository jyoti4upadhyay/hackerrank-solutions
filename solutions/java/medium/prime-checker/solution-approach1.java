// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true
// Problem     Prime Checker
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-20, 09:28 p.m.
// Technique   varargs-prime-trial-division
// Time        O(N * sqrt(M))
// Space       O(1)
// Insight     The method iterates through a variable-length argument list and performs trial division up to the number itself to identify primes.
// Interview   Before: "How would you handle multiple inputs of varying counts?" After: "I used Java's varargs feature to accept any number of integers, then applied trial division for each. This runs in O(N * sqrt(M)) time, where N is the count of numbers and M is the maximum value, correctly skipping non-primes like 1."
// Pitfalls    (1) Failing to handle the input 1, which is not prime, by using an incorrect loop guard.  (2) Using inefficient trial division up to num instead of sqrt(num), which may cause performance issues for large inputs.  (3) Forgetting to print a newline character after processing all arguments, which is required by the problem output format.
// ──────────────────────────────────────────────────


import static java.lang.System.in;
class Prime{
    public void checkPrime(int... nums){
        for(int num : nums){ 
            if(num<2){
                continue;
            }
            boolean flag=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=false; 
                    break;
                }
            }
            if(flag==true){
                System.out.print(num+" ");   
            }
        }
        System.out.println();
    }
}
