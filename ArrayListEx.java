import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        System.out.print("How many number of array do you want to create:");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        ArrayList <Integer> list = new ArrayList<>();

        for(int i = 0 ;i < n;++i)
        {
            System.out.println("Enter number " + ( i +1 )+ " :");
            list.add(in.nextInt());
        }
        // System.out.println(list);
        for(int i = 0; i < n ;++i)
        {
            System.out.println(list.get(i));
        }
        in.close();
    }
}
