import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add("x");
        al.add("b");
        al.add("g");
        al.add("r");
        al.add("a");
        al.add("s");
        
        System.out.println(al);

        ArrayList al3 = new ArrayList<>();
        al3.add("1st");
        al3.add("2nd");
        al3.addAll(al);
        System.out.println(al3);

        al3.removeAll(al);
        System.out.println(al3);

        System.out.println("without sorting :"+al);
        Collections.sort(al);
        System.out.println(al);

       Collections.sort(al,Collections.reverseOrder());
       System.out.println(al);

        // CONVERTING ARRAY INTO ARRAY LIST
       String[] arr = {"dog","cat","cow","tiger","lion"};
       ArrayList al4 = new ArrayList<>(Arrays.asList(arr));
       System.out.println(al4);

       Collections.shuffle(al4);  //random order
       System.out.println(al4);

       System.out.println(al4.indexOf("lion"));
    }
}
