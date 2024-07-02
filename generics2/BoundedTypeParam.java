public class BoundedTypeParam {
    public <T extends Number> int sum(T val1,T val2) {
        if (val1.getClass().getName().contains("Integer")) {
            return val1.intValue() + val2.intValue();
        }
        return 0;
    }

    public static void main(String[] args) {
        BoundedTypeParam b1 = new BoundedTypeParam();
        int val = b1.sum(101, 101);
        System.out.println(val);
    }
}
