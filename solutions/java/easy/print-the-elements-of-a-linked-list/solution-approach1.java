// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true
// Problem     Print the Elements of a Linked List
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:05 p.m.
// ──────────────────────────────────────────────────



    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        if(head==null){
            System.out.println("null");
        }
        else{
            SinglyLinkedListNode curr=head;
            while(curr!=null){
                System.out.println(curr.data);
                curr=curr.next;
            }
        }
    }

