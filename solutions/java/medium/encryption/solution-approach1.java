// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=true
// Problem     Encryption
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 05:04 p.m.
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
