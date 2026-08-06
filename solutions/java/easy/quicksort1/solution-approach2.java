// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/quicksort1/problem?isFullScreen=true
// Problem     Quicksort 1 - Partition
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 04:38 p.m.
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
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
    int[] num=new int[arr.size()];
    for(int i=0;i<num.length;i++){
        num[i]=arr.get(i);
    }
    List<Integer>left=new ArrayList<>();
    List<Integer>right=new ArrayList<>();
    int low=0;
    int pivot=num[low];
    int high=num.length-1;
    for(int j=low;j<=high;j++){
        if(pivot>num[j]){
            left.add(num[j]);
        }
        else if(pivot<num[j]){
            right.add(num[j]);
        }
    }
    List<Integer> ls=new ArrayList<>();
    ls.addAll(left);
    ls.add(pivot);
    ls.addAll(right);
    
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

        List<Integer> result = Result.quickSort(arr);

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
