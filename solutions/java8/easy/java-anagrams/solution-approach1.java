// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-17, 10:36 a.m.
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

