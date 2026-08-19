// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 01:19 p.m.
// Technique   static-initializer-block-validation
// Time        O(1)
// Space       O(1)
// Insight     The static block executes once during class loading to validate input dimensions and set a boolean flag before the main method proceeds.
// Pitfalls    (1) Failing to print the exact required exception string including the java.lang.Exception prefix.  (2) Neglecting the requirement that both breadth and height must be strictly greater than zero.  (3) Assuming the main method can handle the exception if the static block does not explicitly manage the output.
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
