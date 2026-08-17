// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true
// Problem     HackerRank in a String!
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-17, 03:43 p.m.
// Technique   stack-based-subsequence-matching
// Time        O(N)
// Space       O(N)
// Insight     The algorithm uses a stack to reverse the input string, allowing it to greedily match characters of the target word in their original relative order by popping from the stack.
// Interview   Before: "I would iterate through the string and keep track of the target index." After: "I used a stack to reverse the input, which allows O(N) time complexity to verify the subsequence by popping characters until a match is found for each target character."
// Pitfalls    (1) The stack approach consumes O(N) space to store all characters of the input string, which may be inefficient for very large strings.  (2) The string concatenation st = st + top inside the loop creates new string objects, potentially leading to O(M^2) overhead where M is the length of the target word.
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
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    // Write your code here
    String str="hackerrank";
    String st="";
    Stack<Character>stck=new Stack<>();
    for(int i=s.length()-1;i>=0;i--){
        stck.push(s.charAt(i));         
    }
    for(int i=0;i<str.length();i++){
        while(!stck.isEmpty()){
            char top=stck.pop();
            if(top==str.charAt(i)){
                st=st+top;
                break;
            }
        }
    }
    if(st.equals(str)){
        return "YES";
    }
    else{
        return "NO";
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
