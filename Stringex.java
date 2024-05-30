public class Stringex {
    public static void main(String[] args) {
        // String a = "Sahadev";
        // String b = "Sahadev";
        // System.out.println(a==b);
        // System.out.println(a);
        // System.out.println(b);
        // a = "gautam";
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a.equals(b));


        // String a = new String("Sahadev");
        // String b = new String("gautam");
        // System.out.println(a==b);


        // String series = "";
        // for(int i = 0 ;i < 26;++i)
        // {
        //     char ch = (char)('a'+i);

        //     series = series + ch;
        // }
        // System.out.println(series);   // this is not a good solution

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i< 26 ;++i)
        {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        // System.out.println(builder.toString());
    }
}
