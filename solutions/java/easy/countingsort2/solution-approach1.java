// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/countingsort2/problem?isFullScreen=true
// Problem     Counting Sort 2
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 11:53 p.m.
// Technique   frequency-array-counting-sort
// Time        O(n + k)
// Space       O(k)
// Insight     The algorithm maps input integers to indices of a fixed-size frequency array, then reconstructs the sorted sequence by iterating through the frequency counts.
// Interview   Before: "I would use a standard comparison sort like quicksort." After: "Counting sort is more efficient here because the input range is constrained to 0-99, allowing O(n + k) time complexity where k is the range size, avoiding the O(n log n) comparison limit."
// Pitfalls    (1) The implementation assumes input integers are strictly within the range [0, 99], which will cause an ArrayIndexOutOfBoundsException if the input contains values outside this range.  (2) The algorithm does not preserve the original relative order of identical elements, making it a non-stable sorting implementation.
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
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer>ls=new ArrayList<>();
        int[] num=new int[100];
        for(int i=0;i<arr.size();i++){
            num[arr.get(i)]++; 
        }
        
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i];j++){
                ls.add(i);
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

        List<Integer> result = Result.countingSort(arr);

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
