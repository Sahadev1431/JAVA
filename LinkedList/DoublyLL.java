public class DoublyLL {

    private Node head;
    // private Node tail;
    // private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        
    }

    public void display() {
        Node tempNode = head;
        Node last = null;
        while (tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            last = tempNode;
            tempNode = tempNode.next;
        }
        System.out.println("End");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("End");
    }



    private class Node {
        private int val;
        private Node next;
        private Node prev;
        
        public Node(int val) {
            this.val = val;
        }
        public Node(int val,Node next,Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
