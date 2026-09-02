// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ide-identifying-comments/problem?isFullScreen=true
// Problem     Building a Smart IDE: Identifying comments
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 08:25 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        while(sc.hasNextLine()){
        str=str+sc.nextLine()+"\n";
        }
        Pattern pattern=Pattern.compile("((//.*)|/\\*([\\S\\s]*?)\\*/)");
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            String st=matcher.group();
            String[] arr=st.split("\n");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i].trim());
            }
        }
       
        
    }
}
