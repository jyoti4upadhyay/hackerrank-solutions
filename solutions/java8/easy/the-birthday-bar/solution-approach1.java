// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
// Problem     Subarray Division
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-20, 03:34 p.m.
// Technique   sliding-window-fixed-size-sum
// Time        O(n * m)
// Space       O(1)
// Insight     The algorithm iterates through all possible contiguous subarrays of length m and increments a counter whenever the sum of the elements equals the target birth day d.
// Interview   Before: "I would use a nested loop to check every segment of length m." After: "The implementation uses a sliding window approach with O(n * m) time complexity, ensuring it correctly handles cases where the segment length m exceeds the chocolate bar size n by returning zero immediately."
// Pitfalls    (1) Failing to handle the case where the birth month m is greater than the number of chocolate squares n, which causes an index out of bounds error.  (2) Incorrectly setting the outer loop boundary to s.size() instead of s.size() - m, which leads to an IndexOutOfBoundsException when accessing elements beyond the list size.
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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        if(m>s.size()){
            return 0;
        }
        int count=0;
        for(int i=0;i<=s.size()-m;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum=sum+s.get(j);
            }
            if(sum==d){
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

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
