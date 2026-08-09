// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem?isFullScreen=true
// Problem     Delete duplicate-value nodes from a sorted linked list
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 02:02 a.m.
// Technique   two-pointer-traversal
// Time        O(n)
// Space       O(1)
// Insight     The algorithm maintains a current node and a look-ahead pointer to skip consecutive nodes with identical data values until a new value is encountered or the list ends.
// Interview   Before: "How do you remove duplicates from a sorted linked list?" After: "Since the list is sorted, I use two pointers to compare adjacent nodes. If they match, I skip the duplicate; otherwise, I advance. This O(n) approach handles empty lists and lists with all identical values correctly."
// Pitfalls    (1) Failing to handle the null head case, which causes a NullPointerException on llist.next.  (2) Neglecting to terminate the list by setting curr.next to null after the loop finishes, which leaves trailing duplicates in the final list.  (3) Incorrectly updating the curr pointer before the look-ahead pointer, which breaks the link between distinct values.
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

