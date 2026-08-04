// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true
// Problem     Insert a Node at the Tail of a Linked List
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-04, 11:01 a.m.
// Technique   linear-traversal-tail-insertion
// Time        O(n)
// Space       O(1)
// Insight     The algorithm traverses the list until the current node's next pointer is null, then appends the new node to the end of the list.
// Pitfalls    (1) Failing to handle the empty list case where the head is null results in a NullPointerException.  (2) Traversing until the current node is null instead of the next node causes the insertion to fail on non-empty lists.
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
            return newnode;
        }
        SinglyLinkedListNode currnode=head;
            while(currnode.next!=null){
                currnode=currnode.next;
            }
            currnode.next=newnode;
            return head;
        
    }

