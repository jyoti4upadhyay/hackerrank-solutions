// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/tree-preorder-traversal/problem?isFullScreen=true
// Problem     Tree: Preorder Traversal
// Difficulty  Easy
// Subdomain   Trees
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 11:11 a.m.
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

