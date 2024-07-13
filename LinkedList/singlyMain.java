public class singlyMain {
    public static void main(String[] args) {
        SingleLL ll = new SingleLL();
        ll.insertFirst(7);
        ll.insertFirst(3);
        ll.insertFirst(13);
        ll.insertFirst(23);
        ll.insertFirst(33);
        ll.insertFirst(8);
        ll.insertFirst(45);

        ll.insertLast(77);
        ll.insertIndex(44, 3);
        ll.display();

        System.out.println(ll.deleteFirst());

        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();

        System.out.println(ll.deleteIndex(3));
        ll.display();

        System.out.println(ll.find(5));
        System.out.println(ll.size);
    }
}
