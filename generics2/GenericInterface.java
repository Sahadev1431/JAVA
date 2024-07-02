public interface GenericInterface <T> {
    T getInfo(T val);
} 

class temp implements GenericInterface <Double> {
    public Double getInfo(Double val) {
        return val;
    }

    public static void main(String[] args) {
        temp t1 = new temp();
        Double val = t1.getInfo(101.7);
        System.out.println(val);
    }
}

class temp2 <T> implements GenericInterface<T> {
    public T getInfo(T val) {
        return val;
    }

    public static void main(String[] args) {
        temp2<Integer> t2 = new temp2<>();
        int val2 = t2.getInfo(106);
        System.out.println(val2);
    }
}
 