public class CustomStack {

    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    private int top = -1;

    CustomStack() {
        this(DEFAULT_SIZE);
    }
    CustomStack(int size) {
        data = new int [size];
    }

    public boolean add (int val) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        top++;
        data[top] = val;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top--];
    }

    public boolean isFull() {
        return top == data.length - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty"); 
            return -1;}
        return data[top];
    }


}