// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
// Problem     Day 12: Inheritance
// Difficulty  Easy
// Subdomain   30 Days of Code
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 09:40 a.m.
// Technique   inheritance-and-array-averaging
// Time        O(N)
// Space       O(1)
// Insight     The Student class extends the Person base class and computes the average of the testScores array to determine the corresponding letter grade based on defined ranges.
// Interview   Before: "How do I implement inheritance and calculate a grade?" After: "I use the super keyword to initialize the base class and iterate through the scores array in O(N) time to compute the average, then map it to the required character grade."
// Pitfalls    (1) Failing to call the super constructor with the correct parameters as required by the Person base class definition.  (2) Incorrectly handling the grade boundaries, specifically the exclusive upper bounds for ranges like 80-89 or 70-79.  (3) Assuming the testScores array is empty, which would cause an ArithmeticException during the division by testScores.length.
// ──────────────────────────────────────────────────



class Student extends Person{
	private int[] testScores;
    Student(String firstName,String lastName,int identification,int[] testScores){
        super(firstName, lastName, identification);
        this.testScores=testScores;
    }
    public char calculate(){
        int sum=0;
        for(int i=0;i<testScores.length;i++){
            sum=sum+testScores[i];
        }
        int avg=sum/testScores.length;
        if(avg>=90 && avg<=100){
            return 'O';
        }
        else if(avg>=80 && avg<90){
            return 'E';
        }
        else if(avg>=70 && avg<80){
            return 'A';
        }
        else if(avg>=55 && avg<70){
            return 'P';
        }
        else if(avg>=40 && avg<55){
            return 'D';
        }
        else {
            return 'T';
        }
    }
}

