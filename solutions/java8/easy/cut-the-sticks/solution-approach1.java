// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true
// Problem     Cut the sticks
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-20, 04:49 p.m.
// Technique   sorting-and-linear-scan
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm identifies unique stick lengths by sorting the input and iterates through them to count how many sticks remain greater than or equal to the current minimum length.
// Interview   Before: "I would use a frequency map to track stick counts." After: "Sorting allows us to process unique lengths in O(n log n) time, though this specific implementation uses an O(n^2) nested loop approach to count remaining sticks at each iteration, which is acceptable given the constraint n ≤ 1000."
// Pitfalls    (1) Failing to handle duplicate stick lengths correctly by not using the equality check to skip already processed values.  (2) Misinterpreting the requirement to count sticks remaining before each cut, leading to an incorrect number of iterations.  (3) Assuming the input list is already sorted, which is not guaranteed by the problem statement.
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
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    List<Integer>ls=new ArrayList<>();
    for(int i=0;i<arr.size();i++){
        if(i>0 && arr.get(i).equals(arr.get(i-1))){
            continue;
        }
        List<Integer>res=new ArrayList<>(arr);
        int count=0;
            for(int j=0;j<res.size();j++){
                int diff=res.get(j)-arr.get(i);
                if(diff<0){
                    count++;      
                }   
            }   
        ls.add(arr.size()-count);    
    }
    return ls;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
