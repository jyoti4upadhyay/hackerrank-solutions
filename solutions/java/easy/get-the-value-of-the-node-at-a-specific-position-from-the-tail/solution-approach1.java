// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem?isFullScreen=true
// Problem     Get Node Value
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 01:01 a.m.
// ──────────────────────────────────────────────────



class Result {

    /*
     * Complete the 'getNode' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER positionFromTail
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

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
    SinglyLinkedListNode curr=llist;
    int len=0;
    while(curr!=null){
        len++;
        curr=curr.next;
    }
    int posfromhead=len-(positionFromTail+1);
    int pos=0;
    SinglyLinkedListNode temp=llist;
    while(pos<posfromhead && pos!=posfromhead){
         temp=temp.next;
         pos++; 
    }
    return temp.data;
    }

