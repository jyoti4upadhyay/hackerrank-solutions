// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/html-attributes/problem?isFullScreen=true
// Problem     Detect HTML Attributes
// Difficulty  Easy
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 10:50 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<num;i++){
            str.append(sc.nextLine()).append("\n");
        }
        Pattern pattern=Pattern.compile("<([a-zA-Z0-9]+)([^>]*)>");
        Matcher matcher=pattern.matcher(str);
        TreeMap<String,TreeSet<String>>map=new TreeMap<>();
        while(matcher.find()){
            String tag=matcher.group(1);
            String content=matcher.group(2);
            
            map.putIfAbsent(tag,new TreeSet<>());
            Pattern attribuPattern=Pattern.compile("([a-zA-Z]+)\\s*=\\s*[\"']");
            Matcher matcher2=attribuPattern.matcher(content);
            while(matcher2.find()){
                map.get(tag).add(matcher2.group(1));
            }
        }
        for(String key:map.keySet()){
            System.out.print(key+":");
            TreeSet<String>attribute=map.get(key);
                System.out.println(String.join(",",attribute));
        }
    }
}
        
   
