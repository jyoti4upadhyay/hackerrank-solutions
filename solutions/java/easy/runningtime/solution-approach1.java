// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/runningtime/problem?isFullScreen=true
// Problem     Running Time of Algorithms
// Difficulty  Easy
// Subdomain   Sorting
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-06, 02:18 a.m.
// Technique   insertion-sort-shift-counter
// Time        O(n^2)
// Space       O(n)
// Insight     The algorithm counts the total number of swaps performed during insertion sort by incrementing a counter each time an element is shifted to the right to accommodate a smaller value.
// Interview   Before: "How do I calculate the number of shifts in insertion sort?" After: "You track the number of times an element is moved to the right during the inner while loop. This approach has O(n^2) time complexity, which is expected for insertion sort in the worst case."
// Pitfalls    (1) The code uses a post-increment operator 'count++' in the return statement, which returns the original value of count instead of the updated total.  (2) The inner loop condition 'temp < array[j]' fails to account for stable sorting requirements if the problem required maintaining relative order of equal elements.
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
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int runningTime(List<Integer> arr) {
    // Write your code here
    int[] array=new int[arr.size()];
    int count=0;
    for(int i=0;i<arr.size();i++){
        array[i]=arr.get(i);
    }
    for(int i=1;i<array.length;i++){
        int temp=array[i];
        int j=i-1;
        while(j>=0 && temp<array[j]){
            array[j+1]=array[j];
            j--;
            count++;
            
        }
        array[j+1]=temp;
        
    }
    return count++;

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

        int result = Result.runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
