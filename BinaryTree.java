import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Scanner sc = new Scanner(System.in);

    Node construct(Node root) {
        System.out.println("Enter the element:");
        int data = sc.nextInt();
        if (data != -1) {
            Node newNode = new Node(data);
            root = newNode;
            System.out.println("Enter the left child of " + data);
            root.left = construct(root.left);
            System.out.println("Enter the right child of " + data);
            root.right = construct(root.right);
        } else {
            return null;
        }
        return root;
    }

    public void Traverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Traverse(root.left);
        Traverse(root.right);
    }

    public void Traverse1(Node root) {
        if (root == null) {
            return;
        }
        Traverse1(root.left);
        System.out.print(root.data + " ");
        Traverse1(root.right);
    }

    public void Traverse2(Node root) {
        if (root == null) {
            return;
        }
        Traverse2(root.left);
        Traverse2(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();
        Node root = null;
        root = bt.construct(root);
        bt.sc.close();
        System.out.println("THE ENTERED ELE ARE:");
        bt.Traverse(root);
        System.out.println("\nPOSTORDER:");
        bt.Traverse2(root);
        System.out.println("\nINORDER:");
        bt.Traverse1(root);
    }
}
