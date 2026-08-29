// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true
// Problem     Non-Divisible Subset
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-29, 11:47 p.m.
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
    HashMap<Integer,Integer>count=new HashMap<>();
    for(int i=0;i<s.size();i++){
        int mod=s.get(i)%k;
        if(count.containsKey(mod)){
            count.put(mod,count.get(mod)+1);
        }
        else{
            count.put(mod,1);
        }
    }
    int max=0;
    max=max+Math.min(count.getOrDefault(0,0),1);
    for(int i=1;i<=k/2;i++){
        int j=k-i;
        if(i==j){
            max=max+Math.min(count.getOrDefault(i,0),1);
        }
        else{
             max=max+(Math.max(count.getOrDefault(i,0)
             ,count.getOrDefault(j,0)));
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
