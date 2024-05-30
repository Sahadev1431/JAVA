public class genericConstructor {
    public <T> genericConstructor (T val)
    {
        System.out.println("Value is "+val);
    }

    public static void main(String[] args) {
        genericConstructor g1 = new genericConstructor(100);
        genericConstructor g2 = new genericConstructor("Sahadev");
    }
}
