class InsertionLL {
    Node head; // Head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) { // Insert at the beginning
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            // Traverse to the node just before the insertion position
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }

            if (current == null) {
                System.out.println("Position out of bounds");
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Traverse and display the list
    void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting nodes
        list.insertAtPosition(10, 0); // Insert 10 at position 0
        list.insertAtPosition(20, 1); // Insert 20 at position 1
        list.insertAtPosition(30, 2); 
        list.insertAtPosition(15, 1); 

        list.traverse();
    }
}