// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/java-dme-assessment/challenges/migratory-birds/problem?isFullScreen=true
// Problem     Migratory Birds
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 03:14 p.m.
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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(hs.containsKey(arr.get(i))){
                hs.put(arr.get(i),hs.get(arr.get(i))+1);
            }
            else{
                hs.put(arr.get(i),1);
            }
        }
        int max=0;
        int k=0;
        for(int key:hs.keySet()){
            if(hs.get(key)>max){
                max=hs.get(key);
                k=key;
            }
            else if(max==hs.get(key) && k>key){
                max=hs.get(key);
                k=key;
            }
        }
        return k;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
