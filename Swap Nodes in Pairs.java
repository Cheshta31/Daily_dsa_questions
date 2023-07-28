/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         if (head == null || head.next == null) {
        return head;
    }
    
    // Store the next node for recursion
    ListNode nextNode = head.next;
    
    // Swap the current node and the next node
    head.next = swapPairs(nextNode.next);
    nextNode.next = head;
    
    // Return the new head (nextNode becomes the head after swapping)
    return nextNode;
    }
}
