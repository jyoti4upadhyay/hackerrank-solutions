// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
// Problem     Day 12: Inheritance
// Difficulty  Easy
// Subdomain   30 Days of Code
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 12:54 p.m.
// Technique   class-inheritance-and-array-averaging
// Time        O(N)
// Space       O(N)
// Insight     The Student class extends the Person base class by storing an additional integer array and implementing a grade calculation method based on the arithmetic mean of the provided scores.
// Interview   Before: "How do I handle the base class constructor?" After: "Use the super keyword to initialize the base class fields, then store the array. The calculate method runs in O(N) time, where N is the number of test scores, by summing elements and mapping the average to a character grade."
// Pitfalls    (1) Failing to call the super constructor as the first statement in the derived class constructor.  (2) Incorrectly mapping the average ranges to the specified grade characters defined in the problem statement.  (3) Performing integer division that truncates the average before comparing it against the grade thresholds.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();
        int id=sc.nextInt();
        int num=sc.nextInt();
        int[] testScore=new int[num];
        for(int i=0;i<testScore.length;i++){
            testScore[i]=sc.nextInt();
        }
        Student person=new Student(firstName, lastName, id,testScore);
        person.display();
        System.out.println("Grade: "+person.calculate(testScore));
        
    }
}
class Person{
    String firstName;
    String lastName;
    int id;
    Person(String firstName,String lastName,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
    }
    public void display(){
        System.out.println("Name: "+lastName+", "+firstName);
        System.out.println("ID: "+id);
    }
}

class Student extends Person{
    int[] testScore;
    Student(String firstName,String lastName,int id,int[] testScore){
        super(firstName, lastName, id); 
        this.testScore=testScore;
    }
    public char calculate(int[] testScore){
        int sum=0;
        for(int i=0;i<testScore.length;i++){
            sum=sum+testScore[i];
        }
        int avg=sum/testScore.length;
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
        return 'T';
    }
}
