// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/hackerrank-language/problem?isFullScreen=true
// Problem     HackerRank Language
// Difficulty  Easy
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 11:10 a.m.
// Technique   regex-pattern-matching
// Time        O(N * L)
// Space       O(L)
// Insight     The solution validates the language string by checking it against a pre-defined regex pattern containing all allowed programming languages.
// Interview   Before: "I would use a hash set to store the languages for O(1) lookup." After: "Using a regex pattern is also efficient here, resulting in O(N * L) time complexity where N is the number of requests and L is the length of the language string."
// Pitfalls    (1) The regex pattern is case-sensitive, so failing to match the exact casing of the provided language list will result in an INVALID output.  (2) The split method assumes the input string always contains exactly one space between the ID and the language, which may fail if the input format varies.
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
            String[] arr=str.split(" ");
            if(arr[1].matches("^(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$")){
                System.out.println("VALID");
                
            }  
            else {
                System.out.println("INVALID");
            }      
            }
    }
}
