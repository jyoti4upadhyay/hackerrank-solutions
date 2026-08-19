// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
// Problem     Java Substring
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:09 p.m.
// Technique   java-string-substring-method
// Time        O(n)
// Space       O(n)
// Insight     The implementation leverages the Java String substring method, which extracts characters from the start index inclusive to the end index exclusive.
// Interview   Before: "I would iterate through the string and append characters to a StringBuilder." After: "Using the built-in substring method is more idiomatic and efficient, operating in O(n) time where n is the length of the substring, while correctly handling the exclusive end index requirement."
// Pitfalls    (1) Confusing the inclusive start index with the exclusive end index, which leads to an off-by-one error in the output.  (2) Failing to account for the StringIndexOutOfBoundsException if the provided start or end indices fall outside the string's valid range.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String str=S.substring(start,end);
        System.out.println(str);
    }
}
