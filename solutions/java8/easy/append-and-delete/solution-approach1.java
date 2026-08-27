// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
// Problem     Append and Delete
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-28, 01:44 a.m.
// Technique   common-prefix-length-calculation
// Time        O(min(s.length, t.length))
// Space       O(min(s.length, t.length))
// Insight     The algorithm calculates the length of the longest common prefix to determine the minimum operations required, then validates if the remaining moves allow for parity-based completion or total string deletion.
// Pitfalls    (1) Failing to account for the parity requirement where (k - total) must be even for valid conversions.  (2) Incorrectly assuming that the total number of operations must exactly equal the difference in lengths without considering the parity constraint.
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
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
    StringBuilder str=new StringBuilder();
    for(int i=0;i<t.length()&&i<s.length();i++){
        if(s.charAt(i)==t.charAt(i)){
            str.append(s.charAt(i));
        }
        else{
            break;
        }
    }
    int total=(s.length()-str.length())+(t.length()-str.length());
    if(total<=k && (k-total)%2==0){
        return "Yes";
    }
    if(s.length()+t.length()<k){
        return "Yes";
    }
    return "No";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
