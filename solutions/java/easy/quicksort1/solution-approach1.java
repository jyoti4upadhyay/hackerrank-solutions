// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/quicksort1/problem?isFullScreen=true
// Problem     Quicksort 1 - Partition
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 03:05 a.m.
// Technique   three-list-partitioning
// Time        O(n)
// Space       O(n)
// Insight     The algorithm partitions the input list into three distinct collections based on the pivot element at index zero and concatenates them into a single result list.
// Interview   Before: "I would use a nested loop to sort the array in place." After: "I implemented a linear O(n) partition by iterating once from index one, which is optimal for this specific problem constraint where the pivot is always the first element."
// Pitfalls    (1) Including the pivot element in the left or right lists instead of the equal list.  (2) Starting the iteration from index zero instead of index one, which causes the pivot to be incorrectly compared against itself.  (3) Failing to maintain the relative order of elements in the left and right lists as required by the problem's flexible checker.
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
    List<Integer> res=new ArrayList<>();
    List<Integer>left=new ArrayList<>();
    List<Integer> right=new ArrayList<>();
    for(int i=0;i<arr.size();i++){
        num[i]=arr.get(i);
    }
    int pivot=num[0];
    for(int i=1;i<num.length;i++){
        if(num[i]>pivot){
            right.add(num[i]);     
        }
        else {
            left.add(num[i]);
        }
    }
    res.addAll(left);
    res.add(pivot);
    res.addAll(right);
    
    return res;
    
    

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
