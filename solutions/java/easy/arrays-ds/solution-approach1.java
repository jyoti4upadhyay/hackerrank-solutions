// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
// Problem     Arrays - DS
// Difficulty  Easy
// Subdomain   Arrays
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 08:09 p.m.
// Technique   new-list-reverse-iteration
// Time        O(N)
// Space       O(N)
// Insight     The implementation constructs a new list by traversing the input list from the last index down to zero.
// Interview   Before: "I could reverse the list in-place using two pointers to save space." After: "I chose to create a new list by iterating backwards, which results in O(N) time and O(N) space complexity, effectively handling the input array of size N."
// Pitfalls    (1) Iterating from a.size() instead of a.size()-1 causes an IndexOutOfBoundsException.  (2) Failing to handle an empty input list might lead to unexpected behavior if the loop condition is not strictly i >= 0.
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
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    for(int i=a.size()-1;i>=0;i--){
        ls.add(a.get(i));
    }
    return ls;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> res = Result.reverseArray(arr);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
