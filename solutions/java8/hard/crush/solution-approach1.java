// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true
// Problem     Array Manipulation
// Difficulty  Hard
// Subdomain   Arrays
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:09 a.m.
// Technique   difference-array-prefix-sum
// Time        O(n + m)
// Space       O(n)
// Insight     The algorithm uses a difference array to record range updates at boundaries, then computes the prefix sum to reconstruct the final values and identify the maximum.
// Interview   Before: "I would iterate through the range for every query, resulting in O(n*m) time complexity." After: "By using a difference array, I can process each query in O(1) and perform a single O(n) pass to find the maximum, achieving O(n + m) total time complexity."
// Pitfalls    (1) Failing to allocate the array with size n+2, which causes an ArrayIndexOutOfBoundsException when accessing the k+1 index for queries ending at n.  (2) Using an integer array instead of a long array, which leads to integer overflow when the sum of values exceeds the 32-bit signed integer limit.  (3) Incorrectly iterating the prefix sum loop, as the problem uses 1-based indexing and requires processing up to index n inclusive.
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
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr=new long[n+2];
        int p=0,k=0,val=0;
        for(int i=0;i<queries.size();i++){
             p=queries.get(i).get(0);
             k=queries.get(i).get(1);
             val=queries.get(i).get(2);
             
              arr[p] += val;
              arr[k + 1] -=val ;    
        }
        long max=0;
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            } 
        }
        return max;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
