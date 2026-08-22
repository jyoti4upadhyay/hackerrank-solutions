// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
// Problem     Java List
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 08:56 p.m.
// Technique   array-list-dynamic-manipulation
// Time        O(Q * N)
// Space       O(N)
// Insight     The implementation utilizes the Java ArrayList class to perform dynamic insertions and deletions, where each operation triggers a linear-time shift of subsequent elements.
// Interview   Before: "I would use a LinkedList to optimize insertions and deletions to O(1)." After: "While LinkedList offers O(1) mutation, ArrayList is preferred here for O(1) random access and better cache locality, despite O(N) shifts per query, resulting in O(Q * N) total time complexity."
// Pitfalls    (1) Using ArrayList.add(index, element) or ArrayList.remove(index) results in O(N) time complexity per operation due to element shifting.  (2) Failing to account for the index-based nature of the operations, which can throw an IndexOutOfBoundsException if the index is outside the current list bounds.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<num;i++){
            ls.add(sc.nextInt());   
        }
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            String str=sc.next();
            if(str.equals("Insert")){
                int ind=sc.nextInt();
                int val=sc.nextInt();
                ls.add(ind,val);
            }
            else if(str.equals("Delete")){
                int idx=sc.nextInt();
                ls.remove(idx);
            }
        }
        for(int k=0;k<ls.size();k++){
            System.out.print(ls.get(k)+" ");
        }
    }
}
