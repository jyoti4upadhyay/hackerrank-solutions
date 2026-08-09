// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem?isFullScreen=true
// Problem     Reverse a doubly linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 03:00 a.m.
// ──────────────────────────────────────────────────



static class Result {}

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
    // Write your code here
    DoublyLinkedListNode curr=head;
    DoublyLinkedListNode temp=null;
    DoublyLinkedListNode prev=null;
    
    while(curr!=null){
        temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
    }
    return prev;
}
