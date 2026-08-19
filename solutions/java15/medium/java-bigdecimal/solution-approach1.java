// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
// Problem     Java BigDecimal
// Difficulty  Medium
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 12:38 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        Arrays.sort(str,new Comparator<String>() {
            public int compare(String a,String b){
                BigDecimal bg1=new BigDecimal(a);
                BigDecimal bg2=new BigDecimal(b);
                
                return( bg2.compareTo(bg1)); 
            }
        });
        
         for (String x : str) {
            System.out.println(x);
         }
    }
}
