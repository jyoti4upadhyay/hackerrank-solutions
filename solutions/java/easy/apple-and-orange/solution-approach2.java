// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
// Problem     Apple and Orange
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 08:21 p.m.
// Technique   linear-scan-coordinate-mapping
// Time        O(m + n)
// Space       O(m + n)
// Insight     The algorithm calculates the absolute landing position of each fruit by adding its displacement to the tree's origin and checks if the result falls within the inclusive range [s, t].
// Interview   Before: "I would sort the fruit positions to use binary search." After: "Sorting is unnecessary because we only need to check each fruit once, resulting in O(m + n) time complexity, which is optimal for processing all m apples and n oranges."
// Pitfalls    (1) Failing to use an inclusive range check [s, t] as defined in the problem statement.  (2) Incorrectly assuming the tree position a or b is always zero, ignoring the provided tree coordinates.  (3) Misinterpreting negative displacement values, which correctly represent distance to the left of the tree.
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
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int countA=0;
    int countO=0;
    for(int i=0;i<apples.size();i++){
        int key=apples.get(i)+a;
        if(key>=s && key<=t){
            countA++;
        }   
    }
    for(int j=0;j<oranges.size();j++){
        int key=oranges.get(j)+b;
        if(key>=s && key<=t){
            countO++;
        }
    }
    System.out.println(countA);
    System.out.println(countO);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        String[] applesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> apples = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesTemp[i]);
            apples.add(applesItem);
        }

        String[] orangesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesTemp[i]);
            oranges.add(orangesItem);
        }

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
