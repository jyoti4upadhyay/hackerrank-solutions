// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/java-dme-assessment/challenges/magic-square-forming/problem?isFullScreen=true
// Problem     Forming a Magic Square
// Difficulty  Medium
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-27, 04:56 p.m.
// Technique   brute-force-precomputed-magic-squares
// Time        O(1)
// Space       O(1)
// Insight     The algorithm calculates the absolute difference between the input matrix and all eight possible 3x3 magic squares, selecting the minimum total cost.
// Interview   Before: "I could try to generate magic squares using backtracking." After: "Since there are only eight possible 3x3 magic squares, it is more efficient to hardcode them and compare the input against each, resulting in O(1) time and space complexity."
// Pitfalls    (1) Failing to account for all eight possible rotations and reflections of a 3x3 magic square.  (2) Incorrectly calculating the absolute difference cost for each cell, violating the problem's cost definition.  (3) Assuming the input matrix is already a magic square and failing to check all eight precomputed possibilities.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {

    public static int formingMagicSquare(int[][] s) {
    
            int[][][] magic = {
                        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                                    {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                                                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                                                            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                                                                        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                                                                                    {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                                                                                                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                                                                                                            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}
                                                                                                                    };
                                                                                                                    
                                                                                                                            int minCost = Integer.MAX_VALUE;
                                                                                                                            
                                                                                                                                    // Check all 8 magic squares
                                                                                                                                            for (int k = 0; k < 8; k++) {
                                                                                                                                            
                                                                                                                                                        int cost = 0;
                                                                                                                                                        
                                                                                                                                                                    for (int i = 0; i < 3; i++) {
                                                                                                                                                                                    for (int j = 0; j < 3; j++) {
                                                                                                                                                                                    
                                                                                                                                                                                                        cost += Math.abs(s[i][j] - magic[k][i][j]);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                minCost = Math.min(minCost, cost);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                return minCost;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                        public static void main(String[] args) {
                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                Scanner sc = new Scanner(System.in);
                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                        int[][] s = new int[3][3];
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                // Input
                                                                                                                                                                                                                                                                                                        for (int i = 0; i < 3; i++) {
                                                                                                                                                                                                                                                                                                                    for (int j = 0; j < 3; j++) {
                                                                                                                                                                                                                                                                                                                                    s[i][j] = sc.nextInt();
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                int result = formingMagicSquare(s);
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                        System.out.println(result);
                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                                sc.close();
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    }
