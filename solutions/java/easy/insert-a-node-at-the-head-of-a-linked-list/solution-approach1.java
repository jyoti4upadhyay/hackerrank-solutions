// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?isFullScreen=true
// Problem     Insert a node at the head of a linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:27 p.m.
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

