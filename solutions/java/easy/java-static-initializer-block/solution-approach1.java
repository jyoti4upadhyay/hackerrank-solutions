// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 01:19 p.m.
// ──────────────────────────────────────────────────


    static int B;
    static int H;
    static boolean flag;
    
static{
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    flag=B>0 && H>0;
    if(flag==false){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
