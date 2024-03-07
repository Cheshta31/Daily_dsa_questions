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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;int i=1;
        while(curr.next!=null){
            curr=curr.next;
            i++;
        }
System.out.println(i);
if(i%2==0){
    i+=1;
}
ListNode temp=head;
int j=0;
while(j!=i/2){
    temp=temp.next;
    j++;

}
return temp;
    }
}
