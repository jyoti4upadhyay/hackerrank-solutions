// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
// Problem     Java Datatypes
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 12:57 p.m.
// ──────────────────────────────────────────────────

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                short powS=(short)(Math.pow(2,15)-1);
                int powI=(int)Math.pow(2,32-1);
                long powL=(long)Math.pow(2,64-1);
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }
                if(x>=-powS-1 && x<=powS){
                    System.out.println("* short");   
                }
                if(x>=-powI-1 && x<=powI){
                    System.out.println("* int");
                }
                if(x>=-powL-1 && x<=powL){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



