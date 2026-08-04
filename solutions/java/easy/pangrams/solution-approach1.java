// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true
// Problem     Pangrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 04:11 p.m.
// Technique   frequency-array-character-counting
// Time        O(n)
// Space       O(1)
// Insight     The algorithm tracks the frequency of each lowercase English letter in a fixed-size array and verifies that every index contains at least one occurrence.
// Interview   Before: "I could use a Set to store unique characters." After: "Using a frequency array of size 26 is more efficient, achieving O(n) time and O(1) space, as it avoids the overhead of hashing while handling the alphabet constraint directly."
// Pitfalls    (1) Failing to handle non-alphabetic characters like spaces, which are present in the input string but should not increment the frequency array indices.  (2) Incorrectly assuming the input string is already lowercase, which would cause index out of bounds errors if uppercase characters are processed without conversion.
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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    s=s.toLowerCase();
    int [] arr=new int[26];
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='z'){
            arr[ch-'a']++;
        }
    }
    for(int i=0;i<26;i++){
        if(arr[i]==0){
            return "not pangram";
        }
    }
    return "pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
