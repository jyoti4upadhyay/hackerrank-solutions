// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
// Problem     Compare the Triplets
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-07, 04:53 p.m.
// Technique   linear-scan-comparison
// Time        O(1)
// Space       O(1)
// Insight     The algorithm iterates through the fixed-size triplets once, incrementing the respective score counter only when a strict inequality is satisfied.
// Interview   Before: "I would use a hash map to store the counts for each person." After: "Since the input size is fixed at three, a simple linear scan with two integer counters is optimal, achieving O(1) time and space complexity."
// Pitfalls    (1) Failing to handle the equality case where neither Alice nor Bob receives a point.  (2) Incorrectly returning the scores in the wrong order, as the problem requires Alice's score first.
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
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){ 
    List<Integer>ls=new ArrayList<>();
    int alice=0;
    int bob=0;
    for(int i=0;i<a.size();i++){
        if(a.get(i)>b.get(i)){
            alice++;
        }
        else if(a.get(i)<b.get(i)){
            bob++;
        }
    }
    ls.add(alice);
    ls.add(bob);
    return ls;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Result.compareTriplets(a, b);

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
