// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/almost-sorted/problem?isFullScreen=true
// Problem     Almost Sorted
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-29, 02:02 p.m.
// Technique   sorting-comparison-and-index-tracking
// Time        O(N log N)
// Space       O(N)
// Insight     The algorithm identifies all indices where the input array deviates from its sorted version and validates whether these deviations can be resolved by a single swap or a single reverse operation.
// Interview   Before: "How do I detect if a swap or reverse fixes the array?" After: "Compare the array to its sorted version to find mismatched indices. If there are two, it is a swap; if more, check if reversing the segment restores order. This runs in O(N log N) time due to sorting."
// Pitfalls    (1) Failing to account for the 1-based indexing requirement when printing the swap or reverse indices.  (2) Assuming that any number of mismatches greater than two can be fixed by a reverse operation without verifying the sorted order of the reversed segment.  (3) Neglecting the requirement to prioritize a swap operation over a reverse operation when both are valid.
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

    /*
     * Complete the 'almostSorted' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void almostSorted(List<Integer> arr) {
    // Write your code here
    List<Integer>ls=new ArrayList<>(arr);
    Collections.sort(ls);
    List<Integer>list=new ArrayList<>();
    List<Integer>idx=new ArrayList<>();
    for(int i=0;i<ls.size();i++){
        if(arr.get(i)!=ls.get(i)){
            list.add(arr.get(i));
            idx.add(i);
        }
    }
    if(list.size()==0){
        System.out.println("yes");
        return ;
    }
    if(list.size()==2){
        System.out.println("yes");
        System.out.println("swap "+(idx.get(0)+1)+" "+(idx.get(1)+1));
    }
    else if(list.size()>2){
        //confirm ki reverse hoga 
        Collections.reverse(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                System.out.println("no");
                return;
            }   
        }
        System.out.println("yes");
        System.out.println("reverse "+(idx.get(0)+1)+" "+(idx.get(idx.size()-1)+1));
    }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.almostSorted(arr);

        bufferedReader.close();
    }
}
