// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true
// Problem     Modified Kaprekar Numbers
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-14, 02:33 p.m.
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
