// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true
// Problem     Java Varargs - Simple Addition
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 11:59 a.m.
// ──────────────────────────────────────────────────


class Add{
    public void add(int... nums){
        int sum=0;
        int i=0;
        for(int num:nums){
            System.out.print(num);
            sum=sum+num;
            if(i<nums.length-1){
            System.out.print("+");
            }
            i++;
        }
        System.out.print("="+sum);
        System.out.println();
        
        
    }
}
