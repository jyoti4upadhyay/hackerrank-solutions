// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true
// Problem     Super Reduced String
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-16, 10:16 a.m.
// Technique   stack-based-character-reduction
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a stack where each character is pushed unless it matches the top element, in which case the pair is removed to satisfy the reduction rule.
// Interview   Before: "I would use a nested loop to repeatedly scan and remove adjacent duplicates." After: "Using a stack allows us to process the string in a single O(n) pass, efficiently handling the reduction by comparing each character to the stack top, which is optimal for this problem."
// Pitfalls    (1) Failing to handle the empty stack case after all reductions, which must return the string 'Empty String' instead of an empty sequence.  (2) Incorrectly reversing the stack contents when building the final string, as the stack pops elements in reverse order of their appearance.
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
