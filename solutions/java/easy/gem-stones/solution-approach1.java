// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/gem-stones/problem?isFullScreen=true
// Problem     Gemstones
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 11:09 p.m.
// Technique   nested-loop-string-search
// Time        O(N * M * K)
// Space       O(1)
// Insight     The algorithm identifies gemstones by verifying if each character in the first string exists within every subsequent string in the collection using a hash set to ensure uniqueness.
// Interview   Before: "I would use a frequency array to count occurrences across all strings." After: "This implementation uses nested loops and indexOf to check presence, resulting in O(N * M * K) time complexity, where N is the number of strings, M is the length of the first string, and K is the average length of the remaining strings."
// Pitfalls    (1) The implementation assumes the input list contains at least one string, which is consistent with the problem constraints.  (2) Using indexOf repeatedly inside a loop leads to redundant character scans, which is inefficient for large input strings.  (3) The logic relies on the first string as the reference set, which is valid because a gemstone must appear in every rock.
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
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
    // Write your code here
    String str=arr.get(0);
    int gem=0;
    HashSet<Character>hs=new HashSet<>();
    for(int i=0;i<str.length();i++){
        char s=str.charAt(i);
        int flag=0;
        for(int j=1;j<arr.size();j++){
            if(arr.get(j).indexOf(s)!=-1){
                flag++;
            } 
        }
        if(flag==arr.size()-1){
            hs.add(s);
        }
    }
    return hs.size();
    
  
    

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String arrItem = bufferedReader.readLine();
            arr.add(arrItem);
        }

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
