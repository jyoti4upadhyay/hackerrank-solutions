// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/the-time-in-words/problem?isFullScreen=true
// Problem     The Time in Words
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 04:06 p.m.
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
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    // Write your code here
    String str="";
    String[] arr={
        "zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"
    };
    String[] min={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
   // String[] min={"ten","twenty","thirty"};
    
    if(m==00){
        str=arr[h]+" o' clock ";
    }
    else if(m==01){
        str="one minute past "+arr[h];
    }
    else if(m==15){
        str="quarter past "+arr[h];
        }
    else if(m>1 && m<30){
        str=min[m]+" minutes past "+arr[h];
    }
    else if(m==30){
        str="half past "+arr[h];
    }
    else if(m==45){
        str="quarter to "+arr[h+1];
    }
    else if(m>30){
        int mi=60-m;
        str=min[mi]+" minutes to "+arr[h+1];   
    }
    return str;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
