// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
// Problem     Between Two Sets
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 06:32 p.m.
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
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    List<Integer> ls=new ArrayList<>();

    int br=Integer.MAX_VALUE; //min in b 
    for(int i=0;i<b.size();i++){
        if(br>b.get(i)){
            br=b.get(i);
        }
    }
    
    int ar=Integer.MIN_VALUE; //max in a
    for(int j=0;j<a.size();j++){
        if(ar<a.get(j)){
            ar=a.get(j);
        }
    }
    for(int i=ar;i<=br;i++){
        boolean valid =true;
        for(int j=0;j<a.size();j++){
            if(i%a.get(j)!=0){
                valid=false;        
            }
        }
        if(valid ==true){
            ls.add(i);
        }
    }
    int count =0;
    for(int i=0;i<ls.size();i++){
        boolean check=true;
        for(int j=0;j<b.size();j++){
            if(b.get(j)%ls.get(i)!=0){
                check=false;
            }
        }
        if(check==true){
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

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
