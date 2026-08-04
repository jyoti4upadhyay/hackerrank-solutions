// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tree-preorder-traversal/problem?isFullScreen=true
// Problem     Tree: Preorder Traversal
// Difficulty  Easy
// Subdomain   Trees
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 11:11 a.m.
// Technique   recursive-preorder-traversal
// Time        O(N)
// Space       O(H)
// Insight     The algorithm visits the current node, then recursively processes the left subtree followed by the right subtree, maintaining the root-left-right order invariant.
// Interview   Before: "How would you print tree nodes in root-first order?" After: "I use a recursive approach to visit the root, then traverse left and right. This runs in O(N) time and O(H) space, where H is the tree height, handling the null root case by returning immediately."
// Pitfalls    (1) Failing to handle the null root case leads to a NullPointerException when accessing root.data.  (2) Printing an extra trailing space is acceptable here as the problem requires space-separated values, but logic must ensure the recursion correctly visits every node exactly once.
// ──────────────────────────────────────────────────



/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {
        
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

