public class SingleLL {

    private Node head;
    private Node tail;

    int size;
    
    SingleLL() {
        size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }
            tail.next = node;
            tail = node;

            size++;
    }

    public void insertIndex(int value,int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        int curInd = 0;
        while (curInd  != index - 1) {
            temp = temp.next;
            curInd++;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int delVal = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return delVal;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size < 1) {
            return deleteFirst();
        } 
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public int find(int index) {
        Node indexNode = get(index);
        return indexNode.value;
    }    

    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
