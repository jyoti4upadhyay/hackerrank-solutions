// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true
// Problem     Cut the sticks
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-28, 03:52 a.m.
// Technique   iterative-list-reduction
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm repeatedly records the current list size, identifies the minimum value, and simultaneously removes all occurrences of that minimum while decrementing all remaining elements by that value.
// Interview   Before: "How would you simulate the stick cutting process?" After: "I used an iterative approach that removes elements in O(n) per pass, leading to O(n^2) time complexity, which is efficient enough given the constraint n ≤ 1000."
// Pitfalls    (1) Failing to decrement the loop index i after removing an element from the list causes the iterator to skip the next element.  (2) Modifying the list size during iteration without careful index management leads to an IndexOutOfBoundsException or incorrect processing of elements.
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
    List<Integer>ls=new ArrayList<>();
    while(!arr.isEmpty()){
        ls.add(arr.size());
        int min=Collections.min(arr);
        for(int i=0;i<arr.size();i++){
            if(min==arr.get(i)){
                arr.remove(i);
                i--;  
            }
            else{
                arr.set(i,arr.get(i)-min);
            }
        }
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
