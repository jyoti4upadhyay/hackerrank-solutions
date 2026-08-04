// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem?isFullScreen=true
// Problem     Reverse a doubly linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 07:31 p.m.
// Technique   iterative-pointer-swapping
// Time        O(n)
// Space       O(1)
// Insight     The algorithm iterates through the list, swapping the next and prev pointers of each node until the entire sequence is reversed in place.
// Interview   Before: "How do you reverse a doubly linked list in place?" After: "I iterate through the list, swapping the next and prev pointers for each node. This approach runs in O(n) time and O(1) space, correctly handling the empty list case where the head is null."
// Pitfalls    (1) Failing to update the prev pointer of the nodes, which is required for a valid doubly linked list structure.  (2) Returning the original head instead of the new head, which is the last node of the original list.
// ──────────────────────────────────────────────────



static class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts INTEGER_DOUBLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
}

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
    // Write your code here
    DoublyLinkedListNode currnode=head;
    DoublyLinkedListNode prev=null;
    DoublyLinkedListNode next=null;
    while(currnode!=null){
        next=currnode.next;
        currnode.next=prev;
        prev=currnode;
        currnode=next;                                                              
    }
    head=prev;
    return head;
    }
    
    
