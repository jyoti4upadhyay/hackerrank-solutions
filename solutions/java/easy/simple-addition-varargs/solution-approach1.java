// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true
// Problem     Java Varargs - Simple Addition
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 11:59 a.m.
// Technique   varargs-summation-formatting
// Time        O(N)
// Space       O(1)
// Insight     The method iterates through the variable-length argument array to accumulate the sum while conditionally printing the plus sign separator only between elements.
// Interview   Before: "How would you handle a variable number of integer arguments in Java?" After: "I would use the varargs syntax (int... nums), which treats the input as an array. This allows O(N) summation and formatting in a single pass, ensuring the output matches the required string format for any number of inputs."
// Pitfalls    (1) Printing the plus sign after the final element due to an incorrect loop boundary condition.  (2) Failing to handle the varargs array as a standard array, which would prevent index-based separator logic.  (3) Incorrectly formatting the output string by omitting the equals sign or the final sum value.
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
