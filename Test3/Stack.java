public class Stack {
    private int maxSize; // maximum size of the stack
    private int[] stackArray;
    private int top; // index of the top element

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // stack is initially empty
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element: " + element);
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // return a default value indicating stack is empty
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
