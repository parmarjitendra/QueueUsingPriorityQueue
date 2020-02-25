public class MyPriorityQueueUsingArray
{
    private int [] queue;
    private int front;
    private int rear;
    private int size;

    public int[] getQueue() {
        return queue;
    }

    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyPriorityQueueUsingArray(int sizeOfArray) {
        queue = new int[sizeOfArray];
        front = -1;
        rear = -1;
        size = 0;


    }

    boolean enqueue(int element)
    {
        boolean response = false;
        if(rear != queue.length-1)
        {
            rear++;
            queue[rear] = element;
            size++;
            response = true;
            for (int i = rear; i > front+1 ; i--)

            {
                if(queue[i] > queue[i-1])
                {
                    int temp = queue[i];
                    queue[i] = queue[i-1];
                    queue[i-1] = temp;
                }
            }
        }
        return response;
    }

    public boolean isEmpty()
    {
        boolean response = false;
        if(front==rear)
        {
            response = true;
        }
        return response;
    }


    public int dequeue()
    {
        int response = 0;
        if(!isEmpty())
        {
            front++;
            response = queue[front];
            size--;
        }
        return response;
    }

    public int peek()
    {
        int response = 0;
        if(!isEmpty())
        {
            response = queue[front+1];
        }
        return response;
    }
    public  int size()

    {
        return size;
    }
    public void display()
    {
        for (int i:queue) {
            System.out.print(i+" ");

        }
        System.out.println();

    }



}
