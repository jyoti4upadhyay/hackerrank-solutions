// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
// Problem     Java Arraylist
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 07:39 p.m.
// Technique   nested-arraylist-lookup
// Time        O(N + Q)
// Space       O(N + M)
// Insight     The solution stores rows as nested ArrayLists and validates query indices against the list size and row bounds before accessing elements.
// Interview   Before: "How would you handle variable-length rows and lookups?" After: "I used a List of Lists to store the data, allowing O(1) access per query. The time complexity is O(N+M) to build the structure and O(Q) for queries, while handling 1-based indexing by subtracting one from inputs."
// Pitfalls    (1) Failing to convert 1-based input indices to 0-based list indices results in IndexOutOfBoundsException.  (2) Neglecting to check if the row index x is within the bounds of the outer list before accessing ls.get(x).  (3) Assuming the row exists without verifying if the column index y is within the bounds of the specific inner list.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        List<List<Integer>> ls =new ArrayList<>();
        for(int i=0;i<num;i++){
            List<Integer>row=new ArrayList<>();
            int r=sc.nextInt();
            for(int j=0;j<r;j++){
                row.add(sc.nextInt()); 
            }
            ls.add(row);
        } 
        int queries=sc.nextInt();
        for(int j=0;j<queries;j++){
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            if(x>=ls.size() ||x<0 ||  y>=ls.get(x).size() || y<0 || ls.get(x).size()==0 ){
                System.out.println("ERROR!");
            }
            else {
                System.out.println(ls.get(x).get(y));
            }
        }
    }
}
