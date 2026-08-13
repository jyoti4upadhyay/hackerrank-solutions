// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true
// Problem     Angry Professor
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 08:15 a.m.
// Technique   linear-scan-counter
// Time        O(n)
// Space       O(1)
// Insight     The algorithm counts students with arrival times less than or equal to zero and compares this total against the threshold k to determine if the class is cancelled.
// Interview   Before: "I could sort the arrival times to find the cutoff point." After: "Sorting is unnecessary; a single linear scan in O(n) time correctly identifies all students arriving on or before time zero, which is sufficient to compare against the threshold k."
// Pitfalls    (1) Misinterpreting the condition a[i] <= 0 as only early arrivals, ignoring that on-time students are also included.  (2) Returning YES when the count of on-time students is exactly equal to k, violating the requirement that class is cancelled only if fewer than k students are present.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
    
    int onTime=0;
    int late=0;
    
    for(int i=0;i<a.size();i++){
        if(a.get(i)>0){
            late++;
        }
        else if(a.get(i)<=0){
            onTime++;
        }
    }
    if(onTime<k){
        return "YES";
    }
    return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int k = Integer.parseInt(firstMultipleInput[1]);

            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }

            String result = Result.angryProfessor(k, a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
