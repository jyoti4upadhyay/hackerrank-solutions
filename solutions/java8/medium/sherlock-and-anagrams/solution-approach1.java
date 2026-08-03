// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?isFullScreen=true
// Problem     Sherlock and Anagrams
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:09 a.m.
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
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
        
        
    // Write your code here

    int flag=0;
    int size=s.length();
    //kitne length ka 
    for(int i=1;i<=size;i++){
        //kahan tak element honge(1 length ka toh 0-1)
        for(int j=0;j+i<=size;j++){
            String str1=s.substring(j,j+i);
            
            for(int k=j+1;k+i<=size;k++){
                String str2=s.substring(k,k+i);
                
                
                char[] arr1=str1.toCharArray();
                char[] arr2=str2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if(Arrays.equals(arr1,arr2)){
                    flag++;
                    
                }
            }  
        }
        
    }
    return flag;
    
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
