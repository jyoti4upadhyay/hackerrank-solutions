// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true
// Problem     Java Method Overriding
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 01:15 p.m.
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
