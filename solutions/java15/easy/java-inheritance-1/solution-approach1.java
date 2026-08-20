// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
// Problem     Java Inheritance I
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 10:25 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.Walk();
        bird.fly();
        bird.sings();
    }
}
class Animal{
    void Walk(){
        System.out.println("I am walking");
    }
    
}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sings(){
        System.out.println("I am singing");
    }
}
