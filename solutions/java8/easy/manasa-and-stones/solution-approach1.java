// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/manasa-and-stones/problem?isFullScreen=true
// Problem     Manasa and Stones
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-31, 01:51 a.m.
// Technique   linear-iteration-with-list-filtering
// Time        O(n^2)
// Space       O(n)
// Insight     The final stone value is determined by the linear combination of n-1 steps using differences a and b, where the number of times b is chosen ranges from 0 to n-1.
// Interview   Before: "I could use recursion to explore all paths." After: "Since there are only n possible combinations of differences, I can iterate through the count of b-steps in O(n^2) time, including the list contains check, to find all unique final values."
// Pitfalls    (1) Using list.contains() inside the loop results in O(n^2) time complexity instead of O(n).  (2) Failing to account for the case where a equals b, which produces only one unique value.  (3) Miscalculating the number of steps as n instead of n-1, leading to incorrect stone values.
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
     * Complete the 'stones' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER a
     *  3. INTEGER b
     */

    public static List<Integer> stones(int n, int a, int b) {
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    //int s=Math.min(a,b);
    //int l=Math.max(b,a);
    for(int i=0;i<n;i++){
        int res=(i*b+(n-1-i)*a); 
        if(!ls.contains(res)){
            ls.add(res);
        }  
    }
    Collections.sort(ls);
    return ls;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int a = Integer.parseInt(bufferedReader.readLine().trim());

                int b = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> result = Result.stones(n, a, b);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
