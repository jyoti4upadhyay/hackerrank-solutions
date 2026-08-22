// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-instanceof-keyword/problem?isFullScreen=true
// Problem     Java Instanceof keyword
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 01:06 a.m.
// Technique   instanceof-type-checking
// Time        O(N)
// Space       O(N)
// Insight     The algorithm iterates through the ArrayList and uses the instanceof operator to classify each object into one of three distinct types, incrementing corresponding counters for each match.
// Interview   Before: "I would use a series of if-else statements to check the object type." After: "Using instanceof allows for safe runtime type identification in O(N) time, where N is the number of elements in the list, ensuring each instance is correctly categorized into its respective class."
// Pitfalls    (1) Failing to account for the possibility of null elements in the ArrayList, which would return false for all instanceof checks.  (2) Using if-else if blocks instead of independent if statements, which would incorrectly handle objects if they were allowed to inherit from multiple types in this hierarchy.
// ──────────────────────────────────────────────────

import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOFTutorial{
	
   static String count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element instanceof Student)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}
