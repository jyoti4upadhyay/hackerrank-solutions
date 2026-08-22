// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
// Problem     Java List
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 08:56 p.m.
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
