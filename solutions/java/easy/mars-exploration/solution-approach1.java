// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true
// Problem     Mars Exploration
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-05, 12:41 p.m.
// Technique   string-reconstruction-comparison
// Time        O(n)
// Space       O(n)
// Insight     The algorithm constructs an expected signal of identical length by repeating the pattern SOS and counts character mismatches against the received signal.
// Interview   Before: "I would iterate through the string and check every third character." After: "I reconstructed the full expected SOS sequence and compared it to the input, which runs in O(n) time and O(n) space, handling the signal length constraint effectively."
// Pitfalls    (1) String concatenation in a loop creates multiple intermediate objects, which is inefficient for very large input strings.  (2) The approach assumes the input length is always a multiple of three, though the problem constraints imply valid SOS transmissions.
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
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
    // Write your code here
    int mssg=s.length()/3;
    String res="";
    for(int i=0;i<mssg;i++){
        res=res+"SOS";
    }
    int count=0;
    for(int i=0;i<res.length();i++){
        if(res.charAt(i)!=s.charAt(i)){
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

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
