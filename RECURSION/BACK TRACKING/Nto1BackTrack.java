public class Nto1BackTrack {
    public static void main(String[] args) {
        nto1(0, 3);
    }
    static void nto1(int i,int n) {
        if (i > n) {
            return;
        }
        nto1(i+1, n);
        System.out.println(i);
    }
}