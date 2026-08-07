// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
// Problem     Missing Numbers
// Difficulty  Easy
// Subdomain   Search
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-07, 04:37 p.m.
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
