// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/halloween-sale/problem?isFullScreen=true
// Problem     Halloween Sale
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-14, 10:34 p.m.
// Technique   iterative-price-reduction
// Time        O(s/m)
// Space       O(1)
// Insight     The algorithm accumulates game costs in a loop, decrementing the price by the discount until the minimum price is reached, then returns the count of games that fit within the budget.
// Interview   Before: "I should use a mathematical formula to calculate the number of games." After: "Since the price reduction is conditional and the budget is finite, a simple O(s/m) iterative simulation is efficient enough to handle the constraints while correctly accounting for the minimum price floor."
// Pitfalls    (1) The loop condition sum <= s causes an extra iteration, requiring the final count to be decremented by one to exclude the game that exceeded the budget.  (2) Failing to cap the price at m after the discount is applied leads to incorrect costs for subsequent games.  (3) The logic assumes the first game is always affordable; if s < p, the function incorrectly returns 0 instead of handling the initial budget check.
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
     * Complete the 'howManyGames' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER d
     *  3. INTEGER m
     *  4. INTEGER s
     */

    public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
    int count=0;
    int sum=0;
    while(sum<=s){
        sum=sum+p;
        count++;
        if(p>m){
            p=p-d;
        }
        if(p<=m){
            p=m;
            }
    }
    return count-1;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int p = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        int m = Integer.parseInt(firstMultipleInput[2]);

        int s = Integer.parseInt(firstMultipleInput[3]);

        int answer = Result.howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
