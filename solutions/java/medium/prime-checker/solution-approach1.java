// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true
// Problem     Prime Checker
// Difficulty  Medium
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-20, 09:28 p.m.
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
