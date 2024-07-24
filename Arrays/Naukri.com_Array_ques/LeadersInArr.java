import java.util.ArrayList;
import java.util.List;

public class LeadersInArr {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[a.length-1]);
        int max = a[a.length-1];

        for (int i = a.length-2; i >=0 ; i--) {
            if (a[i] > max) {
                max = a[i];
                list.add(max);
            }
        }
        return list;
    }
}
