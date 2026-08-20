// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true
// Problem     Java Method Overriding
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 01:15 p.m.
// Technique   method-overriding-polymorphism
// Time        O(1)
// Space       O(1)
// Insight     The subclass overrides the superclass method to provide a specialized implementation while maintaining the same method signature.
// Interview   Before: "How do I change the behavior of a method in a subclass?" After: "By using the @Override annotation, the subclass replaces the superclass logic with its own, executing in O(1) time while ensuring the method signature matches exactly."
// Pitfalls    (1) Failing to use the @Override annotation, which prevents the compiler from verifying that the method signature matches the superclass.  (2) Changing the return type or parameter list, which results in method overloading rather than overriding.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Sports sp=new Sports();
        Soccer so=new Soccer();
        System.out.println(sp.getName());
        sp.getNumberOfTeamMembers();
        System.out.println(so.getName());
        so.getNumberOfTeamMembers();
    }
}

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in "+getName());
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in "+getName());
    }
}
