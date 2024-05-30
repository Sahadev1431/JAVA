public class stringArray {
    public static void main(String[] args) {
        String st = "Sahadev Nai";
        // System.out.println(searchString(st, 'z'));
        System.out.println("Element present at index "+searchStringIndex(st, 'N'));

    }
    static boolean searchString(String st,char target)
    {
        if(st.length() == 0)
        {
            System.out.println("String is empty\n");
            return false;
        }
        for(int i = 0; i <st.length();++i)
        {
            if(target == st.charAt(i))
            return true;
        }
        return false;
    }

    static int searchStringIndex(String st,char target)
    {
        if(st.length() == 0)
        {
            System.out.println("String is empty\n");
            return -1;
        }
        for(int i = 0; i <st.length();++i)
        {
            if(target == st.charAt(i))
            return i;
        }
        return -1;
    }
}
