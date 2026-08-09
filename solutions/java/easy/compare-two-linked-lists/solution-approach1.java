// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/compare-two-linked-lists/problem?isFullScreen=true
// Problem     Compare two linked lists
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-10, 12:11 a.m.
// Technique   parallel-traversal-comparison
// Time        O(min(N, M))
// Space       O(1)
// Insight     The algorithm traverses both lists simultaneously, returning false if data mismatches occur or if one list terminates before the other.
// Interview   Before: "I would compare the lists by calculating their lengths first." After: "I can optimize this to O(min(N, M)) time and O(1) space by traversing both lists in parallel, ensuring both reach null simultaneously to confirm equal length and content."
// Pitfalls    (1) Failing to verify that both pointers are null after the loop, which incorrectly identifies lists of different lengths as equal.  (2) Accessing the data attribute of a null pointer if the loop condition is not strictly checked.
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

