// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem?isFullScreen=true
// Problem     Get Node Value
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 01:01 a.m.
// Technique   two-pass-length-calculation
// Time        O(n)
// Space       O(1)
// Insight     The algorithm determines the target node's index from the head by subtracting the position from the tail plus one from the total list length.
// Interview   Before: "I could use a stack or recursion to reverse the list traversal." After: "I calculated the list length first to find the target index in O(n) time and O(1) space, ensuring I correctly handle the zero-based position from the tail."
// Pitfalls    (1) The loop condition pos < posfromhead && pos != posfromhead is redundant and potentially confusing for standard index-based traversal.  (2) The implementation assumes the positionFromTail is always valid and within the bounds of the linked list length.
// ──────────────────────────────────────────────────



class Result {

    /*
     * Complete the 'getNode' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER positionFromTail
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
}

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
    SinglyLinkedListNode curr=llist;
    int len=0;
    while(curr!=null){
        len++;
        curr=curr.next;
    }
    int posfromhead=len-(positionFromTail+1);
    int pos=0;
    SinglyLinkedListNode temp=llist;
    while(pos<posfromhead && pos!=posfromhead){
         temp=temp.next;
         pos++; 
    }
    return temp.data;
    }

