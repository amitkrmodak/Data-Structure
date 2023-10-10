class Queue
{
    int size;
    int currentIndex = 0;
    int[] QueueArray;
    Queue(int size)
    {
        this.size = size;
        QueueArray = new int[this.size];
        for (int i = 0;i<this.size;i++)
        {
            QueueArray[i] = -1;
        }
    }
    void push(int data)
    {
        if(currentIndex == size)
        {
            System.err.println("queue is full");
            return;
        }
        QueueArray[currentIndex] = data;
        currentIndex++;
    }
    void pop() {
        if (currentIndex == 0) {
            System.err.println("no element's to pop");
            return;
        }
        for (int i = 1;i<currentIndex;i++)
        {
            QueueArray[i-1] = QueueArray[i];
        }
        currentIndex--;
    }
    void top()
    {
        System.out.println("top element is " + QueueArray[0]);
    }
}

public class Queue_using_Array {
    public static void main(String[] args) {
        Queue queueObj = new Queue(3);
        queueObj.push(10);
        queueObj.push(20);
        queueObj.push(30);
//        queueObj.pop();

        queueObj.push(40);
        queueObj.top();
    }
}
