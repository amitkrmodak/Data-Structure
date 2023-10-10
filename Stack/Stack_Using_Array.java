class stack
{
    int size,currentPointer = 0;
    int[] stackArray;
    stack(int size)
    {
        this.size = size;
        stackArray = new int[size];
        for (int i = 0;i<size;i++)
        {
            stackArray[i] = -1;
        }
    }
    void push(int data)
    {
        if(currentPointer == size)
        {
            System.err.println("stack is full");
            return;
        }
        stackArray[currentPointer] = data;
        currentPointer +=1;
    }
    void pop()
    {
        stackArray[currentPointer-1] = -1;
        currentPointer -= 1;
    }
    void top()
    {
        System.out.println("top element is " + stackArray[currentPointer-1]);
    }
    void isEmpty()
    {
        if(currentPointer == 0)
        {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack is not empty");
    }
    void DeletetheEntireStack()
    {
        for (int i = 0;i<currentPointer;i++)
        {
            stackArray[i] = -1;
        }
    }
}

public class Stack_Using_Array {
    public static void main(String[] args) {
        stack stackObj = new stack(3);
        stackObj.push(10);
        stackObj.push(20);
        stackObj.push(30);
    }
}
