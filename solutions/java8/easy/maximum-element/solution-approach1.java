// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/maximum-element/problem?isFullScreen=true
// Problem     Maximum Element
// Difficulty  Easy
// Subdomain   Stacks
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 02:55 a.m.
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
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */
     
     
     // 1=push this elelment ,2=pop this element , 3=find max
    public static List<Integer> getMax(List<String> operations) {
    // Write your code here
    Stack<Integer> stc=new Stack<>();
    Stack<Integer>maxStc=new Stack<>();
    List<Integer> getMax=new ArrayList<>();
    int max=Integer.MIN_VALUE;
    for(int i=0;i<operations.size();i++){
        if(operations.get(i).charAt(0)=='1'){
        int num=Integer.parseInt(operations.get(i).split(" ")[1]);
        stc.push(num);
        if(maxStc.isEmpty() || num>=maxStc.peek()){
            maxStc.push(num);
        }
        }
        else if(operations.get(i).charAt(0)=='2'){
            int popNum=stc.pop();
            if(popNum==maxStc.peek()){
                maxStc.pop();
            }
        }
        else {
            getMax.add(maxStc.peek());
        }
    }
    return getMax;
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
