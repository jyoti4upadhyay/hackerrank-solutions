// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
// Problem     Day 12: Inheritance
// Difficulty  Easy
// Subdomain   30 Days of Code
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 12:54 p.m.
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
