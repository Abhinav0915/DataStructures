package stacks;

public class Stacks {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stacks(int size){
        maxSize  = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize -1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 indicating stack underflow
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks(5); // Create a stack with maximum size of 5

        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println(STR."Top element: \{stack.peek()}");

        // Pop elements from the stack
        System.out.println(STR."Popped element: \{stack.pop()}");
        System.out.println(STR."Popped element: \{stack.pop()}");
        System.out.println(STR."Popped element: \{stack.pop()}");
        System.out.println(STR."Popped element: \{stack.pop()}"); // Trying to pop from an empty stack
    }



}
