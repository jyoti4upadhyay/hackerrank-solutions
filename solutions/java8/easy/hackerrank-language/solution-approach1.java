// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/hackerrank-language/problem?isFullScreen=true
// Problem     HackerRank Language
// Difficulty  Easy
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 11:10 a.m.
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
