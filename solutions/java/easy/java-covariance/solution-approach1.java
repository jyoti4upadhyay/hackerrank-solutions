// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-covariance/problem?isFullScreen=true
// Problem     Covariant Return Types
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 12:21 a.m.
// ──────────────────────────────────────────────────


import java.lang.Override;
//Complete the classes below
class Flower {
    public String whatsYourName(){
        return "I have many names and types.";
    } 
}

class Jasmine extends Flower{
    public String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower {
    public String whatsYourName(){
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower(){
        Flower flower=new Flower();
        return flower;
    }  
}

class WestBengal extends Region{
    public Jasmine yourNationalFlower(){
        Jasmine jasmine=new Jasmine();
        return jasmine;
    }
}

class AndhraPradesh extends Region {
    public Lily yourNationalFlower(){
        Lily lily=new Lily();
        return lily;
    }
}

