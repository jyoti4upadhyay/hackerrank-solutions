// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Problem     Java Stack
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-10, 04:18 p.m.
// Technique   stack-based-bracket-matching
// Time        O(n)
// Space       O(n)
// Insight     The algorithm maintains a stack of unmatched opening brackets and pushes closing brackets onto the stack if they do not match the top element, resulting in an empty stack only if the string is balanced.
// Interview   Before: "I would use a counter to track bracket pairs." After: "A counter fails for nested structures like '([)]'. Using a stack ensures O(n) time and space by verifying that every closing bracket matches the most recently opened one, correctly handling all nesting levels."
// Pitfalls    (1) Failing to check if the stack is empty before calling peek() when encountering a closing bracket.  (2) Assuming that simply counting the number of each bracket type is sufficient to determine if the string is balanced.
// ──────────────────────────────────────────────────

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        String str=sc.nextLine();
        Stack<Character>stc=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stc.push(ch);
            }
            else if(ch==')'){
                if(!stc.isEmpty() && stc.peek()=='('){
                    stc.pop();
                }
                else{
                    stc.push(ch);
                }
            }
            else if(ch=='}'){
                if(!stc.isEmpty() && stc.peek()=='{'){
                    stc.pop();
                }
                else{
                    stc.push(ch);
                }
            }
            else if(ch==']'){
                if(!stc.isEmpty() && stc.peek()=='['){
                    stc.pop();
                }
                else {
                    stc.push(ch);
                }
            }
        }
        if(stc.isEmpty()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        }
        sc.close();
	}
}



