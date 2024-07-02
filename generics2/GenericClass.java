public class GenericClass <T> {
    T value;

     GenericClass(T value) {
        this.value = value;
    }

    public T getVal() {
        return value;
    }

    public static void main(String[] args) {
        GenericClass <Float> g1 = new GenericClass<Float>(45.45f);
        Float v = g1.getVal();
        System.out.println(v);

    }
}
