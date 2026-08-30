// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/beautiful-triplets/problem?isFullScreen=true
// Problem     Beautiful Triplets
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-30, 05:05 p.m.
// Technique   nested-loop-list-tracking
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm iterates through each element as a potential triplet start and greedily collects subsequent elements that maintain the constant difference d.
// Interview   Before: "I could use a hash set to check for the existence of x+d and x+2d in O(n) time." After: "My current implementation uses nested loops to track the sequence, resulting in O(n^2) time complexity, which is acceptable given the constraints on n."
// Pitfalls    (1) The nested loop approach creates a new ArrayList for every starting element, which is inefficient for large inputs.  (2) The logic relies on the input array being sorted to correctly identify triplets using the difference d.  (3) The condition ls.size() >= 3 incorrectly counts sequences longer than three elements as a single beautiful triplet.
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
     * Complete the 'beautifulTriplets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int beautifulTriplets(int d, List<Integer> arr) {
    // Write your code here
    int count=0;
    for(int i=0;i<arr.size();i++){
        List<Integer>ls=new ArrayList<>();
        ls.add(arr.get(i));
        for(int j=i;j<arr.size();j++){
            int diff=Math.abs(ls.get(ls.size()-1)-arr.get(j));
            if(diff==d){
                ls.add(arr.get(j));
            }
        }
        if(ls.size()>=3){
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

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
