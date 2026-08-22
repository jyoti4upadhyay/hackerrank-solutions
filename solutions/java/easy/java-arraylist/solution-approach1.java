// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
// Problem     Java Arraylist
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 07:39 p.m.
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
