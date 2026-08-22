// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
// Problem     Java BigInteger
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 01:29 a.m.
// Technique   java-biginteger-arithmetic
// Time        O(N^1.585)
// Space       O(N)
// Insight     The solution utilizes the BigInteger class to perform arbitrary-precision arithmetic on numeric strings that exceed the capacity of primitive long types.
// Interview   Before: "I would use long or double to store these inputs." After: "Since the inputs can have 200 digits, I must use BigInteger to avoid overflow, which handles addition and multiplication in sub-quadratic time complexity relative to the number of digits N."
// Pitfalls    (1) Attempting to parse input strings into primitive types like long or double will cause overflow errors for inputs exceeding 19 digits.  (2) Failing to handle the input as a string before passing it to the BigInteger constructor prevents processing of numbers larger than 64 bits.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        String num2=sc.next();
        BigInteger bg1=new BigInteger(num);
        BigInteger bg2=new BigInteger(num2);
        
        BigInteger add=bg1.add(bg2);
        BigInteger mul=bg1.multiply(bg2);
        System.out.println(add);
        System.out.println(mul);
    }
}
