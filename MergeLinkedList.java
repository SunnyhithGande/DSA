class Node 
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class MergeLinkedList 
{
    Node h;
    Node current;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (h == null) {
            h = newNode;
            return;
        }
        Node temp = h;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = h;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void merge(Node h1, Node h2) {
        if (h1 == null) {
            h = h2;
            return;
        }
        if (h2 == null) {
            h = h1;
            return;
        }
        if (h1.data <= h2.data) 
        {
            h = h1;
            h1 = h1.next;
        } else 
        {
            h = h2;
            h2 = h2.next;
        }
        
        current = h; 
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                current.next = h1;
                h1 = h1.next;
            } else {
                current.next = h2;
                h2 = h2.next;
            }
            current = current.next;
        }
        if (h1 != null) {
            current.next = h1;
        } else {
            current.next = h2;
        }
    }
    public static void main(String[] args) {
        MergeLinkedList obj1 = new MergeLinkedList();
        obj1.insert(1);
        obj1.insert(3);
        obj1.insert(5);
        MergeLinkedList obj2 = new MergeLinkedList();
        obj2.insert(2);
        obj2.insert(4);
        MergeLinkedList obj = new MergeLinkedList();
        obj.merge(obj1.h, obj2.h);
        System.out.println("Merged Linked List:");
        obj.printList();

    }
}
