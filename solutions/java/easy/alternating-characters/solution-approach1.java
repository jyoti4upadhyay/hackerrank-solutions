// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/alternating-characters/problem?isFullScreen=true
// Problem     Alternating Characters 
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 02:21 a.m.
// Technique   linear-scan-adjacent-comparison
// Time        O(n)
// Space       O(1)
// Insight     The algorithm counts the number of adjacent character pairs that are identical, as each such pair necessitates exactly one deletion to satisfy the alternating condition.
// Interview   Before: "I would use a stack to keep track of the last character and remove duplicates." After: "Actually, a simple linear scan comparing s[i] with s[i+1] is more efficient, achieving O(n) time and O(1) space, which is optimal for this string processing task."
// Pitfalls    (1) Accessing s.charAt(i+1) without limiting the loop to s.length()-1 causes a StringIndexOutOfBoundsException.  (2) Failing to handle empty strings or single-character strings, though the loop condition i < s.length()-1 correctly skips these cases.
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
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
    // Write your code
    int count=0;
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
            count++;  
        }
    }
    return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
