// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem?isFullScreen=true
// Problem     Delete duplicate-value nodes from a sorted linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 02:02 a.m.
// ──────────────────────────────────────────────────



class Result {

    /*
     * Complete the 'removeDuplicates' function below.
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

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
    SinglyLinkedListNode curr=llist;
    SinglyLinkedListNode temp=llist.next;
    while(temp!=null){
        if(curr.data==temp.data){
            temp=temp.next;  
        }
        else if(curr.data!=temp.data){
            curr.next=temp;
            curr=temp;
            temp=temp.next;
        }  
    }
    if(temp==null){
        curr.next=null;
    }
    return llist;

    }

