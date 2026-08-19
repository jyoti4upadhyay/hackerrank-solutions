// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
// Problem     Java BigDecimal
// Difficulty  Medium
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 12:38 a.m.
// Technique   custom-comparator-bigdecimal-sort
// Time        O(n log n * m)
// Space       O(n * m)
// Insight     The implementation utilizes a custom comparator to sort string representations of numbers by their BigDecimal values in descending order while maintaining stability through the underlying sorting algorithm.
// Interview   Before: "How would you sort strings representing numbers numerically?" After: "I would use a custom comparator with BigDecimal to handle arbitrary precision, resulting in O(n log n * m) time complexity, where m is the maximum number of digits, ensuring numerically equivalent values maintain their original relative order."
// Pitfalls    (1) Using standard string comparison instead of BigDecimal comparison leads to incorrect numerical ordering.  (2) Failing to recognize that Arrays.sort for objects in Java is stable, which is required to preserve the original order of numerically equivalent inputs.  (3) Assuming BigDecimal handles all input formats without considering that the original string format must be preserved for output.
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
