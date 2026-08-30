// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/acm-icpc-team/problem?isFullScreen=true
// Problem     ACM ICPC Team
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-31, 02:44 a.m.
// Technique   brute-force-pairwise-comparison
// Time        O(n^2 * m)
// Space       O(n^2)
// Insight     The algorithm evaluates every unique pair of attendees to calculate the union of their known topics by counting indices where at least one attendee has a '1'.
// Interview   Before: "I would use a bitmask to represent topics for faster comparison." After: "The current implementation uses O(n^2 * m) time to check all pairs, which is acceptable given the constraints where n is up to 500 and m is up to 500."
// Pitfalls    (1) Storing all pair counts in an ArrayList consumes O(n^2) space, which may exceed memory limits for large n.  (2) Sorting the entire list of pair counts adds unnecessary O(n^2 log(n^2)) time complexity instead of tracking the maximum and frequency in a single pass.
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
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
    List<Integer>ls=new ArrayList<>();
    for(int i=0;i<topic.size()-1;i++){
        for(int j=i+1;j<topic.size();j++){
            String p1=topic.get(i);
            String p2=topic.get(j);
            int count=0;
            for(int k=0;k<p1.length();k++){
                if(p1.charAt(k)=='0' && p2.charAt(k)=='0'){
                    continue;
                }
                else {
                    count++;
                }
            }
            ls.add(count); 
        }
    }
    Collections.sort(ls);
    List<Integer>res=new ArrayList<>();
    res.add(ls.get(ls.size()-1));
    int max=ls.get(ls.size()-1);
    int c=0;
    for(int i=0;i<ls.size();i++){
        if(ls.get(i)==max){
            c++;
        }
    }
    res.add(c);
    return res;
    
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
