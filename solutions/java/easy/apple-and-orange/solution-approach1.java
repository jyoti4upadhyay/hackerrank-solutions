// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
// Problem     Apple and Orange
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 10:54 a.m.
// Technique   linear-scan-range-check
// Time        O(m + n)
// Space       O(m + n)
// Insight     The algorithm calculates the absolute landing position of each fruit by adding its displacement to the tree's coordinate and verifies if the result falls within the inclusive range [s, t].
// Interview   Before: "I would calculate the landing position for every fruit and check if it is between s and t." After: "I iterate through both lists once, resulting in O(m + n) time complexity, where m and n are the counts of apples and oranges, respectively, ensuring each fruit is checked against the inclusive house boundaries."
// Pitfalls    (1) Failing to account for the inclusive nature of the range [s, t] by using strict inequality operators.  (2) Assuming the apple tree is always to the left of the house and the orange tree is always to the right, which may lead to incorrect displacement logic if not handled by simple addition.  (3) Neglecting to handle negative displacement values correctly, which represent fruits falling to the left of the tree.
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
    //s->house start,t=> house end, a=>apple tree,b=>orange tree, m=>apple a day 
    List <Integer>resA=new ArrayList<>();
    List<Integer> resO=new ArrayList<>();
    for(int i=0;i<apples.size();i++){
        int key=a+apples.get(i);
        if(key>=s && key<=t){
            resA.add(key);
        }
    }
    for(int j=0;j<oranges.size();j++){
        int key=b+oranges.get(j);
        if(key>=s && key<=t){
            resO.add(key);
        }
    }
    System.out.println(resA.size());
    System.out.println(resO.size());
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
