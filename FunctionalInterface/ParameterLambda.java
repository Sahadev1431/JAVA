@FunctionalInterface
interface Cab
{
    public void bookCab(String source,String destination);
}

public class ParameterLambda {
    public static void main(String[] args) {
        Cab c1 = (src, des)->System.out.println("ola has booked from "+src+" to "+des);
        c1.bookCab("thra", "ahm");
    }
}
