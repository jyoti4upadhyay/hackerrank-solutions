// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true
// Problem     Number Line Jumps
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 08:56 p.m.
// Technique   linear-simulation-with-guards
// Time        O((x2-x1)/(v1-v2))
// Space       O(1)
// Insight     The kangaroos meet if their relative distance decreases to zero, which is only possible if the trailing kangaroo has a strictly greater velocity than the leading kangaroo.
// Interview   Before: "I could use a mathematical formula to solve for the number of jumps." After: "I implemented a simulation that checks if the distance between kangaroos closes, running in O(N) time where N is the number of jumps, ensuring we handle cases where the trailing kangaroo is slower and can never catch up."
// Pitfalls    (1) Failing to account for the case where the trailing kangaroo is slower or equal in speed, which prevents them from ever meeting.  (2) Assuming the kangaroos start at the same position, which would require an immediate YES return.  (3) Infinite loop risk if the velocity condition does not strictly guarantee the distance between kangaroos decreases.
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
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1>x2 && v1>v2 || x1<x2 && v1<v2){
            return "NO";
        }
        if(x1+v1==x2+v2){
            return "YES";
        }
        while(x1!=x2 && (x1>x2 && v1<v2 || x1<x2 && v1>v2)){
            x1=x1+v1;
            x2=x2+v2;
            
        }
        if(x1==x2){
            return "YES";
        }
        return "NO";
            
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
