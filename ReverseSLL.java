class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class ReverseSLL {
    Node head;
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse() {
        Node prev=null;
        Node current;
        current=head;
        Node n;
        while(current!=null) {
            n=current.next;
            current.next=prev;
            prev=current;
            current=n;
        }
        head=prev;
    }
    public static void main(String[] args) {
        ReverseSLL list=new ReverseSLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.reverse();
        list.display();
    }
}