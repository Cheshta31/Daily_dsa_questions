
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head=null; ListNode tail=null;
if(list1==null){
    return list2;
}
else if(list2==null){
    return list1;
}
if(list1.val<=list2.val){
    head=tail=list1;
    list1=list1.next;
}
else{
    head=tail=list2;
    list2=list2.next;
}
while(list1!=null && list2!=null){
    if(list1.val<=list2.val){

         tail.next=list1;
         tail=list1;
         list1=list1.next;
    }
    else{
        tail.next=list2;
        tail=list2;
        list2=list2.next;
    }
}
if(list1==null)
{
    tail.next=list2;
}
else{
    tail.next=list1;
}
return head;

    }
}
