// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/programming-language-detection/problem?isFullScreen=true
// Problem     Building a Smart IDE: Programming Language Detection
// Difficulty  Medium
// Subdomain   Applications
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-02, 11:44 a.m.
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
