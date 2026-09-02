// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/split-number/problem?isFullScreen=true
// Problem     Split the Phone Numbers
// Difficulty  Easy
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 12:00 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            if(str.matches("\\d{1,3}(\\s|-)\\d{1,3}(\\s|-)(\\d){4,10}")){
                String[] code=str.split("[\\s\\-]");
                System.out.println("CountryCode="+code[0]+",LocalAreaCode="+code[1]+",Number="+code[2]);
            }
        }
        
    }
}
