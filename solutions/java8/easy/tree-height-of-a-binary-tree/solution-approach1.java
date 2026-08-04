// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?isFullScreen=true
// Problem     Tree: Height of a Binary Tree
// Difficulty  Easy
// Subdomain   Trees
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 11:52 a.m.
// Technique   recursive-depth-first-search
// Time        O(n)
// Space       O(h)
// Insight     The function calculates the height by recursively finding the maximum depth of subtrees and adding one for each edge, returning negative one for null nodes to ensure a single-node tree results in zero.
// Interview   Before: "How do you calculate the height of a tree?" After: "I use a recursive DFS approach that returns -1 for null nodes, ensuring the edge count is correct. This runs in O(n) time and O(h) space, where h is the tree height."
// Pitfalls    (1) Returning 0 for null nodes instead of -1, which incorrectly calculates the height of a single-node tree as 1 instead of 0.  (2) Failing to account for the definition of height as the number of edges rather than the number of nodes in the longest path.
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

