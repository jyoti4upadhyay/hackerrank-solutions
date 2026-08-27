// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true
// Problem     Sherlock and Squares
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-28, 12:55 a.m.
// Technique   iterative-square-root-check
// Time        O(sqrt(b))
// Space       O(1)
// Insight     The algorithm counts integers whose squares fall within the inclusive range [a, b] by iterating through all positive integers i until i squared exceeds b.
// Interview   Before: "I would iterate through every number from a to b and check if each is a perfect square." After: "That is inefficient for large ranges. Instead, I iterate up to the square root of b, which is O(sqrt(b)), ensuring we only check relevant candidates."
// Pitfalls    (1) Using Math.pow for integer squares can lead to precision issues with very large inputs, though it suffices for the given constraints.  (2) The loop condition i*i <= b must be carefully checked to avoid integer overflow if b approaches Integer.MAX_VALUE.
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
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
    // Write your code here
    int count=0;
    for(int i=1;i*i<=b;i++){
        int sq=(int)Math.pow(i,2);
        if(sq>=a && sq<=b){
            count++;
        }
    }
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int a = Integer.parseInt(firstMultipleInput[0]);

                int b = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.squares(a, b);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
