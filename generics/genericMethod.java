public class genericMethod {
    public <T> T getValue(T val)
    {
        return val;
    }
    public static void main(String[] args) {
        genericMethod g1 = new genericMethod();
        System.out.println("Int "+g1.getValue(100));
        System.out.println("String "+g1.getValue("Sahadev"));
    }
}
