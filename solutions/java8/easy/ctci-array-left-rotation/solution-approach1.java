// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true
// Problem     Arrays: Left Rotation
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:07 a.m.
// Technique   array-reversal-partitioning
// Time        O(n)
// Space       O(n)
// Insight     The implementation achieves left rotation by reversing the entire array and then independently reversing the two segments defined by the rotation offset.
// Interview   Before: "I would use a nested loop to shift elements one by one." After: "I can achieve O(n) time and O(n) space by partitioning the array into two segments based on the rotation count d, ensuring efficient element relocation for circular shifts."
// Pitfalls    (1) The implementation fails if d exceeds the array size n, as the current logic does not apply a modulo operation to d.  (2) The code assumes d is strictly less than the array size, which may cause an ArrayIndexOutOfBoundsException if d equals or exceeds n.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int size=a.size();
    // Write your code here
    int arr[]=new int[size]; 
    for(int i=0;i<size;i++){
        arr[i]=a.get(i);
    }
    //rev whole arr
    int rev[] =new int[size];
    int k=0;
    for(int j=size-1;j>=0;j--){
        rev[k]=arr[j];
        k++;
    }
    
    //first half rev (size-d)
    int rev1[]=new int [size-d];
    int l=0;
    for(int p=size-d-1;p>=0;p--){
        rev1[l]=rev[p];
        l++;
    }
    //next half
    int rev2[]=new int[d];
    l=0;
    for(int q=size-1;q>=size-d;q--){
        rev2[l]=rev[q];
        l++;
    }
    //
    List<Integer> ls=new ArrayList<>();
    for(int i=0;i<rev1.length;i++){
        ls.add(rev1[i]);
    }
    for(int j=0;j<rev2.length;j++){
        ls.add(rev2[j]);
    }
    
    return ls;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotLeft(a, d);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
