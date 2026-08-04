// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true
// Problem     Caesar Cipher
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-05, 03:41 a.m.
// Technique   modulo-arithmetic-character-shifting
// Time        O(n)
// Space       O(n)
// Insight     The algorithm normalizes the rotation factor using modulo 26 and applies a character-specific offset to preserve case while leaving non-alphabetic symbols unchanged.
// Interview   Before: "I would iterate through the string and use a large if-else block to handle every possible character shift." After: "I normalize the shift factor with k % 26 and use character arithmetic to map letters within their respective ASCII ranges, achieving O(n) time complexity while correctly ignoring non-alphabetic symbols."
// Pitfalls    (1) Failing to normalize the rotation factor k using modulo 26, which causes incorrect shifts for values greater than 26.  (2) Applying the shift to non-alphabetic characters, which violates the requirement that symbols remain unencrypted.  (3) Incorrectly calculating the character offset by failing to subtract the base ASCII value ('A' or 'a') before applying the modulo operator.
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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    k=k%26;
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='A' && ch<='Z'){
            char d=(char)('A'+((ch-'A'+k)%26));
            sb.append(d);
        }
        else if(ch>='a' && ch<='z'){
            char c=(char)('a'+((ch-'a'+k)%26));
            sb.append(c);
        }
        else {
            sb.append(ch);
        }
    }
    return sb.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
