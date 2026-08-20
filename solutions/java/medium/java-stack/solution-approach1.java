// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Problem     Java Stack
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-20, 10:13 p.m.
// Technique   stack-based-bracket-matching
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a stack of opening brackets and validates that every closing bracket matches the most recently pushed opening bracket, ensuring the string is balanced if the stack is empty upon completion.
// Interview   Before: "How would you validate nested structures like parentheses?" After: "I use a stack to track opening brackets, popping them when a matching closing bracket appears. This approach runs in O(n) time and O(n) space, correctly handling cases where the stack is empty or contains unmatched openers."
// Pitfalls    (1) Failing to check if the stack is empty before calling peek() when encountering a closing bracket.  (2) Returning true when the stack is not empty after processing the entire string, which indicates unmatched opening brackets.  (3) Ignoring that the problem requires checking for balanced pairs, not just counting total occurrences of each bracket type.
// ──────────────────────────────────────────────────

import java.util.*;
class Solution{
	
	public static void main(String []argh){
		Scanner sc = new Scanner(System.in); 
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(cal(input)); 
           
		}
		
	}
    public static boolean cal(String str){
        Stack<Character>stck=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='['){
                stck.push(str.charAt(i));
            }
            else{
                if(stck.isEmpty()){
                    return false;
                }
                else if(str.charAt(i)=='}' && stck.peek()=='{'){
                    stck.pop();
                }
                else if(str.charAt(i)==']' &&  stck.peek()=='['){
                    stck.pop();
                }
                else if(str.charAt(i)==')' && stck.peek()=='('){
                    stck.pop();
                }
            }
            
        }
        if(stck.isEmpty()){
            return true;
        }
        return false;
    }
}



