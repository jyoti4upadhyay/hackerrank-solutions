// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true
// Problem     Repeated String
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 10:57 p.m.
// Technique   modular-arithmetic-string-counting
// Time        O(L) where L is the length of string s
// Space       O(1)
// Insight     The total count of 'a' is derived by multiplying the full repetitions of the string by the count of 'a' in the base string, plus the count of 'a' in the remaining prefix.
// Interview   Before: "I would iterate through the string n times to count 'a'." After: "That would be O(n) and exceed time limits for large n. Instead, I calculate the frequency in the base string in O(L) time and use modular arithmetic to find the total in O(1) additional space."
// Pitfalls    (1) Using an integer instead of a long for the total count, which causes overflow when n is large.  (2) Failing to account for the remainder of n divided by the string length, leading to an incorrect count for partial repetitions.  (3) Assuming the string length is always greater than zero, which could cause a division by zero error if not handled.
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
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        if(s.equals("a")){
            return n;
        }  
        int aCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                aCount++;
            }
        }
        long total=n/s.length();
        if(n%s.length()!=0){
        long rem=n%s.length();
        int cnt=0;
        for(int i=0;i<rem;i++){
            if(s.charAt(i)=='a'){
                cnt++;
            } 
        }
        return cnt+total*aCount;
        }
        return total*aCount;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
