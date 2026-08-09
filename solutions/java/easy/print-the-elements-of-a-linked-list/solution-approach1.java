// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true
// Problem     Print the Elements of a Linked List
// Difficulty  Easy
// Subdomain   Linked Lists
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 10:05 p.m.
// Technique   iterative-linked-list-traversal
// Time        O(n)
// Space       O(1)
// Insight     The algorithm traverses the linked list by updating a pointer to the next node until it reaches null, printing each node's data value during the iteration.
// Interview   Before: "How do I print all elements in a linked list?" After: "You can use a while loop to traverse the list in O(n) time and O(1) space, ensuring you handle the null head case by checking if the list is empty before starting."
// Pitfalls    (1) The code prints the string null if the head is null, which may violate specific output requirements if the problem expects no output for empty lists.  (2) Failing to update the current pointer to curr.next inside the loop will result in an infinite loop.
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

