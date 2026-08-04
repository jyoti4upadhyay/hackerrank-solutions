// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-big-o/problem?isFullScreen=true
// Problem     Time Complexity: Primality
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:50 p.m.
// Technique   linear-trial-division
// Time        O(n)
// Space       O(1)
// Insight     The algorithm determines primality by checking if any integer from two up to n minus one divides n without a remainder.
// Interview   Before: "I will check for divisors up to n." After: "The current implementation uses O(n) time complexity, which is inefficient for large inputs; checking divisors only up to the square root of n would optimize this to O(sqrt(n))."
// Pitfalls    (1) The algorithm fails to meet the O(sqrt(n)) optimization suggested in the problem statement.  (2) The loop condition i < n results in unnecessary iterations for composite numbers.  (3) The guard n < 2 correctly handles the definition that primes must be greater than 1.
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
     * Complete the 'primality' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER n as parameter.
     */

    public static String primality(int n) {
        
    // Write your code here
    if(n<2){
        return "Not prime";
    }
    for(int i=2;i<n;i++){
        if(n%i==0){
            return "Not prime";
        }
    }
    return "Prime";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, p).forEach(pItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String result = Result.primality(n);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
