// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
// Problem     Bill Division
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 01:39 a.m.
// Technique   linear-sum-exclusion
// Time        O(n)
// Space       O(1)
// Insight     The algorithm calculates the total cost of all items excluding the one at index k and compares half of that sum against the amount Anna contributed.
// Interview   Before: "I would iterate through the list and sum everything." After: "I iterate once in O(n) time to sum all items except the one at index k, then compare the result to the contribution to determine if a refund is needed."
// Pitfalls    (1) Failing to exclude the item at index k correctly by using an incorrect loop condition.  (2) Assuming the division by two will always result in an integer without considering the problem constraint that the refund is always an integer.  (3) Printing the wrong output format when the bill is split fairly versus when a refund is required.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
    int total=0;
    for(int i=0;i<bill.size();i++){
        if(i!=k){
            total=total+bill.get(i);    
        } 
    }
    int split=total/2;
    if(split<b){
        int refund=b-split;
        System.out.println(refund);
    }
    else{
        System.out.println("Bon Appetit");
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] billTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billTemp[i]);
            bill.add(billItem);
        }

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
