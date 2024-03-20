https://leetcode.com/problems/merge-in-between-linked-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode curr = list1;
        int index = 0;
        while (index < a - 1) {
            curr = curr.next;
            index++;
        }
        ListNode front = curr;
        while (index < b + 1) {
            curr = curr.next;
            index++;
        }
        ListNode rear = curr;
        ListNode secondListTail = list2, secondListHead = list2;
        while (secondListTail.next != null) {
            secondListTail = secondListTail.next;
        }
        front.next = secondListHead;
        secondListTail.next = rear;
        return list1;

    }
}
