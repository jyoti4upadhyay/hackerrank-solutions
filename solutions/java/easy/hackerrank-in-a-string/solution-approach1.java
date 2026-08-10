// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true
// Problem     HackerRank in a String!
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 01:27 a.m.
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
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    // Write your code here
    String str="hackerrank";
    Stack<Character>stck=new Stack<>();
    for(int i=str.length()-1;i>=0;i--){
        stck.push(str.charAt(i));
    }
    int i=0;
    while( !stck.isEmpty() && i<s.length()){
        if(stck.peek()==s.charAt(i)){
            stck.pop();
        }
        i++; 
    }
    if(stck.isEmpty()){
        return "YES";
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
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
