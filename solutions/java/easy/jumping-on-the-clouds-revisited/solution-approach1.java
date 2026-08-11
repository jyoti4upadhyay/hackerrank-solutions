// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true
// Problem     Jumping on the Clouds: Revisited
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-12, 12:24 a.m.
// Technique   circular-modulo-traversal
// Time        O(n/gcd(n, k))
// Space       O(1)
// Insight     The character traverses the circular array using modulo arithmetic to update the index until returning to the starting position, decrementing energy based on the cloud type at each landing.
// Interview   Before: "I would use a boolean array to track visited clouds." After: "Since the path is circular and deterministic, I simply use a while loop with modulo arithmetic to simulate the jumps, achieving O(n/gcd(n, k)) time complexity and O(1) space."
// Pitfalls    (1) Failing to account for the additional 2-unit energy penalty when landing on a thunderhead cloud.  (2) Incorrectly terminating the loop before the character returns to the starting index 0.  (3) Assuming the loop runs exactly n times, whereas it actually completes in n/gcd(n, k) steps.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int energy=100;
         int n=c.length;
        int i=0;
        while(true){
            i=(i+k)%n;
            if(c[i]==1) {
                energy=energy-2-1;
            } 
            else if(c[i]==0){
                energy=energy-1;
            }
            if(i==0){
                break;
            }
            
        }
        return energy;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
