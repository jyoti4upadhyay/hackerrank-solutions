// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
// Problem     Java Regex
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-10, 03:44 p.m.
// Technique   regex-pattern-matching
// Time        O(N)
// Space       O(1)
// Insight     The regex validates an IP address by defining a repeating group for the first three octets followed by a final octet, ensuring each segment matches the range 0-255 using explicit digit patterns.
// Interview   Before: "How would you validate an IP address string?" After: "I would use a regex pattern to enforce the 0-255 range for each of the four octets. This approach runs in O(N) time relative to the string length, ensuring each segment is at most three digits long."
// Pitfalls    (1) Failing to escape the dot character in the regex, which would treat it as a wildcard matching any character instead of a literal period.  (2) Neglecting to anchor the regex with start and end boundaries, which could allow invalid strings containing valid IP substrings to pass validation.  (3) Overlooking the requirement that the pattern must handle leading zeros correctly as specified in the problem constraints.
// ──────────────────────────────────────────────────


class MyRegex{
    String pattern="(([0-9]|[0-9][0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[0-9][0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
   
    
}
