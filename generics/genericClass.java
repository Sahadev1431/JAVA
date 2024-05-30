public class genericClass {
    public static void main(String[] args) {
        storeANyValue <Float> s1 = new storeANyValue(100.05f);
        Float x = s1.getter();
        System.out.println(x);

        storeANyValue <Integer> s2 = new storeANyValue(15);
        Integer y = s2.getter();
        System.out.println(y);
    }
}

class storeANyValue <T>
{
    private T value;

    public storeANyValue(T value)
    {
        this.value = value;
    }
    public T getter ()
    {
        return value;
    }
}
