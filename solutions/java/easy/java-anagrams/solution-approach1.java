// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-19, 11:55 p.m.
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

