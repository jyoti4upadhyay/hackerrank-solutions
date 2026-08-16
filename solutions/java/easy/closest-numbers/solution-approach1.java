// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/closest-numbers/problem?isFullScreen=true
// Problem     Closest Numbers
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-16, 11:16 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    Collections.sort(arr);
    int minD=Integer.MAX_VALUE;
    for(int i=0;i<arr.size()-1;i++){
        int diff=Math.abs(arr.get(i)-arr.get(i+1));
        if(minD>diff && minD>0){
            minD=diff;
            }
        }
        System.out.println(minD);
    for(int i=0;i<arr.size()-1;i++){
        if((arr.get(i+1)-arr.get(i))==minD){
            ls.add(arr.get(i));
            ls.add(arr.get(i+1));    
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

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.closestNumbers(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
