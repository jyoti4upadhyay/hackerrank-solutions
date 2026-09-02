// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/detect-html-links/problem?isFullScreen=true
// Problem     Detect HTML links
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 02:13 p.m.
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
