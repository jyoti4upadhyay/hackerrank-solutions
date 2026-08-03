// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
// Problem     Plus Minus
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:26 a.m.
// Technique   linear-scan-counter
// Time        O(n)
// Space       O(1)
// Insight     The algorithm iterates through the list once to maintain three separate counters for positive, negative, and zero values, then calculates their ratios relative to the total list size.
// Interview   Before: "I would use a hash map to store counts of positive, negative, and zero values." After: "A single linear pass with three integer counters is more efficient, achieving O(n) time and O(1) space complexity while ensuring the required six-decimal precision output."
// Pitfalls    (1) Performing integer division instead of casting to double, which truncates the ratio to zero.  (2) Failing to format the output to exactly six decimal places as required by the problem statement.  (3) Assuming the input list size is always greater than zero, which could lead to division by zero errors.
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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int zero=0,pos=0,neg=0;
    int len=arr.size();
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)==0){
            zero++;
        }
        else if(arr.get(i)>0){
            pos++;
        }
        else {
            neg++;
        }
    }
    System.out.printf("%.6f",(double)pos/len);
    System.out.println();
    System.out.printf("%.6f",(double)neg/len);
    System.out.println();
    System.out.printf("%.6f",(double)zero/len);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
