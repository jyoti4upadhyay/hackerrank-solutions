// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem?isFullScreen=true
// Problem     Delete a Node
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 11:04 p.m.
// Technique   iterative-pointer-traversal
// Time        O(n)
// Space       O(1)
// Insight     The algorithm traverses to the node immediately preceding the target position and updates its next pointer to bypass the node at the specified index.
// Interview   Before: "How do I remove a node at a specific index?" After: "I traverse to the node at position-1 and re-link its next pointer to skip the target. This runs in O(n) time and O(1) space, handling the head removal as a special case."
// Pitfalls    (1) Failing to handle the head removal case where position is zero, which would cause a NullPointerException if attempting to access curr.next.  (2) Assuming the list has enough nodes to reach position-1, which leads to a NullPointerException when accessing curr.next.next if the position is out of bounds.
// ──────────────────────────────────────────────────



class Result {

    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
}

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code 
    int currPos=0;
    SinglyLinkedListNode head=llist;
    SinglyLinkedListNode curr=llist;
    if(position==0){
        return head.next;
    }
     while(currPos<position-1){
        curr=curr.next;
        currPos++;
    }
    SinglyLinkedListNode temp=curr.next.next;
    curr.next=temp;
    return head;
    }

