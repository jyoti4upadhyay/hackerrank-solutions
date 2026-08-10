// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/the-love-letter-mystery/problem?isFullScreen=true
// Problem     The Love-Letter Mystery
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 02:42 a.m.
// Technique   two-pointers-character-difference
// Time        O(n)
// Space       O(1)
// Insight     The minimum number of operations to make a string a palindrome is the sum of the absolute differences between characters at symmetric positions from the ends.
// Interview   Before: "I would use a stack to reverse the string and compare." After: "I can use two pointers to compare symmetric characters in O(n) time and O(1) space, calculating the absolute difference for each pair to find the total operations."
// Pitfalls    (1) Failing to account for the absolute difference between characters, which is required because only reductions are allowed.  (2) Incorrectly assuming that characters can be increased, violating the rule that only reductions are permitted.  (3) Mismanaging the loop termination condition, which must stop when pointers meet or cross to avoid double-counting the middle character in odd-length strings.
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
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int theLoveLetterMystery(String s) {
    // Write your code here
    int count=0;
    int start=0;
    int end=s.length()-1;
    while(!(start>=end)){
        if(s.charAt(start)!=s.charAt(end)){
            char chE=s.charAt(end);
            char chS=s.charAt(start);
            count=count+Math.abs(chE-chS); 
        }
        
        start++;
        end--;
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

            int result = Result.theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
