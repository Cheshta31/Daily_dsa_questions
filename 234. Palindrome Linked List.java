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
    public boolean isPalindrome(ListNode head) {
        ArrayList <Integer> al=new ArrayList<>();
        
ListNode curr=head;
while(curr!=null){
    al.add(curr.val);
    curr=curr.next;
}
List<Integer> newList = new ArrayList<>(al);
  Collections.reverse(al);
  System.out.println(al);
   System.out.println(newList);
  return (newList.equals(al));

    }
}
