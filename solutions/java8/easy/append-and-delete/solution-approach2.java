// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
// Problem     Append and Delete
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-28, 01:47 a.m.
// Technique   common-prefix-length-calculation
// Time        O(min(s.length, t.length))
// Space       O(min(s.length, t.length))
// Insight     The algorithm calculates the minimum operations required to reach the common prefix and checks if the remaining moves allow for parity-based adjustment or total string deletion.
// Interview   Before: "I would use a stack to simulate the operations." After: "That is inefficient; instead, find the common prefix length to determine the minimum operations in O(N) time, then validate if the remaining k allows for valid parity or full string clearing."
// Pitfalls    (1) Failing to account for the case where k is large enough to delete the entire string and then perform redundant operations on an empty string.  (2) Incorrectly assuming that (k - total) must be zero, ignoring that extra operations can be consumed in pairs by deleting and appending the same character.  (3) Overlooking the constraint that deleting from an empty string results in an empty string, which allows for absorbing excess k values.
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
    if(s.length()+t.length()<=k){
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
