// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true
// Problem     Designer PDF Viewer
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 08:13 a.m.
// Technique   linear-scan-max-tracking
// Time        O(n)
// Space       O(1)
// Insight     The algorithm calculates the highlighted area by identifying the maximum height among all characters in the input string and multiplying it by the string length.
// Interview   Before: "I would iterate through the string and find the maximum height using a hash map." After: "Since the alphabet is fixed, I map each character to its index using ASCII subtraction, achieving O(n) time and O(1) space complexity by tracking the maximum height in a single pass."
// Pitfalls    (1) Assuming character heights are 1-indexed instead of using the provided 0-indexed list mapping.  (2) Failing to account for the constant 1mm width of each character when calculating the final area.  (3) Using an incorrect character-to-index conversion by forgetting to subtract the ASCII value of 'a'.
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
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        int len=word.length();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int idx=ch-'a';
            if(max<h.get(idx)){
                max=h.get(idx);
            }
        }
        return len*max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] hTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hTemp[i]);
            h.add(hItem);
        }

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
