// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true
// Problem     Cut the sticks
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-20, 04:51 p.m.
// Technique   sorting-and-linear-scan
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm identifies unique stick lengths by sorting the array and skipping duplicates, then calculates the remaining stick count for each unique length by subtracting the number of sticks already discarded.
// Interview   Before: "How would you simulate the stick cutting process?" After: "I sort the array to process unique lengths in increasing order, which allows me to count remaining sticks in O(n^2) time, ensuring we handle the n=1000 constraint efficiently."
// Pitfalls    (1) Failing to handle duplicate stick lengths correctly by not skipping indices where arr.get(i) equals arr.get(i-1).  (2) Miscalculating the number of remaining sticks by incorrectly counting elements smaller than the current shortest length.  (3) Assuming the input array is already sorted, which leads to incorrect iteration logic.
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
