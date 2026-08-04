// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?isFullScreen=true
// Problem     Tree: Height of a Binary Tree
// Difficulty  Easy
// Subdomain   Trees
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 11:52 a.m.
// ──────────────────────────────────────────────────



	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	if(root==null){
            return -1;
        }
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
        
        
        
        
    }

