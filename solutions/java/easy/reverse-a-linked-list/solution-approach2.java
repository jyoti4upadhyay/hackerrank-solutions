// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reverse-a-linked-list/problem?isFullScreen=true
// Problem     Reverse a linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 11:29 p.m.
// Technique   three-pointer-iterative-reversal
// Time        O(n)
// Space       O(1)
// Insight     The algorithm maintains three pointers to track the previous, current, and next nodes, effectively reversing the direction of each next pointer during a single linear traversal.
// Interview   Before: "How would you reverse a linked list in place?" After: "I use three pointers to reassign each node's next reference to its predecessor, achieving O(n) time and O(1) space complexity while correctly handling the null head case."
// Pitfalls    (1) Failing to store the next node in a temporary variable before overwriting the current node's next pointer results in losing the remainder of the list.  (2) Returning the original head instead of the new head, which is the last non-null node processed, causes the function to return an incorrect reference.
// ──────────────────────────────────────────────────



class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
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

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
    SinglyLinkedListNode currnode=llist;
    SinglyLinkedListNode temp=null;
    SinglyLinkedListNode prev=null;
    while(currnode!=null){
        temp=currnode.next;
        currnode.next=prev;
        prev=currnode;
        currnode=temp;
    }
    //SinglyLinkedListNode last=currnode;
   // SinglyLinkedListNode last2=temp;
    return prev;
    }

