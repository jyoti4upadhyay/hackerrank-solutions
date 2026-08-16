// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true
// Problem     Super Reduced String
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-16, 09:39 p.m.
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
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    // Write your code here
    Stack<Character>stc=new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(stc.isEmpty()){
            stc.push(ch);
        }
        else {
            char top=stc.peek();
            if(top==ch){
                stc.pop();
            }
            else{
                stc.push(ch);
            }
        } 
    }
    if(stc.isEmpty()){
        return "Empty String";
    }
    StringBuilder res =new StringBuilder();
    int t=stc.size()-1;
    while(t>=0){
        res=res.append(stc.pop());
        t--;
    }
    res=res.reverse();
    return res.toString();
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
