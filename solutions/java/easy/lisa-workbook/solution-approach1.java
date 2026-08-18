// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=true
// Problem     Lisa's Workbook
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-18, 11:52 a.m.
// Technique   nested-loop-page-tracking
// Time        O(N * max(arr))
// Space       O(1)
// Insight     The algorithm tracks the current page number by incrementing it whenever the problem index reaches a multiple of k or the total number of problems in the current chapter.
// Interview   Before: "I would calculate the page number using division and modulo arithmetic." After: "I used a nested loop to simulate the workbook structure, which runs in O(N * max(arr)) time, ensuring that each problem is checked against its page number correctly."
// Pitfalls    (1) Failing to increment the page number when the last problem of a chapter is reached if it is not a multiple of k.  (2) Incorrectly resetting the page number between chapters, as the problem states each chapter starts on a new page but the page count must persist globally.  (3) Misinterpreting the problem index range, which is 1-indexed, leading to off-by-one errors when comparing against the page number.
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
     * Complete the 'workbook' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY arr
     */

    public static int workbook(int n, int k, List<Integer> arr) {
    // Write your code here
    int page=1;
    int count=0;
    int chapter=1;
    for(int i=0;i<arr.size();i++){
        for(int j=1;j<=arr.get(i);j++){
          if(page==j){
            count++;   
          }
          if(j%k==0 || j==arr.get(i)){
            page++;
          }
          
        }
        chapter++;
    }
    return count;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
