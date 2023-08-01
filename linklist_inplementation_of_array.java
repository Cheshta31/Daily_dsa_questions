class Node{
    int data;
    Node next;



Node(int d){
    data=d;
    next=null;

}}
public class linklist_implementation_of_stack {
    Node head;
    int sz;
    linklist_implementation_of_stack(){
        head=null;
        sz=0;
    }


    int size(){
        return sz;

    }
void push(int x){
    Node temp=new Node(x);
    temp.next=head;
    head=temp;
    sz++;

}
int  pop(){
if(head==null){
    return Integer.MAX_VALUE;
}
int res=head.data;
head=head.next;
sz--;
return res;

}
boolean isempty(){
    return (head==null);
}
int peek(){
    if(head==null)
    return Integer.MAX_VALUE;
    return head.data;
}
public static void main (String[] args)
{
	linklist_implementation_of_stack s=new linklist_implementation_of_stack();
    s.push(5);
    s.push(10);
    s.push(20);
    System.out.println(s.pop());
    System.out.println(s.size());
    System.out.println(s.peek());
    System.out.println(s.isempty());
}
}

