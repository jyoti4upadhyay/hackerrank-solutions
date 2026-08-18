// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/flatland-space-stations/problem?isFullScreen=true
// Problem     Flatland Space Stations
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-18, 02:41 p.m.
// Technique   brute-force-nearest-neighbor-search
// Time        O(n * m)
// Space       O(n)
// Insight     The algorithm calculates the distance from every city to every space station to identify the minimum distance for each city, then selects the maximum of these minimums.
// Interview   Before: "I could use a nested loop to compare every city against every station." After: "This approach runs in O(n * m) time, which is acceptable given the constraints, though sorting the stations and using binary search or a single pass could optimize it to O(n log m) or O(n)."
// Pitfalls    (1) The O(n * m) complexity may exceed time limits if n and m are both large, as the constraints allow up to 10^5 cities.  (2) The implementation creates an unnecessary ArrayList of size n, which increases space complexity to O(n) instead of O(1) auxiliary space.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<c.length;j++){
                int diff=Math.abs(i-c[j]);
                if(diff<min){
                    min=diff;
                }      
                }
                ls.add(min);
            }
            int max=0;
            for(int i=0;i<ls.size();i++){
                if(max<ls.get(i)){
                    max=ls.get(i);
                }   
            }
            return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
