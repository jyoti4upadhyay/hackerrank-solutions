// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true
// Problem     Cavity Map
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-31, 02:14 a.m.
// Technique   grid-traversal-with-string-builder
// Time        O(n^2)
// Space       O(n^2)
// Insight     The algorithm iterates through the interior cells of the grid, replacing a cell with 'X' if its depth is strictly greater than its four immediate neighbors.
// Interview   Before: "I need to identify cavities in a grid." After: "I iterate through the interior rows and columns, comparing each cell to its four neighbors in O(n^2) time, ensuring border cells remain unchanged as per the problem constraints."
// Pitfalls    (1) Failing to exclude border cells from the cavity check, which violates the problem definition.  (2) Using incorrect loop bounds that include the first or last row/column, leading to index out of bounds errors.  (3) Modifying the grid in-place while iterating, which could cause incorrect comparisons with already updated 'X' values.
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
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
    // Write your code here\
    if(grid.size()<=2){
        return grid;
    }
    List<String>ls=new ArrayList<>();
    ls.add(grid.get(0));
    for(int i=1;i<grid.size()-1;i++){
        String str=grid.get(i);
        StringBuilder res=new StringBuilder();
        res.append(str.charAt(0));
        for(int j=1;j<str.length()-1;j++){
            if(str.charAt(j)>str.charAt(j-1) && 
            str.charAt(j)>str.charAt(j+1) && str.charAt(j)>grid.get(i-1).charAt(j) && str.charAt(j)>grid.get(i+1).charAt(j)){
                res.append('X');
            }
            else {
                res.append(str.charAt(j));
            }
        }
        res.append(str.charAt(str.length()-1));
        ls.add(res.toString());
    }
    ls.add(grid.get(grid.size()-1));
    return ls;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.cavityMap(grid);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
