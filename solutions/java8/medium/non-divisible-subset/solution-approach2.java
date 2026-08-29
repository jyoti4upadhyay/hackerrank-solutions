// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true
// Problem     Non-Divisible Subset
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-30, 12:01 a.m.
// Technique   remainder-frequency-map-greedy
// Time        O(n + k)
// Space       O(k)
// Insight     The algorithm counts remainder frequencies and greedily selects the larger count between complementary remainders i and k-i to maximize the subset size while ensuring no two elements sum to a multiple of k.
// Interview   Before: "How would you find the largest subset where no two elements sum to a multiple of k?" After: "I count the remainders modulo k and greedily pick the maximum of each pair (i, k-i), resulting in O(n + k) time complexity and O(k) space complexity."
// Pitfalls    (1) Failing to handle the remainder 0 case by capping it at 1, as multiple elements with remainder 0 would sum to a multiple of k.  (2) Incorrectly handling the middle remainder when k is even, where i equals k-i, requiring a cap of 1 to prevent self-sum divisibility.  (3) Assuming the loop range covers all remainders without accounting for the symmetry between i and k-i.
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
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here
    HashMap<Integer,Integer>hs=new HashMap<>();
    for(int i=0;i<s.size();i++){
        int rem=s.get(i)%k;
      if(hs.containsKey(rem)){
            hs.put(rem,hs.get(rem)+1);  
        }
        else{
            hs.put(rem,1);
        }
    }
    int res=0;
    res=res+Math.min(hs.getOrDefault(0,0),1);
    for(int i=1;i<=k/2;i++){
        int j=k-i;
        if(i==j){
            res=res+Math.min(hs.getOrDefault(i,0),1);
        }
        else{
            res=res+Math.max(hs.getOrDefault(i,0),hs.getOrDefault(j,0));
        }
    }
    return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
