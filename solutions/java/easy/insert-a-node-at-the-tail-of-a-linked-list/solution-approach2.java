// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true
// Problem     Insert a Node at the Tail of a Linked List
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:20 p.m.
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
        SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
        if(head==null){
            head=newnode;
            newnode.next=null;
            return newnode;
        }
            SinglyLinkedListNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newnode;
            newnode.next=null;
            return head;
    }

