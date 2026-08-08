// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
// Problem     Migratory Birds
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 11:06 p.m.
// Technique   hash-map-frequency-counting
// Time        O(n)
// Space       O(k)
// Insight     The algorithm counts occurrences of each bird type in a hash map, identifies the maximum frequency, and then selects the smallest key among those matching that maximum frequency.
// Interview   Before: "I would sort the array and count consecutive elements." After: "Sorting takes O(n log n), but using a hash map to count frequencies allows us to solve this in O(n) time and O(k) space, where k is the number of unique bird types."
// Pitfalls    (1) Failing to handle the requirement to return the smallest ID when multiple types share the maximum frequency.  (2) Assuming the bird IDs are contiguous or start from 1, though the hash map approach correctly handles any integer IDs.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int migratoryBirds(List<Integer> arr) {
    HashMap <Integer,Integer>map=new HashMap<>();
    for(int i=0;i<arr.size();i++){
        int key=arr.get(i);
        if(map.containsKey(key)){
            map.put(key,map.get(key)+1);
        }
        else{
            map.put(key,1);
        }
    }
    int max=Integer.MIN_VALUE;
    for(Integer key:map.keySet()){
        if(map.get(key)>max){
            max=map.get(key);
        }  
    }
    List<Integer>val=new ArrayList<>();
    for(Integer key:map.keySet()){
        if(map.get(key)==max){
            val.add(key);
        }
    }
    int res=Integer.MAX_VALUE;
    for(int i=0;i<val.size();i++){
        if(res>val.get(i)){
            res=val.get(i);
        }
    }
    return res;
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
