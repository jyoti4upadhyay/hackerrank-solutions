// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/balanced-brackets/problem?isFullScreen=true
// Problem     Balanced Brackets
// Difficulty  Medium
// Subdomain   Stacks
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:55 a.m.
// Technique   stack-based-bracket-matching
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a stack of opening brackets and ensures that every closing bracket matches the most recently pushed opening bracket, resulting in an empty stack only if the sequence is balanced.
// Interview   Before: "I would use a counter to track open brackets." After: "A counter fails because order matters, so I use a stack to ensure O(n) time and space complexity by validating that each closing bracket matches the most recent opening bracket."
// Pitfalls    (1) Failing to check if the stack is empty before calling peek() when encountering a closing bracket.  (2) Returning YES when the stack is not empty after processing the entire string, which indicates unmatched opening brackets.  (3) Incorrectly matching different bracket types by failing to verify the specific pair type during the pop operation.
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
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    
    Stack<Character> stc=new Stack<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
            stc.push(s.charAt(i));  
        }
        else if(s.charAt(i)==']' || s.charAt(i)==')' || s.charAt(i)=='}'){
            if(stc.isEmpty()){
                return "NO";
            }
            else{
                if(stc.peek()=='[' && s.charAt(i)==']'){
                stc.pop();
                }
                else if(stc.peek()=='(' && s.charAt(i)==')'){
                    stc.pop();
                }
                else if(stc.peek()=='{' && s.charAt(i)=='}'){
                    stc.pop();
                
                }
                else{
                    return "NO";
                    
                }
            }
       }
    }
    if(stc.isEmpty()){
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
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

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
