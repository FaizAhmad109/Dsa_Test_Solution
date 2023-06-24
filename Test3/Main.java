public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        System.out.println("Popped element: " + stack.pop()); // 3
        System.out.println("Popped element: " + stack.pop()); // 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        stack.push(4);
        stack.push(5);

        System.out.println("Is stack full? " + stack.isFull()); // true

        System.out.println("Popped element: " + stack.pop()); // 5
        System.out.println("Popped element: " + stack.pop()); // 4

        System.out.println("Is stack empty? " + stack.isEmpty()); // true

        System.out.println("Popped element: " + stack.pop()); // Stack is empty. Cannot pop element. (-1)
    }
}
