import java.util.Stack;

public class ReverseStack 
{
    public static void reverseStack(Stack<Integer> stack) 
    {
        if (stack.isEmpty()) 
        {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }
    private static void insertAtBottom(Stack<Integer> stack, int element)
    {
        if (stack.isEmpty()) 
        {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, element);
        stack.push(top);
    }

    public static void main(String args[]) 
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
