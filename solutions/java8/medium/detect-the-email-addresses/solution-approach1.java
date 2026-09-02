// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/detect-the-email-addresses/problem?isFullScreen=true
// Problem     Detect the Email Addresses
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 07:30 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[] sentence=new String[num];
        sc.nextLine();
        for(int i=0;i<num;i++){
            sentence[i]=sc.nextLine();
        }
        TreeSet<String>hs=new TreeSet<>();
        Pattern pattern =Pattern.compile("[a-zA-Z0-9_]+(?:\\.[a-zA-Z0-9_]+)*@[a-zA-Z0-9_]*(?:\\.[a-zA-Z0-9_]+)*\\.[a-zA-Z0-9_]{2,}");
        for(int i=0;i<sentence.length;i++){
            Matcher matcher=pattern.matcher(sentence[i]);
            while(matcher.find()){
                hs.add(matcher.group());
            }
        }
        List<String>ls=new ArrayList<>(hs);
        for(int i=0;i<ls.size()-1;i++){
            System.out.print(ls.get(i)+";");
        }
        System.out.print(ls.get(ls.size()-1));
        
        
        
    }
}
