public class public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        System.out.println("Dequeued element: " + queue.dequeue()); // 1
        System.out.println("Dequeued element: " + queue.dequeue()); // 2

        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Dequeued element: " + queue.dequeue()); // 3
        System.out.println("Dequeued element: " + queue.dequeue()); // 4

        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        System.out.println("Dequeued element: " + queue.dequeue()); // 5

        System.out.println("Is queue empty? " + queue.isEmpty()); // true

        System.out.println("Dequeued element: " + queue.dequeue()); // Queue is empty. Cannot dequeue element. (-1)
    }
}
 {
    private Node front; // reference to the front of the queue
    private Node rear; // reference to the rear of the queue

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; // return a default value indicating queue is empty
        }

        int dequeuedElement = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return dequeuedElement;
    }

    public boolean isEmpty() {
        return (front == null);
    }
}
