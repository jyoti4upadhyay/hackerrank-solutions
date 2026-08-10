// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
// Problem     Java Stack
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-10, 04:18 p.m.
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



