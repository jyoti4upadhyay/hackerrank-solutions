// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/java-dme-assessment/challenges/the-love-letter-mystery/problem?isFullScreen=true
// Problem     The Love-Letter Mystery
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-27, 03:30 p.m.
// Technique   two-pointers-character-difference
// Time        O(n)
// Space       O(1)
// Insight     The minimum number of operations to make a string a palindrome is the sum of absolute differences between characters at symmetric positions, as each reduction operation decreases a character value by one.
// Interview   Before: "I would use a frequency map to count character occurrences." After: "Since we only reduce values, we use two pointers to compare symmetric characters and accumulate their absolute difference, achieving O(n) time complexity for a string of length n."
// Pitfalls    (1) Assuming the problem requires character replacement rather than simple reduction, which contradicts the rule that only reduction by 1 is allowed.  (2) Failing to account for the fact that the total operations are the sum of absolute differences between symmetric characters, not just the count of mismatched pairs.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int theLoveLetterMystery(String s) {
    // Write your code here
        int start=0;
        int end=s.length()-1;
        int count=0;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                int x=(s.charAt(start)-'a')%26;
                int y=(s.charAt(end)-'a')%26;
                int diff=Math.abs(x-y);
                count=count+diff;
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

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.theLoveLetterMystery(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
