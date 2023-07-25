
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class pairwise_swap_nodes_of_linked_list {
public static Node pair_swap(Node head){
Node curr=head;
while(curr!=null&&curr.next!=null){
int temp=curr.data;
curr.data=curr.next.data;
curr.next.data=temp;
curr=curr.next.next;



}
return head;

}
public static void display(Node head){
    Node curr=head;
    while(curr!=null){
    System.out.print(curr.data+" ");
    curr=curr.next;
}System.out.println();
}

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
pair_swap(head);
display(head);
    }

}
