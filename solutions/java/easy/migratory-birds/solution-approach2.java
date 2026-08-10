// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
// Problem     Migratory Birds
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 11:14 p.m.
// Technique   hash-map-frequency-counting
// Time        O(n)
// Space       O(1)
// Insight     The algorithm tracks bird sighting frequencies in a hash map and iterates through the keys to identify the smallest ID associated with the maximum frequency.
// Interview   Before: "I would sort the array first to handle the tie-breaking rule." After: "Using a hash map allows O(n) time complexity, and by checking the key during the frequency comparison, I ensure the smallest ID is returned when counts are equal, maintaining O(1) auxiliary space since there are only five bird types."
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
    // Write your code here
    HashMap<Integer,Integer>map=new HashMap<>();
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
    int k=0;
    for(Integer key:map.keySet()){
        if(max<map.get(key)){
            max=map.get(key);
            k=key;
        }
        else if(max==map.get(key)){
            if(k>key){
                max=map.get(key);
                k=key;
            }
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
