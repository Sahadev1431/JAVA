public class DoublyLL {

    private Node head;
    // private Node tail;
    // private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            node.next = null;
            node.prev = null;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        node.prev = null;

        // ANOTHER WAY
        // node.next = head;
        // node.prev = null;
        // if (head != null) {
        //     head.prev = node;
        // }
        // head = node;
        
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }
    
    public void insertIndex(int val,int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        int i = 0;
        while (i != index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null) {
            insertLast(val);
            return;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
    }

    public void insertAfterNode(int after,int val) {
        Node node = new Node(val);
        Node prevNode = find(after);
        if (prevNode == null) {
            System.out.println("does not exist");
            return;
        }

        node.next = prevNode.next;
        node.prev = prevNode;
        prevNode.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
    public Node find(int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == val) {
                return temp;
            }    
            temp = temp.next;        
        }
        return null;
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
        System.out.println("Print in reverse");
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
