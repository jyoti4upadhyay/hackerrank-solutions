// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
// Problem     Append and Delete
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-28, 01:47 a.m.
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
