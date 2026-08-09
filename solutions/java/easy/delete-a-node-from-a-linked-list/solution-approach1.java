// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem?isFullScreen=true
// Problem     Delete a Node
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 11:04 p.m.
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

