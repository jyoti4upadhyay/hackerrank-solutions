// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true
// Problem     Pangrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 04:11 p.m.
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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    s=s.toLowerCase();
    int [] arr=new int[26];
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='z'){
            arr[ch-'a']++;
        }
    }
    for(int i=0;i<26;i++){
        if(arr[i]==0){
            return "not pangram";
        }
    }
    return "pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
