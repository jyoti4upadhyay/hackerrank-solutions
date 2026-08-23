// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
// Problem     Valid Username Regular Expression
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 12:21 p.m.
// Technique   regular-expression-pattern-matching
// Time        O(N)
// Space       O(1)
// Insight     The regular expression enforces a mandatory alphabetic start followed by seven to twenty-nine alphanumeric or underscore characters to satisfy the total length constraint of eight to thirty characters.
// Interview   Before: "How would you validate the username constraints using procedural logic?" After: "Using a regex pattern like ^[A-Za-z][a-zA-Z0-9_]{7,29}$ ensures O(N) time complexity, where N is the string length, by strictly enforcing the alphabetic start and the 8-30 character length requirement in a single pass."
// Pitfalls    (1) Failing to account for the total length constraint by miscalculating the quantifier range as {8,30} instead of {7,29} after the first character.  (2) Including non-alphabetic characters in the first position by omitting the anchor or using an incorrect character class.  (3) Allowing invalid characters like '?' by failing to restrict the character set to alphanumeric and underscores.
// ──────────────────────────────────────────────────


class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression ="^[A-Za-z][a-zA-Z0-9_]{7,29}$";
}

