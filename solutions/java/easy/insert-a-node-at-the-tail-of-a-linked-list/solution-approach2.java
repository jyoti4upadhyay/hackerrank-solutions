// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true
// Problem     Insert a Node at the Tail of a Linked List
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:20 p.m.
// Technique   linear-traversal-tail-insertion
// Time        O(n)
// Space       O(1)
// Insight     The algorithm traverses the list until the current node's next pointer is null, then appends the new node to the end of the list.
// Interview   Before: "How do I add a node to the end of a linked list?" After: "I traverse the list to find the last node in O(n) time, ensuring I handle the empty list case by returning the new node as the head."
// Pitfalls    (1) Failing to handle the empty list case where the head is null, which would cause a NullPointerException when accessing curr.next.  (2) Forgetting to return the original head pointer after appending the new node to the tail.
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

