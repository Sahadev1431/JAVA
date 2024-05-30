import java.util.*;
public class SinglyLL{
    public static void main(String[] args) {

        LL obj = new LL();
        Scanner imp = new Scanner(System.in);
        int choice = -1;
        int value = 0;
        int pos = 0;
        do
        {
            System.out.println("\n\n1.Create LinkedList\n2.insert first\n 3.insert last\n4.insert Position\n5.delete first\n6.delete last\n7.delete position\n8.Find value\n9.Display\n10.Display Size\n0.Exit");
            System.out.println("Enter choice :");
            choice = imp.nextInt();

            switch(choice)
            {
                case 1:
                obj.createLinklist();
                    break;
                case 2:
                    System.out.println("Enter value to add :");
                    value = imp.nextInt();
                    obj.insertFirst(choice);
                    break;
                case 3:
                    System.out.println("Enter value to add :");
                    value = imp.nextInt();
                    obj.insertLast(value);
                    break;
                case 4:
                    System.out.println("Enter value to add :");
                    value = imp.nextInt();
                    System.out.println("Enter position to add:");
                    pos = imp.nextInt();
                    obj.insertPosition(value, pos);
                    break;
                case 5:
                    obj.deleteFirst();
                    break;
                case 6:
                    obj.deleteLrst();
                    break;
                case 7:
                    System.out.println("Enter position to delete:");
                    pos = imp.nextInt();
                    obj.deletePos(pos);
                    break;
                case 8:
                    System.out.println("Enter position to find:");
                    pos = imp.nextInt();
                    System.out.println(obj.findValue(pos));
                    break;
                case 9:
                    obj.display();
                    break;
                case 10:
                    obj.displaySize();
                    break;
                case 0:
                    break;
            }
        } while ( choice != 0);


        // LL node = new LL();

        // node.insertLast(10);
        // node.insertLast(20);
        // node.insertLast(30);
        // node.insertLast(40);
        // node.insertLast(50);
        // node.insertLast(60);
        // node.insertLast(70);
        // node.insertPosition(45, 5);

        // node.display();

        // System.out.println(node.findValue(8));
        // System.out.println(node.deletePos(4));
        // node.deletePos(1);


        // node.deleteLrst();
        // node.deleteLrst();
        // node.deleteLrst();
        // node.deleteLrst();
        // node.deleteLrst();
        // node.deleteLrst();
        // node.deleteLrst();
        // node.deleteLrst();

        // node.deleteFirst();
        // node.deleteFirst();


        
        // node.insertFirst(10);
        // node.insertFirst(20);
        // node.insertFirst(30);
        // node.insertFirst(40);
        // node.insertLast(10);
        // node.display();
        // node.displaySize();
    }
}

class LL extends Node
{
    Scanner imp = new Scanner(System.in);
    private Node head;
    private Node tail;
    private int size;

    LL()
    {
        size = 0;
    }

    public void createLinklist()
    {
        
        if(head == null)
        {
            int value;
            System.out.println("Enter value");
            value = imp.nextInt();
            insertFirst(value);
        }
        else
        {
            System.out.println("no need to create alerady created");
        }
    }

    public void insertFirst(int value)
    {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value)
    {
        if(tail == null)
        {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertPosition(int value,int pos)
    {
        if(pos == 1)
        {
            insertFirst(value);
            return;
        }
        else if(pos == size+1)
        {
            insertLast(value);
            return;
        }

        int temp = 0;
        Node tempNode = head;
        while(temp != pos -2)
        {
            tempNode = tempNode.next;
            temp++;
        }

        // Node node = new Node(value);
        // node.next = tempNode.next;
        // tempNode.next = node;
        
        Node node = new Node(value,tempNode.next);
        tempNode.next = node;
        size++;
    }

    public int deleteFirst()
    {
        int val = head.value;

        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLrst()
    {
        int val = tail.value;

        if(head.next == null)
        {
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next != tail)
        {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
        return val;
    }

    public int deletePos(int pos)
    {

        if(pos == 1)
        {
            return deleteFirst();
        }
        if(pos == size)
        {
            return deleteLrst();
        }
        Node temp = head;
        // Node temp2 = head.next;

        int itr = 1;
        while (itr !=pos -1)
        {
            temp = temp.next;
            // temp2 = temp2.next;
            itr++;
        }
        // int val = temp2.value;
        // temp.next = temp2.next;
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public int findValue(int pos)
    {
        if(pos == 1)
        {
            return head.value;
        }
        if(pos == size)
        {
            return tail.value;
        }

        int itr = 0;
        Node temp = head;
        while(itr !=pos - 1)
        {
            temp = temp.next;
            itr++;
        }
        return temp.value;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void displaySize()
    {
        System.out.println(size);
    }
}


class Node
{
    protected int value;
    protected Node next;

    public Node(){};

    public Node(int value)
    {
        this.value = value;
    }

    public Node(int value,Node next)
    {
        this.value = value;
        this.next = next;
    }
}