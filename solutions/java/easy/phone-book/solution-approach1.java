// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
// Problem     Java Map
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 11:27 p.m.
// Technique   hash-map-lookup
// Time        O(N + Q)
// Space       O(N)
// Insight     The implementation uses a hash map to store name-to-phone mappings, enabling constant-time retrieval for each query provided in the input stream.
// Interview   Before: "I would use a nested loop to search the list for each query." After: "Using a HashMap reduces the lookup time to O(1) per query, resulting in O(N+Q) total time complexity, where N is the number of entries and Q is the number of queries."
// Pitfalls    (1) Failing to consume the newline character after reading the integer phone number, which causes the next name read to be an empty string.  (2) Using an Integer type for phone numbers, which may cause overflow if the input exceeds the 32-bit signed integer limit.  (3) Assuming the input stream ends immediately after the last query, ignoring the requirement to process queries until the end-of-file.
// ──────────────────────────────────────────────────

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer>hs=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            if(!hs.containsKey(name)){
                hs.put(name, phone);
            }
		}
		while(in.hasNext()){
			String s=in.nextLine();
            if(hs.containsKey(s)){
                System.out.println(s+"="+hs.get(s));
            }
            else{
                System.out.println("Not found");
            }
		}
        
	}
    
}



