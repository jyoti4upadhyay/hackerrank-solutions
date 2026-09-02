// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ide-identifying-comments/problem?isFullScreen=true
// Problem     Building a Smart IDE: Identifying comments
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 08:25 p.m.
// Technique   regex-pattern-matching-and-trimming
// Time        O(N)
// Space       O(N)
// Insight     The implementation uses a regular expression to capture both single-line and multi-line comment blocks, then processes each line by removing leading and trailing whitespace to satisfy the output requirements.
// Interview   Before: "How do I handle multi-line comments while preserving their internal structure?" After: "The regex captures the entire block, and splitting by newline allows for O(N) processing where each line is trimmed individually to meet the formatting constraints."
// Pitfalls    (1) Failing to trim leading whitespace from each line of a multi-line comment violates the requirement to remove leading white space before comments.  (2) Using a greedy regex quantifier instead of a non-greedy one would incorrectly merge multiple distinct comment blocks into a single match.  (3) Collapsing multi-line comments into a single line violates the requirement to preserve the original line structure.
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
