// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/two-characters/problem?isFullScreen=true
// Problem     Two Characters
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-05, 02:28 a.m.
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
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
    // Write your code here
    List<Character>ls=new ArrayList<>();
    for(int i=0;i<s.length();i++){
        if(!ls.contains(s.charAt(i))){
            ls.add(s.charAt(i));
        }
    }
    int max=0; 
    for(int i=0;i<ls.size()-1;i++){
        for(int x=i+1;x<ls.size();x++){
            List<Character>ch=new ArrayList<>();
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(c==ls.get(i) || c==ls.get(x)) {
                    ch.add(c);
                } 
            }
            boolean valid=true;
            for(int k=0;k<ch.size()-1;k++){
                if(ch.get(k)==ch.get(k+1)){
                    valid=false;
                    break;
                }
            }
            if(valid==true){
                max=Math.max(max,ch.size());
            }
        }
    }
    return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
