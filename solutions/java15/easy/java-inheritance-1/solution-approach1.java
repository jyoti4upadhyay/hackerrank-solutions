// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
// Problem     Java Inheritance I
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 10:25 a.m.
// Technique   class-inheritance-extension
// Time        O(1)
// Space       O(1)
// Insight     The Bird class inherits the Walk method from the Animal superclass while defining its own unique fly and sings methods.
// Interview   Before: "How do you extend functionality in Java?" After: "You use the extends keyword to inherit methods from a parent class, allowing the subclass to access superclass members while adding its own. This implementation runs in O(1) time and space as it performs simple method calls on a single object instance."
// Pitfalls    (1) Failing to use the extends keyword prevents the Bird class from accessing the Walk method defined in the Animal class.  (2) Naming the method incorrectly, such as using sing instead of sings, causes a compilation error when the main method attempts to invoke it.
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
