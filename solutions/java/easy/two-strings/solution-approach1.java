// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true
// Problem     Two Strings
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-05, 11:29 p.m.
// Technique   hash-set-character-lookup
// Time        O(N + M)
// Space       O(1)
// Insight     The algorithm determines if two strings share a common substring by checking if any character from the first string exists in the second string using a hash set.
// Interview   Before: "I would compare every character of s1 with every character of s2." After: "I can optimize this to O(N + M) time by storing characters of s1 in a hash set, allowing O(1) lookups for each character in s2, which is efficient given the alphabet size is constant."
// Pitfalls    (1) Assuming the strings contain characters outside the ascii[a-z] range, which contradicts the problem constraints.  (2) Failing to account for the O(1) space complexity, as the hash set size is bounded by the constant alphabet size of 26.
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
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    // Write your code here
    HashSet<Character>hs=new HashSet<>();
    for(int i=0;i<s1.length();i++){
        hs.add(s1.charAt(i));
    }
    for(int i=0;i<s2.length();i++){
        if(hs.contains(s2.charAt(i))){
            return "YES";
        }
    }
    return "NO";
    
}
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
