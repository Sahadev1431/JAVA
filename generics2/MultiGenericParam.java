public class MultiGenericParam <T,V> {
    T inte;
    V floatt;
    String naem;
    double val;

    MultiGenericParam(T inte,V floatt,String naem,double val) {
        this.inte = inte;
        this.floatt = floatt;
        this.naem = naem;
        this.val = val;
    }

    void PrintVal() {
        System.out.println(inte);
        System.out.println(floatt);
        System.out.println(naem);
        System.out.println(val);
    }

    public static void main(String[] args) {
        MultiGenericParam <Integer,Float> m1 = new MultiGenericParam<>(101,20.5f,"Sahadev",45.45);
        m1.PrintVal();
    }
}
