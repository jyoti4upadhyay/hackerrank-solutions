// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true
// Problem     Sequence Equation
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-28, 02:16 a.m.
// Technique   nested-linear-search
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm identifies the index y such that p[y-1] equals x, then finds the index j such that p[j-1] equals y, effectively solving p[p[j]] = x for each x from 1 to n.
// Interview   Before: "I would use a hash map to store value-to-index mappings for O(1) lookups." After: "The current implementation uses nested loops to find indices, resulting in O(n^2) time complexity, which is acceptable given the constraints where n is up to 50."
// Pitfalls    (1) Confusing 1-based indexing of the problem statement with the 0-based indexing of the Java List.  (2) Assuming the input list is sorted, which contradicts the problem statement that elements are distinct but not necessarily ordered.
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
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    int x=1;
    while(x<=p.size()){
    for(int i=0;i<p.size();i++){
        if(p.get(i).equals(x)){
            int y=i+1;
            for(int j=0;j<p.size();j++){
                if(p.get(j).equals(y))
                ls.add(j+1);
            }
        }
        }
        x++;
    }
        return ls;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.permutationEquation(p);

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
