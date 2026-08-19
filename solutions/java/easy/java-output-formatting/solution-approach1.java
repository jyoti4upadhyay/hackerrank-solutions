// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:21 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int spacecount=15-s1.length();
                String space="";
                for(int j=0;j<spacecount;j++){
                    space=space+" ";
                }
                
                if(x>9 && x<100){
                    System.out.println(s1+space+"0"+x);   
                }
                else if(x>=0 && x<=9){
                    System.out.println(s1+space+"00"+x);
                }
                else{
                System.out.println(s1+space+x);
                }
            }
            System.out.println("================================");

    }
}



