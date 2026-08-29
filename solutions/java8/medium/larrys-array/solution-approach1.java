// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/larrys-array/problem?isFullScreen=true
// Problem     Larry's Array
// Difficulty  Medium
// Subdomain   Implementation
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-29, 12:25 p.m.
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
     * Complete the 'larrysArray' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY A as parameter.
     */

    public static String larrysArray(List<Integer> A) {
    // Write your code here
    //inversion count kiya hai hume idhar kyunki rotate hone k baad inversion total ya toh +2 hoga ya -2 agr nhi hua toh no ho jayega isliye inversion sabke count kr liye agr divisible honge 2 se toh toh thik otherwise rotation k baad bhi woh apni shi possititon pe nhi aayega 
    int sum=0;
    for(int i=0;i<A.size();i++){
        int count=0;
        for(int j=i+1;j<A.size();j++){
            if(A.get(i)>A.get(j)){
                count++;
            } 
        }
        sum=sum+count;
    }
    if(sum%2==0){
        return "YES";
    }
    return "NO";
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.larrysArray(A);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
