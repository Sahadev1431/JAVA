public class generics1 {
    public static void main(String[] args) {
        storeint st = new storeint(15);
        Integer s1 = (Integer)st.getter();
        System.out.println(s1);
    }
}

class storeint {
    private Object value;

    public storeint (Object value)
    {
        this.value = value;
    }
    public Object getter()
    {
        return value;
    }
}