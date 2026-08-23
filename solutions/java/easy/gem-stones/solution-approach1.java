// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/gem-stones/problem?isFullScreen=true
// Problem     Gemstones
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 11:09 p.m.
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
