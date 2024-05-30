public class genericInterfaceEx <V> implements InnergenericInterfaceEx <V> {
    public V getImfo(V val)
    {
        return val;
    }
    public static void main(String[] args) {
        genericInterfaceEx <Double> gg1 = new genericInterfaceEx<>();
        System.out.println("Double "+ gg1.getImfo(145.25));
        genericInterfaceEx <Integer> gg2 = new genericInterfaceEx<>();
        System.out.println("Integer "+gg2.getImfo(100));
    }
}

interface InnergenericInterfaceEx <T>{
    public T getImfo(T val);
}