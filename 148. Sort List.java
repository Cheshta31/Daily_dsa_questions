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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
Collections.sort(al);curr=head;
System.out.println(al);
for(int i=0;i<al.size();i++){
int v=al.get(i);
curr.val=v;
curr=curr.next;

}

return head;
    }
}
