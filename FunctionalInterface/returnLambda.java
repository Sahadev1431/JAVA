interface Cab
{
    public String bookCab(String source,String destination);
}
public class returnLambda {
    public static void main(String[] args) {
        Cab c1 = (src,des)->{
            return "uber has booked from "+src+" to "+des;
        };
        System.out.println(c1.bookCab("home", "office"));
    }
}
