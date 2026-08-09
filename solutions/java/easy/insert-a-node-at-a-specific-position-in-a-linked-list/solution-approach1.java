// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?isFullScreen=true
// Problem     Insert a node at a specific position in a linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:47 p.m.
// Technique   iterative-pointer-traversal
// Time        O(n)
// Space       O(1)
// Insight     The algorithm traverses the list to the node immediately preceding the target position and updates the pointers to splice the new node into the sequence.
// Interview   Before: "I would traverse to the target index and reassign pointers." After: "I traverse to position minus one in O(n) time, then perform constant-time pointer updates. This handles the insertion by splicing the new node between the current node and its successor, ensuring the list structure remains intact."
// Pitfalls    (1) The code assumes the position is valid and does not handle cases where position is zero or exceeds the list length, potentially causing a NullPointerException.  (2) The loop condition currPos < position - 1 fails to account for inserting at the head, which requires returning the new node as the new head.
// ──────────────────────────────────────────────────



static class Result {}
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
    SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
    SinglyLinkedListNode head=llist;
    
    int currPos=0;//head
    SinglyLinkedListNode curr=head;
    while(currPos<position-1){
        curr=curr.next;
        currPos++;
    }
    SinglyLinkedListNode temp=curr.next;
    curr.next=newnode;
    newnode.next=temp;
    return head;
    }


