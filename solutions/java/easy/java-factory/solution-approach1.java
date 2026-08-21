// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
// Problem     Java Factory Pattern
// Difficulty  Easy
// Subdomain   Advanced
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 12:10 p.m.
// ──────────────────────────────────────────────────


            if(order.equals("pizza")){
                Food pizza=new Pizza();
                return pizza;
            }
            Food  cake=new Cake();
            return cake;

