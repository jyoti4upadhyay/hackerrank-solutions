// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
// Problem     Sales by Match
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 01:24 a.m.
// Technique   sorting-and-linear-scan
// Time        O(n log n)
// Space       O(n)
// Insight     The algorithm sorts the sock colors to group identical values, then iterates through the array to count pairs by skipping two indices upon finding a match.
// Interview   Before: "I would use a hash map to count frequencies of each color." After: "Sorting the array allows for an O(n log n) time and O(n) space solution, which efficiently identifies pairs by comparing adjacent elements in the sorted list."
// Pitfalls    (1) Failing to handle the case where n is 0 or 1, which results in zero pairs.  (2) Incorrectly incrementing the index by 1 instead of 2 when a pair is found, leading to double-counting.  (3) Assuming the input list is already sorted, which would cause the linear scan to miss non-adjacent matching pairs.
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
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int pair=0;
    int[] arr=new int[ar.size()];
    for(int i=0;i<ar.size();i++){
        arr[i]=ar.get(i);
    }
    Arrays.sort(arr);
    int i=0;
    while(i<n-1){
        if(arr[i]==arr[i+1]){
            pair++;
            i=i+2;  
        }
        else {
            i=i+1;
        }
    }
    return pair;
    
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
