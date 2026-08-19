// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/class-vs-instance/problem?isFullScreen=true
// Problem     Class vs. Instance
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 10:04 a.m.
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

