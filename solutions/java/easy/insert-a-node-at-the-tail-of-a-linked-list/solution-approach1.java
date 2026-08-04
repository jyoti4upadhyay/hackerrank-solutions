// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true
// Problem     Insert a Node at the Tail of a Linked List
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 04:58 p.m.
// Technique   linear-traversal-tail-insertion
// Time        O(n)
// Space       O(1)
// Insight     The algorithm traverses the list until the last node is reached, then updates the next pointer of that node to reference the newly created node.
// Interview   Before: "I would use a recursive approach to find the tail." After: "I implemented an iterative approach with O(n) time complexity, ensuring the head is returned correctly even when the initial list is empty by handling the null case explicitly."
// Pitfalls    (1) Failing to handle the empty list case where the head is null, which would cause a NullPointerException during traversal.  (2) Incorrectly updating the head pointer when the list is empty, as the new node must become the new head.
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

