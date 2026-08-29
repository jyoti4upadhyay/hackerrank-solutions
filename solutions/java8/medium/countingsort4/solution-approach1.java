// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/countingsort4/problem?isFullScreen=true
// Problem     The Full Counting Sort
// Difficulty  Medium
// Subdomain   Sorting
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-30, 02:05 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.StringTokenizer;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countSort' function below.
     *
     * The function accepts 2D_STRING_ARRAY arr as parameter.
     */

    public static void countSort(List<List<String>> arr) {
    // Write your code here
    StringBuilder[] bucket=new StringBuilder[100];
    for(int i=0;i<100;i++){
        bucket[i]=new StringBuilder() ;
    }
    int half=arr.size()/2;
    for(int i=0;i<arr.size();i++){
        int ind=Integer.parseInt(arr.get(i).get(0));
        if(i<half){
                bucket[ind].append("- ");
            }
        else{
            bucket[ind].append(arr.get(i).get(1)).append(" ");
            
            }
    }
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<100;i++){
       sb.append(bucket[i]); 

    }
    sb.setLength(sb.length()-1);
    System.out.print(sb.toString()) ;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(bufferedReader.readLine());
            List<String> row=new ArrayList<>();
            row.add(st.nextToken());
            row.add(st.nextToken());
            arr.add(row);
        }

        Result.countSort(arr);

        bufferedReader.close();
    }
}
