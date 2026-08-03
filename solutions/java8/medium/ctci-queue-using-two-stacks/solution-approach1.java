// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?isFullScreen=true
// Problem     Queues: A Tale of Two Stacks
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:56 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        List<Integer>ls=new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              s1.push(scan.nextInt());
            } else if (operation == 2) {
                if(s2.isEmpty()){
                    while(!(s1.isEmpty())){
                        s2.push(s1.pop());
                    }
                }
                s2.pop();
            } else if (operation == 3) { // print/peek
            if(s2.isEmpty()){
                while(!(s1.isEmpty())){
                    s2.push(s1.pop());
                }
            }
            ls.add(s2.peek());
            }
        }
        for(int i=0;i<ls.size();i++){
                        System.out.println(ls.get(i));
        }
    }
}
    
