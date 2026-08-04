// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reverse-a-linked-list/problem?isFullScreen=true
// Problem     Reverse a linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 07:17 p.m.
// Technique   three-pointer-iterative-reversal
// Time        O(n)
// Space       O(1)
// Insight     The algorithm maintains three pointers to track the current node, its predecessor, and its successor, effectively reversing the direction of each next pointer in a single pass.
// Interview   Before: "I would use a stack to reverse the list." After: "Using three pointers allows for an O(n) time and O(1) space solution, which is optimal for reversing a linked list in place, even when the input head is null."
// Pitfalls    (1) Failing to store the next node before updating the current node's next pointer results in losing the remainder of the list.  (2) Returning the original head instead of the new head (the last non-null node) causes the function to return the tail of the reversed list.
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
    SinglyLinkedListNode prev=null;
    SinglyLinkedListNode temp=null;
    SinglyLinkedListNode head=currnode;

    while(currnode!=null){
        temp=currnode.next;
        currnode.next=prev;
        prev=currnode;
        currnode=temp;
    }
    head=prev;
    return head;
}


