// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/compare-two-linked-lists/problem?isFullScreen=true
// Problem     Compare two linked lists
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 12:11 a.m.
// ──────────────────────────────────────────────────



    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode curr1=head1;
        SinglyLinkedListNode curr2=head2;
        while(curr1!=null && curr2!=null){
            if(curr1.data!=curr2.data){
                return false;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        if(curr1 ==null && curr2==null){
            return true;
        }
        return false;


    }

