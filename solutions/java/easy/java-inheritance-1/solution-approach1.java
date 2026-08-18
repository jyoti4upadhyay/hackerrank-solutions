// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
// Problem     Java Inheritance I
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-18, 03:32 p.m.
// Technique   class-inheritance-extension
// Time        O(1)
// Space       O(1)
// Insight     The Bird class inherits the walk method from the Animal superclass while defining additional unique behaviors through fly and sing methods.
// Interview   Before: "How do you extend functionality in Java?" After: "By using the extends keyword, a subclass inherits all non-private members of the superclass, allowing for O(1) access to both inherited and newly defined methods."
// Pitfalls    (1) Failing to include the sing method within the Bird class scope.  (2) Misunderstanding that the Bird object retains access to the Animal class walk method via inheritance.
// ──────────────────────────────────────────────────



class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
    void sing(){
                System.out.println("I am singing");
    }
}


