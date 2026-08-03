// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/equal-stacks/problem?isFullScreen=true
// Problem     Equal Stacks
// Difficulty  Easy
// Subdomain   Stacks
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:55 a.m.
// Technique   three-pointer-greedy-reduction
// Time        O(n1 + n2 + n3)
// Space       O(1)
// Insight     The algorithm iteratively reduces the height of the tallest stack by removing its top cylinder until all three stacks reach an identical total height.
// Interview   Before: "I would use a hash set to find common prefix sums." After: "Since the stacks are ordered, I can use three pointers to greedily reduce the tallest stack. This runs in O(n1 + n2 + n3) time and O(1) space, correctly handling the empty stack case where the height becomes zero."
// Pitfalls    (1) Failing to account for the case where all stacks become empty, resulting in a height of zero.  (2) Assuming the stacks are sorted by height, which is not guaranteed by the problem statement.  (3) Incorrectly updating the pointer index before subtracting the cylinder height from the current sum.
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
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<h1.size();i++){
            sum1=sum1+h1.get(i);
        }
        for(int j=0;j<h2.size();j++){
            sum2=sum2+h2.get(j);
        }
        for(int k=0;k<h3.size();k++){
            sum3=sum3+h3.get(k);
        }
        int i=0;
        int j=0;
        int k=0;
        while(!(sum1==sum2 && sum2==sum3)){
            if(sum1>=sum2 && sum1>=sum3){
                sum1=sum1-h1.get(i);
                i++;
            }
            else if(sum2>=sum1 && sum2>=sum3){
                sum2=sum2-h2.get(j);
                j++;
            }
            else{
                sum3=sum3-h3.get(k);
                k++;
            }
        }
        return sum1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
