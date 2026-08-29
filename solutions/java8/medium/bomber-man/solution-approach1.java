// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/bomber-man/problem?isFullScreen=true
// Problem     The Bomberman Game
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-29, 05:42 p.m.
// Technique   periodic-state-simulation
// Time        O(R * C)
// Space       O(R * C)
// Insight     The grid state follows a periodic pattern of length four after the first second, allowing the simulation to be reduced to constant-time logic based on the parity and modulo of n.
// Interview   Before: "I would simulate every second step-by-step." After: "Since the grid state repeats every four seconds after n=1, I can compute the result in O(R * C) time by identifying the cycle, avoiding redundant simulations for large n."
// Pitfalls    (1) Failing to handle the n=1 case separately, which is the only state that does not follow the periodic pattern.  (2) Incorrectly assuming the grid is always full at even seconds, ignoring that n=0 is not defined in the problem constraints.  (3) Miscalculating the explosion logic by failing to mark all neighbors of a bomb simultaneously before updating the grid.
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
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
    // Write your code here
    int r=grid.size();
    int c=grid.get(0).length();
    if(n==1){
        return grid;
    }
    //full
    if(n%2==0){
        List<String>ls=new ArrayList<>();
        for(int i=0;i<grid.size();i++){
            String str="";
            for(int j=0;j<grid.get(i).length();j++){
                str=str+"O";
            }
            ls.add(str); 
        } 
        return ls; 
    }

    if(n%4==3){
        return explosion(grid);
    }
    return explosion(explosion(grid));
    }
    private static List<String> explosion(List<String>grid){
        int r=grid.size();
        int c=grid.get(0).length();
    // List<int[]>bomb=new ArrayList<>();
    // for(int i=0;i<grid.size();i++){
    //     for(int j=0;j<c;j++){
    //         if(grid.get(i).charAt(j)=='O'){
    //             bomb.add(new int[]{i,j});
    //         }
    //     }   
    // }
    boolean[][] destroy=new boolean[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
        if(grid.get(i).charAt(j)=='O'){
        destroy[i][j]=true;
        if(i-1>=0){
            destroy[i-1][j]=true;
        }
        if(i+1<r){
            destroy[i+1][j]=true;
        }
        if(j-1>=0){
            destroy[i][j-1]=true;
        }
        if(j+1<c){
            destroy[i][j+1]=true;
        }
        }
        }
    }
    List<String>list=new ArrayList<>();
        for(int i=0;i<r;i++){
            StringBuilder str=new StringBuilder();
            for(int j=0;j<c;j++){
                if(destroy[i][j]){
                    str.append(".");
                }
                else{
                    str.append("O");
                }
            }
            list.add(str.toString());
    }
    return list;
}
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.bomberMan(n, grid);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
