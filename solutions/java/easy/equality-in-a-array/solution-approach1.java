// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true
// Problem     Equalize the Array
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-14, 11:44 a.m.
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
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    int count=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.size();i++){
        List<Integer>ls=new ArrayList<>();
        for(int j=0;j<arr.size();j++){
            if(arr.get(i)==arr.get(j)){
                ls.add(arr.get(j));
            }
        }
        if(max<ls.size()){
            max=ls.size();
        }
    }
    count=arr.size()-max;
    return count;
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

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
