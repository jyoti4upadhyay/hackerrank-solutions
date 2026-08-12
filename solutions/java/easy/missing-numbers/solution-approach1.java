// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
// Problem     Missing Numbers
// Difficulty  Easy
// Subdomain   Search
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 01:44 p.m.
// Technique   frequency-map-difference
// Time        O(N + M + K log K)
// Space       O(N + M)
// Insight     The algorithm tracks frequency differences by incrementing counts for the first array and decrementing for the second, identifying missing numbers as those with a negative final frequency.
// Interview   Before: "How would you identify missing elements with frequency constraints?" After: "I use a hash map to store frequency differences, which runs in O(N + M) time and O(N + M) space, then sort the result to meet the ascending order requirement."
// Pitfalls    (1) Failing to account for the requirement that missing numbers must be returned in ascending order.  (2) Assuming that only numbers present in the first array can be missing, ignoring numbers present only in the second array.  (3) Neglecting the requirement to include each missing number only once in the final output.
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
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
    HashMap<Integer,Integer> hs=new HashMap<>();
    for(int i=0;i<arr.size();i++){
        int key=arr.get(i);
        if(hs.containsKey(key)){
            hs.put(key,hs.get(key)+1);
        }
        else hs.put(key,1);
    } 
    for(int i=0;i<brr.size();i++){
        int key=brr.get(i);
        if(hs.containsKey(key)){
                hs.put(key,hs.get(key)-1);
        }
        else {
            hs.put(key,-1);
        }
    }
    List<Integer>ls=new ArrayList<>();
    for(Integer key:hs.keySet()){
        if(hs.get(key)<0){
            ls.add(key);
        }
    }
     Collections.sort(ls);
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

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        List<Integer> result = Result.missingNumbers(arr, brr);

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
