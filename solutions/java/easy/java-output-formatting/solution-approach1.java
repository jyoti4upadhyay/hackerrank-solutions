// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:21 a.m.
// Technique   manual-string-padding-formatting
// Time        O(1)
// Space       O(1)
// Insight     The implementation manually constructs the required output format by calculating the necessary padding for strings and conditionally prepending leading zeros to integers based on their magnitude.
// Interview   Before: "How would you format output in Java?" After: "I would use System.out.printf with format specifiers like %-15s and %03d. This approach is O(1) time and space, ensuring strings are left-justified to 15 characters and integers are zero-padded to 3 digits as required."
// Pitfalls    (1) Failing to account for the exact 15-character width requirement for the string column.  (2) Incorrectly handling integers with fewer than three digits by not prepending the required number of leading zeros.  (3) Misinterpreting the loop constraint, which is fixed at three iterations based on the problem's sample input structure.
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



