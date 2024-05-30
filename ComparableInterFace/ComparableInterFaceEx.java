import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ComparableInterFaceEx implements Comparable <ComparableInterFaceEx> {
    int id;
    String name;
    public ComparableInterFaceEx(int id,String name)
    {
        this.id = id;
        this.name = name;
    }


    public static void main(String[] args) {
        LinkedList <ComparableInterFaceEx> test = new LinkedList<ComparableInterFaceEx>();
        ComparableInterFaceEx ob1 = new ComparableInterFaceEx(1010,"Sahadev");
        ComparableInterFaceEx ob2 = new ComparableInterFaceEx(5,"sdjh");
        ComparableInterFaceEx ob3 = new ComparableInterFaceEx(24,"dfki");
        ComparableInterFaceEx ob4 = new ComparableInterFaceEx(98,"ewre");
        ComparableInterFaceEx ob5 = new ComparableInterFaceEx(51,"vcx");
        test.add(ob1);
        test.add(ob2);
        test.add(ob3);
        test.add(ob4);
        test.add(ob5);

        for (ComparableInterFaceEx el : test)
        {
            System.out.print(el.id+" ");
        }
        Collections.sort(test);
        System.out.println();
        for (ComparableInterFaceEx el : test)
        {
            System.out.print(+el.id+" ");
        }
    }

    public int compareTo(ComparableInterFaceEx obj)
    {
        if(this.id == obj.id)
        {
            return 0;
        }
        else if (this.id > obj.id)
        {
            return 1;
        }
        else 
        {
            return -1;
        }
    }
}