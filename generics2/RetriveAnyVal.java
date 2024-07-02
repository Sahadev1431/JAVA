public class RetriveAnyVal {
    public static void main(String[] args) {
        StoreAnyVal s1 = new StoreAnyVal();
        s1.setVal(105.34);
        double nVal = (double)s1.getVal();
        System.out.println(nVal);
    }
}