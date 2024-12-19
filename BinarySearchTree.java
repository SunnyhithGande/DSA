class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
public class BinarySearchTree
{
    Node root;
    public Node insert(Node node,int data)
    {
        if(node == null)
        {
            node = new Node(data);
            return node;
        }
        if(data < node.data)
        {
            node.left = insert(node.left, data);
        }
        else if(data > node.data)
        {
            node.right = insert(node.right, data);
        }
        return node;
    }
        public void Traverse(Node root) 
        {
           if (root == null) 
           {
               return;
           }
           System.out.print(root.data + " ");
           Traverse(root.left);
           Traverse(root.right);
        }
    public static void main(String args[])
    {
        BinarySearchTree BST = new BinarySearchTree();
        Node node = null;
        node=BST.insert(node,3);
        BST.insert(node,4);
        BST.insert(node,451);
        BST.insert(node,5);
        BST.insert(node,7);
        BST.insert(node,76);
        BST.Traverse(node); 
    }
}
