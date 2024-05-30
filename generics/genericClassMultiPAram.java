public class genericClassMultiPAram {
    public static void main(String[] args) {
        mulipleParams <Integer,Float> m1 = new mulipleParams<>(100, 26.5f, "sahdev");
        m1.getter();
    }
}

class mulipleParams <T,V>
{
    private T v1;
    private V v2;
    private String v3;

    public mulipleParams(T v1,V v2,String v3)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public void getter ()
    {
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
