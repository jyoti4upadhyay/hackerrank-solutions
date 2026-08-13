// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true
// Problem     Repeated String
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 10:57 p.m.
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
