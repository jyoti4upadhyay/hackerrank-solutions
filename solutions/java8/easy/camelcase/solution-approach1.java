// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
// Problem     CamelCase
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:07 a.m.
// ──────────────────────────────────────────────────

import java.util.*;


public class CamelCase{
    
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        camelWord(str);
    }
    public static void camelWord(String str){
        String[] arr=str.split("(?=[A-Z])");
        System.out.println(arr.length);
    }
}
