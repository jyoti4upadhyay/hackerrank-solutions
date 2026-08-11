// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true
// Problem     Find Digits
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 01:26 a.m.
// Technique   modulo-digit-extraction
// Time        O(d) where d is the number of digits in…
// Space       O(1)
// Insight     The algorithm iteratively extracts each digit of the integer using modulo arithmetic and increments a counter if the digit is non-zero and evenly divides the original number.
// Interview   Before: "I could convert the integer to a string to iterate through digits." After: "Using modulo and division is more efficient as it avoids string allocation, achieving O(d) time complexity where d is the number of digits, while correctly handling the division-by-zero constraint."
// Pitfalls    (1) Failing to explicitly check for zero digits, which causes an ArithmeticException due to division by zero.  (2) Modifying the original input variable n instead of using a copy, which prevents the modulo check against the original value.
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
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
    int count=0;
    int num=n;
    while(num!=0){
        int rem=num%10;
        if(rem!=0 && n%rem==0){
            count++;
        }
        num=num/10;
    }
    return count;
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
