// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
// Problem     Java Primality Test
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 01:25 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bg=new BigInteger(n);
        if(bg.isProbablePrime(10)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
