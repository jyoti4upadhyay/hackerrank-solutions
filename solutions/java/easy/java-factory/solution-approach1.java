// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
// Problem     Java Factory Pattern
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 12:10 p.m.
// Technique   factory-pattern-conditional-instantiation
// Time        O(1)
// Space       O(1)
// Insight     The factory method returns a new instance of a class implementing the Food interface based on the provided string parameter.
// Interview   Before: "How do I implement a factory to return different objects?" After: "I use conditional logic to instantiate the specific class required, ensuring O(1) time complexity for object creation based on the input string."
// Pitfalls    (1) Failing to handle null or unexpected input strings that do not match pizza or cake.  (2) Returning an object that does not implement the required Food interface.
// ──────────────────────────────────────────────────


            if(order.equals("pizza")){
                Food pizza=new Pizza();
                return pizza;
            }
            Food  cake=new Cake();
            return cake;

