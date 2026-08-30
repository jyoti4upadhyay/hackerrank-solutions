// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/3d-surface-area/problem?isFullScreen=true
// Problem     3D Surface Area
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-30, 11:36 a.m.
// Technique   grid-traversal-differential-surface-area
// Time        O(H * W)
// Space       O(1)
// Insight     The total surface area is calculated by summing the top and bottom faces of each stack plus the positive differences in height between adjacent cells and the boundary edges.
// Interview   Before: "How would you calculate the surface area of a 3D structure represented by a 2D grid?" After: "I iterate through each cell, adding 2 for the top and bottom faces, then adding the positive height differences for all four neighbors. This O(H * W) approach correctly handles boundary conditions where neighbors are effectively zero."
// Pitfalls    (1) Failing to account for the top and bottom faces of each stack, which always contribute 2 to the surface area regardless of neighbors.  (2) Incorrectly handling boundary conditions by assuming neighbors outside the grid have a height other than zero.  (3) Neglecting to skip cells with a height of zero, which could lead to incorrect surface area calculations if not handled explicitly.
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
     * Complete the 'surfaceArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY A as parameter.
     */

    public static int surfaceArea(List<List<Integer>> A) {
    // Write your code here
    int area=0;
    int row=A.size();
    int col=A.get(0).size();
    for(int i=0;i<A.size();i++){
        for(int j=0;j<A.get(i).size();j++){
            int current=A.get(i).get(j);
            if(current==0){
                continue;
            }
            area=area+2;
            //up
            if(i==0){
                area=area+current; 
            }
            else {
                area=area+Math.max(0,current-A.get(i-1).get(j));
            }
            //bottom
            if(i==A.size()-1){
                area=area+current;
            }
            else{
                area=area+Math.max(0,current-A.get(i+1).get(j));
            }
            //left
            if(j==0){
                area=area+current;
            }
            else{
                area=area+Math.max(0,current-A.get(i).get(j-1));
            }
            if(j==A.get(i).size()-1){
                area=area+current;
            }
            else{
                area=area+Math.max(0,current-A.get(i).get(j+1));
            }
        }
    }
    return area;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(firstMultipleInput[0]);

        int W = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> A = new ArrayList<>();

        IntStream.range(0, H).forEach(i -> {
            try {
                A.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
