// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
// Problem     Missing Numbers
// Difficulty  Easy
// Subdomain   Search
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-07, 04:37 p.m.
// Technique   frequency-map-difference
// Time        O(n + m)
// Space       O(n + m)
// Insight     The algorithm calculates the frequency difference between the two lists by incrementing counts for the first list and decrementing for the second, identifying missing numbers as those with non-zero final frequencies.
// Interview   Before: "I would sort both arrays and compare them linearly." After: "Sorting takes O(N log N), but using a frequency map allows us to solve this in O(N + M) time, which is optimal given the constraints on the range of values."
// Pitfalls    (1) The implementation fails to return the result in ascending order as required by the problem statement.  (2) The logic incorrectly identifies numbers present in the first array but not the second as missing, violating the requirement to only find elements missing from the first array.
// ──────────────────────────────────────────────────

import java.io.*;
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
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    List<Integer> ls=new ArrayList<>();
    HashMap<Integer,Integer>hs=new HashMap<>();
    for(int i=0;i<arr.size();i++){
        int key=arr.get(i);
        if(hs.containsKey(key)){
            hs.put(key,hs.get(key)+1);
        }
        else{
            hs.put(key,1);
        }
    }
    for(int j=0;j<brr.size();j++){
        int key=brr.get(j);
        if(hs.containsKey(key)){
            hs.put(key,hs.get(key)-1);
        }
        else{
            hs.put(key,1);
        }
        
    }
    for(Integer key :hs.keySet()){
        if(hs.get(key)!=0){
            ls.add(key);
        }
    }
    return ls;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
