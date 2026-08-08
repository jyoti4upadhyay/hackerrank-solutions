// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
// Problem     Breaking the Records
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 09:54 p.m.
// Technique   linear-scan-tracking-extremes
// Time        O(n)
// Space       O(1)
// Insight     The algorithm maintains the current maximum and minimum scores, incrementing respective counters only when a new game score strictly exceeds or falls below the established season records.
// Interview   Before: "I could sort the list to find the min and max." After: "Sorting is unnecessary; a single linear scan in O(n) time is sufficient to track record changes, as the problem requires comparing each game against the running extreme values established by the first game."
// Pitfalls    (1) The code incorrectly includes redundant comparisons with the previous game score instead of comparing directly against the current record.  (2) The logic fails to account for cases where a score equals the current record, as the problem requires a strictly greater or lesser value to count as a break.
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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    int highest_Score=scores.get(0);
    int high=0;
    int low=0;
    int lowest_Score=scores.get(0);
    for(int i=1;i<scores.size();i++){
        if(scores.get(i)>scores.get(i-1)){
            if(scores.get(i)>highest_Score){
                high++;
                highest_Score=scores.get(i);
            }
        }
        else if(scores.get(i)<scores.get(i-1)) {
            if(scores.get(i)<lowest_Score){
                low++;
                lowest_Score=scores.get(i);
            }
        }
    }
    ls.add(high);
    ls.add(low);
    return ls;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result.breakingRecords(scores);

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
