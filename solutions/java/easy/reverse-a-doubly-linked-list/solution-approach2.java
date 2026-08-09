// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem?isFullScreen=true
// Problem     Reverse a doubly linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 03:00 a.m.
// Technique   iterative-pointer-swap
// Time        O(n)
// Space       O(1)
// Insight     The algorithm iterates through the list, swapping the next and previous pointers for each node until the current pointer reaches null, effectively reversing the list in place.
// Interview   Before: "How do you reverse a doubly linked list?" After: "I iterate through the list, swapping the next and previous pointers for each node. This approach runs in O(n) time and O(1) space, correctly handling the empty list case by returning null."
// Pitfalls    (1) Failing to update the prev pointer of the original head node to null, which is required for a valid doubly linked list structure.  (2) Neglecting to update the prev pointer of each node during the iteration, which breaks the doubly linked property of the reversed list.
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
