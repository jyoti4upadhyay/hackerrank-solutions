// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/detect-html-links/problem?isFullScreen=true
// Problem     Detect HTML links
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 02:13 p.m.
// Technique   regex-pattern-matching-and-tag-stripping
// Time        O(N * L)
// Space       O(L)
// Insight     The solution uses a non-greedy regex to capture the href attribute and the inner content of anchor tags, then recursively strips nested HTML tags from the captured text content.
// Interview   Before: "How would you extract nested HTML content?" After: "I would use a regex to isolate the anchor tag's href and inner body, then apply a secondary regex to strip all nested tags from that body. This approach runs in O(N * L) time, where N is the number of lines and L is the line length."
// Pitfalls    (1) The regex assumes the href attribute is always enclosed in single or double quotes, which may fail on malformed HTML missing quotes.  (2) The nested tag stripping regex removes all content within angle brackets, which might incorrectly strip text if the link content contains literal characters like '<' or '>'.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            Pattern pattern=Pattern.compile("(?is)<a\\s*[^>]*href\\s*=\\s*[\"']([^\"']*)[\"'][^>]*>(.*?)</a>");
            Matcher m=pattern.matcher(str);
            while(m.find()){
                String link=m.group(1);
                String text=m.group(2);
                
                text=text.replaceAll("(?is)<[^>]*>","");
                System.out.println(link+","+text.trim());
            }
        }
        
    }
}
