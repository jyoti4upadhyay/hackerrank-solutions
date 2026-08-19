// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
// Problem     Day 12: Inheritance
// Difficulty  Easy
// Subdomain   30 Days of Code
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 09:40 a.m.
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

