// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
// Problem     Subarray Division
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 06:58 a.m.
// Technique   sliding-window-brute-force
// Time        O(n * m)
// Space       O(1)
// Insight     The algorithm iterates through all possible contiguous subarrays of length m and checks if their sum equals the target birth day d.
// Interview   Before: "I could use a sliding window with a running sum to optimize this to O(n)." After: "The current O(n * m) approach is sufficient given the constraints, where n is the number of squares and m is the birth month, ensuring we correctly handle cases where m exceeds the list size."
// Pitfalls    (1) Failing to handle the case where the birth month m is greater than the number of chocolate squares n.  (2) Incorrectly setting the outer loop boundary to s.size() instead of s.size() - m + 1, which causes an IndexOutOfBoundsException.  (3) Miscalculating the inner loop range, which must iterate exactly m-1 times to include the starting element in the sum.
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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    if(m>s.size()){
        return 0;
    }
    int count=0;
    for(int i=0;i<s.size()-m+1;i++){
        int key=s.get(i);
        for(int j=i+1;j<i+m;j++){
            key=key+s.get(j); 
        } 
        if(key==d){
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

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sTemp[i]);
            s.add(sItem);
        }

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
