// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/bigger-is-greater/problem?isFullScreen=true
// Problem     Bigger is Greater
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 02:47 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static String biggerIsGreater(String w) {
        char[] arr=w.toCharArray();
    // Write your code here
    int len=w.length();
    int small=len-2;
    while(small>=0 && arr[small]>=arr[small+1]){
        small--;                                                
    }
    if(small<0){
        return "no answer";
    }
    int big=len-1;
    while(arr[big]<=arr[small]){
        big--;
    }
    char temp=arr[small];
    arr[small]=arr[big];
    arr[big]=temp;
    
    int end=len-1;
    int start=small+1;
    while(end>start){
        char tem=arr[start];
        arr[start]=arr[end];
        arr[end]=tem;
        start++;
        end--;
    }
    
    return new String(arr);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            String w = bufferedReader.readLine();

            String result = Result.biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
