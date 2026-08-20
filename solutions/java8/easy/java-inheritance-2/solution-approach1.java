// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true
// Problem     Java Inheritance II
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-20, 02:19 p.m.
// Technique   class-inheritance
// Time        O(1)
// Space       O(1)
// Insight     The Adder class inherits the add method from the Arithmetic superclass, allowing it to perform integer addition without explicit redefinition.
// Interview   Before: "How do I implement inheritance in Java?" After: "By using the extends keyword, the subclass inherits all non-private methods from the superclass, resulting in O(1) time and space complexity for this operation."
// Pitfalls    (1) Declaring the classes as public, which violates the specific constraint that classes should not be public.  (2) Attempting to redefine the add method instead of relying on the inherited implementation from the Arithmetic superclass.
// ──────────────────────────────────────────────────



class Arithmetic{
    public int add(int a ,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
     
}

