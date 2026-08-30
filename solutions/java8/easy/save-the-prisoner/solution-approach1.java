// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true
// Problem     Save the Prisoner!
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-30, 04:17 p.m.
// Technique   modular-arithmetic-offset-calculation
// Time        O(1)
// Space       O(1)
// Insight     The solution calculates the final chair by determining if the sweets are exhausted before or after wrapping around the circular table, using modular arithmetic to handle the cyclic distribution.
// Interview   Before: "I would simulate the distribution by iterating through all m sweets." After: "That would be O(m) time, which fails for large inputs. Instead, I use O(1) modular arithmetic to find the position, accounting for the starting chair s and the total number of prisoners n."
// Pitfalls    (1) Failing to handle the case where the remainder is zero, which correctly maps to the last chair n.  (2) Incorrectly calculating the offset when the number of sweets m is less than or equal to the remaining seats from the start position s.  (3) Assuming standard 0-based indexing when the problem explicitly uses 1-based chair numbering.
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
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
    // Write your code 
    
        int start=n-s+1; //(7-2+1)
        if(m<=start){
            return s+m-1;
        }
        m=Math.abs(m-start);
        int rem=m%n;
        if(rem==0){
            return n;
        }
        return rem;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int s = Integer.parseInt(firstMultipleInput[2]);

                int result = Result.saveThePrisoner(n, m, s);

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
