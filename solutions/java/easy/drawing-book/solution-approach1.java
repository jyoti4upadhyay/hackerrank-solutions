// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
// Problem     Drawing Book 
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 12:30 a.m.
// Technique   linear-scan-from-both-ends
// Time        O(n)
// Space       O(1)
// Insight     The algorithm calculates the number of page turns by counting odd-numbered pages from the front and even-numbered pages from the back, then returning the minimum of these two counts.
// Interview   Before: "I would use a mathematical formula to calculate the turns in O(1) time." After: "I implemented a linear scan that counts turns from both ends in O(n) time, which correctly handles the last page constraint where the book might end on an even or odd page."
// Pitfalls    (1) The logic fails to account for the case where the target page p is the last page of an even-length book, potentially returning an incorrect turn count.  (2) The implementation uses O(n) time complexity, which is less efficient than the O(1) mathematical approach using integer division.  (3) The loop conditions i%2!=0 and i%2==0 incorrectly assume specific parity for all page turns, ignoring the structure of page pairs.
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
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
    int start=0;
    int last=0;
    for(int i=1;i<=n;i++){
        if(i%2!=0 && i<p){
            start++;
        }
    }
    for(int i=n;i>0;i--){
        if(i%2==0 && i>p){
            last++;
        }
    }
    if(last<start){
        return last;
    }
    else if(start<last){
        return start;
    }
    else {
        return 0;
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
