// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true
// Problem     Funny String
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 03:56 p.m.
// Technique   array-based-difference-comparison
// Time        O(n)
// Space       O(n)
// Insight     The algorithm verifies the funny property by comparing the absolute differences of adjacent character ASCII values in the original string against those in its reversed counterpart.
// Interview   Before: "I would reverse the string and compare every character." After: "I calculate the absolute differences of adjacent characters for both the original and reversed strings in O(n) time and O(n) space, ensuring the sequence of differences matches exactly as required by the problem definition."
// Pitfalls    (1) Failing to account for the n-1 adjacent pairs when iterating through the string of length n.  (2) Incorrectly calculating the reverse string indices, which must map the original string's last character to the first position of the reversed array.
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
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        int[] arr=new int[s.length()];
        int[] rev=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=(int) s.charAt(i);
        }
        int k=0;
        for(int j=s.length()-1;j>=0;j--){
            rev[k]=(int) s.charAt(j);
            k++;
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])!=Math.abs(rev[i]-rev[i+1])){
                return "Not Funny";
                }
            }
         return "Funny";
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

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
