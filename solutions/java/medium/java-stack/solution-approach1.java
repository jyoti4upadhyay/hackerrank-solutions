// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Problem     Java Stack
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-20, 10:13 p.m.
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



