// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:52 a.m.
// Technique   frequency-array-comparison
// Time        O(n)
// Space       O(1)
// Insight     The algorithm verifies anagram status by comparing character frequency counts stored in two fixed-size integer arrays after normalizing both strings to lowercase.
// Interview   Before: "How would you check if two strings are anagrams?" After: "I would normalize both strings to lowercase and count character frequencies using two integer arrays of size 26. This approach runs in O(n) time and O(1) space, effectively handling the case-insensitive requirement by mapping characters to array indices."
// Pitfalls    (1) Failing to handle strings of unequal length, which immediately disqualifies them as anagrams.  (2) Assuming input strings contain only lowercase letters without performing the required toLowerCase() normalization.  (3) Incorrectly mapping characters to array indices by failing to subtract the 'a' character offset.
// ──────────────────────────────────────────────────


    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        int[] num1=new int[26];
        int[] num2=new int[26];
        if(a.length()!=b.length()){  
            return false;
        }
        else {
            for(int i=0;i<a.length();i++){
                char ch=a.charAt(i);
                char ch1=b.charAt(i);
                num1[ch-'a']++;
                num2[ch1-'a']++;
            } 
            for(int j=0;j<26;j++){
                if(num1[j]!=num2[j]){
                    return false;
                }
            } 
            return true;  
            }
    }

