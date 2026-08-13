// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true
// Problem     Utopian Tree
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 10:43 a.m.
// Technique   iterative-cycle-simulation
// Time        O(n)
// Space       O(1)
// Insight     The tree height updates by doubling during odd-numbered cycles and incrementing by one during even-numbered cycles, starting from an initial height of one.
// Interview   Before: "I would use a recursive approach to calculate the height." After: "An iterative approach is more efficient here, achieving O(n) time complexity and O(1) space complexity, while correctly handling the base case where n equals zero."
// Pitfalls    (1) Failing to account for the initial height of one when n equals zero.  (2) Confusing the growth order by swapping the doubling and incrementing logic for odd and even cycles.  (3) Using an incorrect loop range that fails to include the nth cycle.
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
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
       
        if(n==0){
            return 1; 
        }
        int h=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                h=h+1;   
            }
            else{
                h=h*2;
            }
        }
        return h;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
