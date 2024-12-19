import java.util.Queue;
import java.util.Scanner;
class Node2 
{
    int data;
    Node2 left;
    Node2 right;
    Node2(int data) 
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class LeveLOrderTraversal
{
    Scanner sc=new Scanner(System.in);
    public Node2 insert(Node2 root) 
    {
        System.out.print("Enter element: ");
        int ele=sc.nextInt();
        if(!(ele==-1)) 
        {
           Node2 newNode=new Node2(ele);
           root=newNode;
           System.out.println("Enter left of "+ele);
           root.left=insert(root.left);
           System.out.println("Enter right of "+ele);
           root.right=insert(root.right);
        }
        else 
        {
            return null;
        }
        return root;
    }
    public void LevelNode(Node2 root) 
    {
        if(root==null) 
        {
            return;
        }
        Queue<Node2> q=new java.util.LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
         {
            Node2 current=q.poll();
            System.out.print(current.data+" ");
            if(current.left!=null)
            {
                q.add(current.left);
            } if(current.right!=null) 
            {
                q.add(current.right);
            }
        }
    } 
    public static void main(String[] args) 
    {
        LeveLOrderTraversal node=new LeveLOrderTraversal();
        Node2 root=null;
        root=node.insert(root);
        System.out.print("Level order: ");
        node.LevelNode(root);
    }
}
    
    