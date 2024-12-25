class Node
{
    int data;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoubleLinkedList
{
    private Node head;
    public void insertAtFirst(int data) 
    {
        //insert at first
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    /////INSERTION AT END 
    public void insertionAtEnd(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    public void insertionAtPosition(int pos,int data)
    {

        if(pos==1)
        {
            insertAtFirst(data);
        }
        else
        {
            insertionAtEnd(data);
        }
    }
    public void insertAtaPosition(int pos,int data)
    {
        Node newNode = new Node(10);
        Node current = head;
        int count = 1;
        while (current.next != null && count < pos - 1)
        {
            current = current.next;
            count++;
            }
            if (current.next == null && count == pos - 1)
            {
                current.next = newNode;
                newNode.prev = current;
            }
            else
            {
                Node nextNode = current.next;
                current.next = newNode;
                newNode.prev = current;
                newNode.next = nextNode;
                nextNode.prev = newNode;
            }
     }
public static void main(String args[])
{
    DoubleLinkedList sobj = new DoubleLinkedList();
    sobj.insertAtFirst(10);
    sobj.insertAtFirst(12);
    sobj.insertAtFirst(15);
    sobj.insertAtFirst(22);
    sobj.insertAtFirst(23);
    sobj.insertionAtEnd(34);
    sobj.insertionAtEnd(35);
    sobj.insertionAtEnd(29);
    sobj.display();
}
}

