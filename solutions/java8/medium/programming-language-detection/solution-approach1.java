// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/programming-language-detection/problem?isFullScreen=true
// Problem     Building a Smart IDE: Programming Language Detection
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 11:44 a.m.
// Technique   keyword-based-heuristic-classification
// Time        O(N)
// Space       O(N)
// Insight     The implementation identifies the programming language by checking for the presence of unique language-specific keywords or preprocessor directives within the concatenated input string.
// Interview   Before: "How would you classify source code without a parser?" After: "I used keyword matching to detect Java, C, or Python. This O(N) approach scans the input for specific markers like 'import java', '#include', or 'def', which is efficient for small snippets."
// Pitfalls    (1) The heuristic fails if a comment in one language contains a keyword from another language.  (2) The logic assumes the presence of specific markers, which may not exist in minimal code snippets.  (3) String concatenation in a loop creates multiple intermediate objects, potentially impacting performance on very large inputs.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        while(sc.hasNextLine()){
            str=str+sc.nextLine()+"\n";
        }
        str=str.trim();
        if(str.contains("import java")){
            System.out.println("Java");
        }
        else if(str.contains("#include")){
            System.out.println("C");
        }
        else if(str.contains("#")||str.contains("def")) {
            System.out.println("Python");
        }
        
            
        }
}
