// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/java-dme-assessment/challenges/magic-square-forming/problem?isFullScreen=true
// Problem     Forming a Magic Square
// Difficulty  Medium
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-27, 04:56 p.m.
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
