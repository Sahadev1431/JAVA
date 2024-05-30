import java.util.ArrayList;

public class WildCardChar {
    public static void printList(ArrayList <?>lst)
    {
        for (Object obj : lst)
        {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        ArrayList <Integer> lst1 = new ArrayList<>();
        lst1.add(100);
        lst1.add(200);
        lst1.add(300);
        printList(lst1);
    }
}
