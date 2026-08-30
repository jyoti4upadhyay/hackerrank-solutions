// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/strange-code/problem?isFullScreen=true
// Problem     Strange Counter
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-30, 06:19 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'strangeCounter' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER t as parameter.
     */

    public static long strangeCounter(long t) {
    // Write your code here
    long startT=1;
    long startV=3;
    
    while(t>startT+startV-1){
        startT=startT+startV;
        startV=2*startV;  
    }
    return (startT+startV)-t; 
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
