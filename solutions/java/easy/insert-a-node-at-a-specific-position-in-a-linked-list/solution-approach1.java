// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?isFullScreen=true
// Problem     Insert a node at a specific position in a linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:47 p.m.
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


