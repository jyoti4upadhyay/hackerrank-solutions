// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
// Problem     Java BigInteger
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 01:29 a.m.
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
