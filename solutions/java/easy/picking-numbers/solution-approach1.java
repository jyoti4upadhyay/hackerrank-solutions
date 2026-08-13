// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
// Problem     Picking Numbers
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 07:56 a.m.
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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int maxC=0;
        for(int i=0;i<a.size()-1;i++){
            List<Integer>ls=new ArrayList<>();
            ls.add(a.get(i)); 
             for(int j=i+1;j<a.size();j++){                                                              
                if(Math.abs(a.get(i)-a.get(j))<=1){
                    ls.add(j);
                }
            }  
            int len=ls.size();
            if(maxC<len){
                maxC=len;
            }         
        }
        return maxC;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
     
