// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true
// Problem     Strong Password
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-05, 01:02 a.m.
// Technique   regex-pattern-matching-validation
// Time        O(n)
// Space       O(1)
// Insight     The algorithm calculates the number of missing character categories and the number of characters needed to reach the minimum length, returning the maximum of these two values to satisfy all constraints simultaneously.
// Interview   Before: "I would iterate through the string and maintain four boolean flags for the required character types." After: "Using regex patterns is more concise here, resulting in O(n) time complexity where n is the password length, ensuring we meet the minimum length of 6 and include all four required character categories."
// Pitfalls    (1) The regex pattern for special characters must correctly escape the hyphen character to avoid range errors in the character class.  (2) The logic must return the maximum of the length deficit and the missing category count, as adding a missing category character also contributes to the total length requirement.  (3) The regex pattern must use the dot-star prefix and suffix to correctly identify the presence of a character anywhere within the string.
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
