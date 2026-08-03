// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?isFullScreen=true
// Problem     Queues: A Tale of Two Stacks
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:56 a.m.
// Technique   two-stacks-lazy-transfer
// Time        O(q) amortized
// Space       O(q)
// Insight     The implementation maintains a FIFO queue by using one stack for incoming elements and a second stack to reverse the order only when the second stack is empty.
// Interview   Before: "How would you implement a queue using only stacks?" After: "I use two stacks to achieve amortized O(1) time per operation. By transferring elements from the input stack to the output stack only when the output stack is empty, I ensure the oldest elements are always at the top of the output stack."
// Pitfalls    (1) Failing to check if the second stack is empty before popping or peeking, which would violate the FIFO order.  (2) Performing the stack transfer inside every operation instead of only when the second stack is empty, which increases overhead.  (3) Assuming the input stack is empty when the output stack is empty, which is incorrect as the input stack may contain new elements.
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
    
