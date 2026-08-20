// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
// Problem     Java Comparator
// Difficulty  Medium
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-20, 02:59 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        Player[] play=new Player[num];
        Checker checker=new Checker();
        
        for(int i=0;i<play.length;i++){
            play[i]=new Player(sc.next(),sc.nextInt());
        }
        sc.close();
        Arrays.sort(play,checker);
        for(int i=0;i<play.length;i++){
            System.out.printf("%s %s\n", play[i].name ,play[i].score);
        }
    }  
        
}
class Player{
    String name;
    int score;
    Player(String name,int score){
        this.name=name;
        this.score=score;
    }
}
class Checker implements Comparator<Player>{
    
    public int compare(Player a,Player b){
        if(a.score!=b.score){
            return b.score-a.score;
        }
        return a.name.compareTo(b.name);
    }    
}
