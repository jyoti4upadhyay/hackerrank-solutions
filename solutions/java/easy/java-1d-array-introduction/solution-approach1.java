// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
// Problem     Java 1D Array
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 03:13 p.m.
// Technique   array-initialization-and-sequential-assignment
// Time        O(n)
// Space       O(n)
// Insight     The implementation allocates a fixed-size integer array and populates it by mapping each sequential input integer to its corresponding index from zero to n minus one.
// Interview   Before: "I would use a dynamic list to store these values." After: "Since the size n is known upfront, using a primitive array is more memory-efficient with O(n) space and O(n) time complexity, avoiding the overhead of dynamic resizing."
// Pitfalls    (1) Attempting to access an index equal to or greater than n will trigger an ArrayIndexOutOfBoundsException.  (2) Failing to initialize the array with size n before attempting to assign values to indices will cause a NullPointerException.  (3) Using an incorrect loop condition like i <= a.length instead of i < a.length will result in an index out of bounds error.
// ──────────────────────────────────────────────────


        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
