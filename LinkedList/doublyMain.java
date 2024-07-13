public class doublyMain {
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.insertFirst(5);
        ll.insertFirst(15);
        ll.insertFirst(20);
        ll.insertFirst(22);
        ll.insertFirst(25);
        ll.insertFirst(35);

        ll.insertLast(45);
        ll.display();
        ll.insertIndex(100, 7);
        ll.display();
        ll.insertAfterNode(20, 21);
        ll.display();
    }
}
