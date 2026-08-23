// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/countingsort1/problem?isFullScreen=true
// Problem     Counting Sort 1
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 11:42 p.m.
// Technique   frequency-array-counting
// Time        O(n)
// Space       O(1)
// Insight     The algorithm maps each input integer to a fixed-size frequency array of 100 elements by incrementing the index corresponding to the integer value.
// Interview   Before: "How would you sort these integers without comparisons?" After: "I use a frequency array of size 100 to count occurrences in O(n) time, which is optimal given the constraint that all input values are strictly less than 100."
// Pitfalls    (1) Failing to initialize the frequency array with exactly 100 elements as required by the problem statement.  (2) Assuming input values could exceed 99, which would cause an ArrayIndexOutOfBoundsException given the fixed array size of 100.
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
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    int[] num=new int[100];
    for(int i=0;i<arr.size();i++){
        num[arr.get(i)]++;
             
    }
    for(int i=0;i<num.length;i++){
        ls.add(num[i]);  
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
