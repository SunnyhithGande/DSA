public class Stack {
    int top = -1; 
    int max = 10;
    int[] arr = new int[max];

    public void push(int data) 
    {
        if (isFull()) 
        {
            System.out.println("Stack is full");
            return;
        }
        top = top +1;
        arr[top] = data;
        System.out.println("Pushed: " + data);
    }

    public int pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty");
            return -1; 
        }
        return arr[top--];
    }

    
    boolean isEmpty() 
    {
        return top == -1;
    }

    
    boolean isFull()
    {
        return top == max - 1;
    }

    void display() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        while(top != -1)
        {
            System.out.println(arr[top]);
            top--;
        }
        
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Stack s = new Stack();

        s.push(10);
        s.push(123);
        s.push(154);

        s.display();


        s.display();
    }
}
