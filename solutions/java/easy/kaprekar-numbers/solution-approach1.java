// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true
// Problem     Modified Kaprekar Numbers
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-14, 02:33 p.m.
// Technique   digit-splitting-math-simulation
// Time        O((q-p) * log10(q^2))
// Space       O(q-p)
// Insight     The algorithm determines if a number is a modified Kaprekar number by squaring it and splitting the result into two parts using a power-of-ten divisor based on the original number's digit count.
// Interview   Before: I would use string conversion to split the square. After: I used modulo and division by 10^d to extract the right and left parts, which is more efficient at O(log10(q^2)) per number, ensuring we handle the range [p, q] correctly.
// Pitfalls    (1) Using int instead of long for the square calculation will cause integer overflow for numbers larger than 46340.  (2) Failing to handle the case where the split results in a zero left part, which is correctly managed by the loop logic.  (3) Printing an extra space after the last number in the list, though the problem statement implies a space-separated format.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    for(int i=p;i<=q;i++){
        //digit count 
        int digit=0;
        int num=i;
        while(num!=0){
            int rem=num%10;
            digit++;
            num=num/10;
        }
        long sq=(long)i*i;
        long n=sq;
        long sum=0;
        int pow=(int)Math.pow(10,digit);
        while(n!=0){
            long rem=n%pow;
            sum=sum+rem;
            n=n/pow;
        }
        if(sum==i){
            ls.add(i);
        }
    }
    if(ls.size()==0){
        System.out.println("INVALID RANGE");
    }
    else{
    for(int i=0;i<ls.size();i++){
        System.out.print(ls.get(i)+" ");
    }
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
