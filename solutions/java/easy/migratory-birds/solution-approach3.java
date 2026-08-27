// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/java-dme-assessment/challenges/migratory-birds/problem?isFullScreen=true
// Problem     Migratory Birds
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 03:14 p.m.
// Technique   hash-map-frequency-counting
// Time        O(n)
// Space       O(1)
// Insight     The algorithm tracks bird type frequencies in a hash map and iterates through the keys to identify the type with the highest count, prioritizing the smallest ID in case of ties.
// Interview   Before: "I would sort the array and count consecutive elements to find the mode." After: "Using a hash map allows O(n) time complexity to count frequencies, and a single pass over the map keys ensures we correctly identify the smallest ID for the maximum frequency in O(1) space, given the limited bird types."
// Pitfalls    (1) Failing to handle the tie-breaking rule where the smallest ID must be returned when frequencies are equal.  (2) Assuming the input array is sorted, which is not guaranteed by the problem statement.  (3) Using an inefficient data structure that increases time complexity beyond O(n) for large input sizes.
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
