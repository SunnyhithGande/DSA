public class StacktoQueue {
    public static void main(String args[]) {
        Stack q=new Stack();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        Stack q1=new Stack();
        convert(q,q1);
        display(q);
    }
    static void display(Stack q) 
    {
        System.out.println(q);
    }
    static void convert(Stack q,Stack q1) 
    {
        if(q.isEmpty()) 
        {
            System.out.println("Stack is Empty");
        } else 
        {
            while(!q.isEmpty()) 
            {
                q1.push(q.pop());
            }
            q1.pop();
            while(!q1.isEmpty()) 
            {
                q.push(q1.pop());
            }
        }
    }
}    
    
    