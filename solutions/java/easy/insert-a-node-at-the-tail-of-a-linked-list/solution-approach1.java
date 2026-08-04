// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true
// Problem     Insert a Node at the Tail of a Linked List
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 04:58 p.m.
// ──────────────────────────────────────────────────



    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode curr=head;
        SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
        if(head==null){
            return newnode;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnode;
        
        return head;
    }

