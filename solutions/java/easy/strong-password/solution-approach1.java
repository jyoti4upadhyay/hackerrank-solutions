// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true
// Problem     Strong Password
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-05, 01:02 a.m.
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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    int count=0;
    int rem=0;
    if(password.length()<6){
        rem=(6-password.length());
    }
    if(!password.matches(".*[a-z].*")){
        count++; 
    }
    if(!password.matches(".*[0-9].*")){
         count++;
    }
    if(!password.matches(".*[A-Z].*")){
            count++;
        }
        if(!password.matches(".*[!@#$%^&*()_+\\-].*")){
            count++;
        }
        
        return Math.max(rem, count);
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
