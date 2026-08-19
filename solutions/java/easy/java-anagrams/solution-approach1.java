// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:55 p.m.
// Technique   frequency-array-counting
// Time        O(N + M)
// Space       O(1)
// Insight     The algorithm maintains a frequency array of size 26 to track the net difference in character counts between two strings, returning true if all counts return to zero.
// Interview   Before: "I would sort both strings and compare them." After: "Sorting takes O(N log N), but using a frequency array reduces the time complexity to O(N + M), where N and M are the lengths of the strings, while handling case-insensitivity by normalizing characters to lowercase."
// Pitfalls    (1) The modulo operator is used on character offsets, which may produce incorrect indices if non-alphabetic characters are provided despite the problem constraints.  (2) The code assumes all input characters are English alphabetic characters as per the constraints, failing to handle potential whitespace or special characters.
// ──────────────────────────────────────────────────



    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] arr=new int[26];
        for(int i=0;i<a.length();i++){
            char ch=Character.toLowerCase(a.charAt(i));
            int ind=(ch-'a')%26;
            arr[ind]++;
        }
        for(int i=0;i<b.length();i++){
            char ch=Character.toLowerCase(b.charAt(i));
            int ind=(ch-'a')%26;
            arr[ind]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }    
        }
        return true;
    }

