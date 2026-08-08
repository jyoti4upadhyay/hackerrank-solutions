// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true
// Problem     Cats and a Mouse
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 11:37 p.m.
// Technique   absolute-difference-comparison
// Time        O(q)
// Space       O(1)
// Insight     The solution determines the winner by comparing the absolute distances of each cat from the mouse, where the smaller distance indicates the faster arrival time.
// Interview   Before: "How would you determine which cat reaches the mouse first?" After: "I calculate the absolute difference between each cat's position and the mouse's position. Comparing these O(1) distances per query allows me to solve the problem in O(q) time, correctly handling the tie condition where both cats arrive simultaneously."
// Pitfalls    (1) Failing to use Math.abs() results in incorrect distance calculations when a cat's position is less than the mouse's position.  (2) Incorrectly ordering the conditional checks for Cat A and Cat B leads to returning the wrong string for the given distances.  (3) Neglecting the tie condition where both cats are equidistant from the mouse results in failing to return 'Mouse C'.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int diffX=Math.abs(x-z);
        int diffY=Math.abs(y-z);
        if(diffX>diffY){
            return "Cat B";
        }
        else if(diffX<diffY){
            return "Cat A";
        }
        return "Mouse C";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
