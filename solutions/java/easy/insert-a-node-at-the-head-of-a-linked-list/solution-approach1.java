// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?isFullScreen=true
// Problem     Insert a node at the head of a linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:27 p.m.
// Technique   node-reassignment-at-head
// Time        O(1)
// Space       O(1)
// Insight     The function creates a new node and updates its next pointer to the current head, effectively making the new node the new head of the list.
// Interview   Before: "How do I insert a node at the start of a linked list?" After: "I create a new node, point its next to the current head, and return the new node as the new head. This is an O(1) operation that correctly handles empty lists where the head is null."
// Pitfalls    (1) Failing to return the new node reference, which prevents the caller from updating the head pointer of the list.  (2) Neglecting to handle the null head case, which would cause a NullPointerException when attempting to set the next pointer.
// ──────────────────────────────────────────────────



    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode head=llist;
        SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
        if(head==null){
            head=newnode; 
            return newnode;  
        }
        newnode.next=head;
        head=newnode;
        return head;
    }

