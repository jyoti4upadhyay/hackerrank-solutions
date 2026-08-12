// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true
// Problem     Arrays: Left Rotation
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 10:52 a.m.
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
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
    // Write your code here
    
    List<Integer>ls=new ArrayList<>();
    int n=a.size();
    d=d%n;
    //whole arr reverse
    for(int i=a.size()-1;i>=0;i--){
        ls.add(a.get(i));   
    }
    List<Integer>right=new ArrayList<>();
    List<Integer>left=new ArrayList<>();
    for(int i=n-d-1;i>=0;i--){
        left.add(ls.get(i));    
    }
    for(int i=n-1;i>=n-d;i--){
        right.add(ls.get(i));
    }
    List<Integer> res=new ArrayList<>();
    for(int i=0;i<left.size();i++){
        res.add(left.get(i));
    }
    for(int i=0;i<right.size();i++){
        res.add(right.get(i));
    }
    return res;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> result = Result.rotLeft(a, d);

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
