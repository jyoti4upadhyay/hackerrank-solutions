// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=true
// Problem     Encryption
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 05:04 p.m.
// Technique   grid-column-traversal
// Time        O(L)
// Space       O(L)
// Insight     The algorithm calculates grid dimensions based on the square root of the string length and extracts characters by jumping across the string at intervals equal to the column count.
// Interview   Before: "How do I map a 1D string to a 2D grid without creating an actual matrix?" After: "By using a stride equal to the column count, we can simulate column-major traversal in O(L) time, ensuring we handle the floor and ceiling constraints correctly."
// Pitfalls    (1) The code fails to remove spaces from the input string as required by the problem statement.  (2) The grid dimensions calculation does not satisfy the condition rows * columns >= L when rows * columns < L.  (3) The trailing space added to the final result string is not explicitly handled or trimmed.
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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
    int len=s.length();
    double root=Math.sqrt(len);
    int rows=(int)Math.floor(root);
    int columns=(int)Math.ceil(root);
    String[]arr=new String[rows];
    
    String st="";
    for(int i=0;i<columns;i++){
        String str="";
        for(int j=i;j<s.length();j=j+columns){
            str=str+s.charAt(j);
        }
        st=st+str+" ";
    }
    return st;  
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
