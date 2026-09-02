// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/split-number/problem?isFullScreen=true
// Problem     Split the Phone Numbers
// Difficulty  Easy
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 12:01 p.m.
// Technique   regex-group-splitting
// Time        O(N * L)
// Space       O(L)
// Insight     The implementation uses a regular expression to validate the phone number format and then splits the string by delimiters to extract the three required segments.
// Interview   Before: "How would you parse a structured string with variable delimiters?" After: "I used a regex pattern to validate the structure and split the string, resulting in O(N * L) time complexity where N is the number of lines and L is the string length."
// Pitfalls    (1) The regex pattern \d{1,3}(\s|-)\d{1,3}(\s|-)(\d){4,10} strictly enforces the segment lengths defined in the constraints.  (2) Using split("[\\s\\-]") correctly handles both space and hyphen delimiters as specified in the problem statement.  (3) The code assumes the input strictly conforms to the provided format, as it does not handle cases where the regex match fails.
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
