class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList
{
    Node head;
    void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node tempNode = head;
            while(tempNode.next != null)
            {
                tempNode = tempNode.next;
            }
                tempNode.next = newNode;
        }
    }
                void printList()
                {
                    Node tempNode = head;
                    while(tempNode != null)
                    {
                        System.out.print(tempNode.data + " ");
                        tempNode = tempNode.next;
                    }
                        System.out.println();
                 }
                        public static void main(String[] args)
                        {
                            LinkedList list = new LinkedList();
                            list.add(1);
                            list.add(2);
                            list.add(3);
                            list.add(4);
                            list.add(5);
                            list.printList();
                        }
                        public void insertAtPosition(int i, int j) {
                            throw new UnsupportedOperationException("Unimplemented method 'insertAtPosition'");
                        }
                        public void traverse() {
                            throw new UnsupportedOperationException("Unimplemented method 'traverse'");
                        }
 }
