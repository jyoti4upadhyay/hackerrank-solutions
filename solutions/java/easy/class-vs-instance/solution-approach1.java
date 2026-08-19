// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/class-vs-instance/problem?isFullScreen=true
// Problem     Class vs. Instance
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 10:04 a.m.
// Technique   object-oriented-state-management
// Time        O(1)
// Space       O(1)
// Insight     The class maintains an internal state variable that is validated upon initialization and modified through specific instance methods to enforce age-based logic.
// Pitfalls    (1) Failing to initialize age to 0 when the input is negative, as the provided code logic requires an explicit print statement and default assignment.  (2) Incorrectly implementing the age boundaries, specifically missing the inclusive check for age 13 or the exclusive check for age 18.  (3) Omitting the required print statement format for invalid ages, which causes test case failures due to strict output matching.
// ──────────────────────────────────────────────────



public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge<0)System.out.println("Age is not valid, setting age to 0.");
        else {this.age=initialAge;}
	}

	public void amIOld() {
        if(age<13){
            System.out.println("You are young.");
        }
        else if(age>=13 && age<18){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
	}

	public void yearPasses() {
        age++;
	}

