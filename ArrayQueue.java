public class ArrayQueue {
    private int[] queue;     
    private int front;      
    private int rear;        
    private int size;        
    private int capacity;   

 
    public ArrayQueue(int capacity) 
    {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;      
        this.rear = -1;      
        this.size = 0;       
    }


    public void enqueue(int value) 
    {
        if (isFull()) 
        {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;  
        queue[rear] = value;          
        size++;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue()
    {
        if (isEmpty())
         {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;  
        size--;
        System.out.println("Dequeued: " + removed);
        return removed;
    }

   
    public int peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
    }

    
    public boolean isEmpty()
    {
        return size == 0;
    }

   
    public boolean isFull() 
    {
        return size == capacity;
    }

    public void displayQueue() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        ArrayQueue queue = new ArrayQueue(5); 

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        queue.displayQueue();

        
        queue.enqueue(60);

    
        queue.dequeue();
        queue.dequeue();

        queue.displayQueue();

    
        System.out.println("Front Element: " + queue.peek());

    
        queue.enqueue(60);
        queue.enqueue(70);

        queue.displayQueue();
    }
}
