// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/detect-the-email-addresses/problem?isFullScreen=true
// Problem     Detect the Email Addresses
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 07:30 p.m.
// Technique   regex-pattern-matching-treeset
// Time        O(N * L * M) where N is lines, L is lin…
// Space       O(U * E) where U is unique emails and E…
// Insight     The implementation uses a regular expression to identify email patterns and a TreeSet to automatically handle deduplication and lexicographical sorting of the extracted addresses.
// Interview   Before: "How would you extract and sort unique emails from unstructured text?" After: "I would use a regex pattern to capture valid email formats and store them in a TreeSet, which ensures O(log U) insertion and automatic sorting, resulting in O(N * L) total time complexity."
// Pitfalls    (1) The regex pattern requires at least one dot in the domain part, which may fail to match valid emails that lack a top-level domain structure.  (2) The code assumes the input contains at least one email address, as calling ls.get(ls.size()-1) on an empty list will throw an IndexOutOfBoundsException.
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
