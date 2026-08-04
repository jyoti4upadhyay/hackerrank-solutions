// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/reverse-a-linked-list/problem?isFullScreen=true
// Problem     Reverse a linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-04, 07:17 p.m.
// ──────────────────────────────────────────────────


class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
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

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
    SinglyLinkedListNode currnode=llist;
    SinglyLinkedListNode prev=null;
    SinglyLinkedListNode temp=null;
    SinglyLinkedListNode head=currnode;

    while(currnode!=null){
        temp=currnode.next;
        currnode.next=prev;
        prev=currnode;
        currnode=temp;
    }
    head=prev;
    return head;
}


