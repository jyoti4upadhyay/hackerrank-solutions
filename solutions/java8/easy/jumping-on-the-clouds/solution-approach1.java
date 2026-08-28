// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true
// Problem     Jumping on the Clouds
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-28, 09:29 p.m.
// Technique   greedy-lookahead-traversal
// Time        O(n)
// Space       O(1)
// Insight     The algorithm greedily prioritizes two-step jumps to minimize the total count, falling back to a single-step jump only when the two-step target is a thunderhead.
// Interview   Before: "I would use dynamic programming to find the shortest path." After: "Since the game guarantees a win and allows jumps of size 1 or 2, a greedy approach is optimal. It runs in O(n) time and O(1) space, always checking the furthest possible safe cloud first."
// Pitfalls    (1) Failing to account for the final jump when the loop terminates at the second-to-last cloud.  (2) Accessing index i+2 without verifying it is within the bounds of the list size.  (3) Assuming a two-step jump is always possible, ignoring the requirement to check if the target cloud is a thunderhead.
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
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
    int jump=0;
    int i=0;
    while(i<c.size()-2){
        if(c.get(i+2)==0){
            jump++;
            i=i+2;
        }
        else{
           if(c.get(i+1)==0){
            jump++;
            i=i+1;
           } 
        }
    }
    if(i==c.size()-2 && c.get(c.size()-1)==0){
        return jump+1;
    }
    return jump;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
