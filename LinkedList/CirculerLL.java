public class CirculerLL {

    public Node head;
    public Node tail;

    public CirculerLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display() {
        Node temp = head;
        try {
            if (head != null ){
                do {
                        System.out.print(temp.val + " -> ");
                        temp = temp.next;
                    
                } while (temp != head) ;
            }
        } catch (Exception e) {

        } finally {
            if (head == null) {
                System.out.println("null");
            } else {
                System.out.println("Head");
            }
        }
        
    }
    public void delete(int val) {
        Node temp = head;
        if (head != null) {
            if (temp.val == val) {
                head = temp.next;
                tail.next = head;
                return;
            }
            while (temp.next.val != val) {
                temp = temp.next;
                if (temp.next == tail && tail.val == val) {
                    temp.next = temp.next.next;
                    tail = temp;
                    return;
                }
            }
            temp.next = temp.next.next;
            return;
        }   //this one I have written myself and find best as it instantly changes the value of tail as well while another two we remove tail then it still shows tail == 60

        //ANOTHER WAY

        // Node temp = head;
        // if (head == null) {
        //     return;
        // }
        // if (temp.val == val) {
        //     head = temp.next;
        //     tail.next = head;
        // }

        // do {
        //     Node n = temp.next;
        //     if (n.val == val) {
        //         temp.next = n.next;
        //         break;
        //     }
        //     temp = temp.next;
        // } while (temp != head);

        //ANOTHER WAY
        // if (head == null) {
        //     return;
        // }
        // if (head.val == val) {
        //     head = head.next;
        //     tail.next = head;
        //     return;
        // }
        // Node tNode = head;
        // Node nextNode = head.next;

        // while (nextNode.val != val) {
        //     tNode = tNode.next;
        //     nextNode = nextNode.next;
        // }
        // tNode.next = nextNode.next;
    }

    public class Node {
        int val;
        Node next;

        public Node (int val) {
            this.val = val;
        }
    }
}
