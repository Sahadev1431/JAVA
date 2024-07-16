public class CustomQueue {
    public int [] data;
    private int end = 0;

    private static final int DEFAULT_SIZE = 10;

    CustomQueue() {
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean add(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[end++] = val;
        return true;
    }
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removal = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        return removal;
    }
    public int front() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return data[0];
    }

    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}
