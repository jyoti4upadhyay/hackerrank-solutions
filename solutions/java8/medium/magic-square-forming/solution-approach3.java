// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true
// Problem     Forming a Magic Square
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-27, 07:11 p.m.
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
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
      int[][][]magic={  {{8,1,6},{3,5,7},{4,9,2}},
                        {{4,9,2},{3,5,7},{8,1,6}},        //9,3,3
                        {{8,3,4},{1,5,9},{6,7,2}},
                        {{6,1,8},{7,5,3},{2,9,4}},
                        {{6,7,2},{1,5,9},{8,3,4}},
                        {{4,3,8},{9,5,1},{2,7,6}},
                        {{2,7,6},{9,5,1},{4,3,8}},
                        {{2,9,4},{7,5,3},{6,1,8}}};
        int minCost=Integer.MAX_VALUE;
        for(int i=0;i<8;i++){
            int sum=0;
            for(int row=0;row<3;row++){
                for(int col=0;col<3;col++){
                    int diff=Math.abs(s.get(row).get(col)-magic[i][row][col]);
                    sum=sum+diff;   
                } 
            }
            System.out.println(sum);
            if(minCost>sum){
                minCost=sum;
            }
        }
         return minCost;
        
}
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
