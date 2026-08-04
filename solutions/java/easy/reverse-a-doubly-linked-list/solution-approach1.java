// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem?isFullScreen=true
// Problem     Reverse a doubly linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 07:31 p.m.
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
    
    
