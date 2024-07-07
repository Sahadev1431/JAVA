public class NormalTriangle {
    public static void main(String[] args) {
        normalTriangle(4, 0);
    }

    static void normalTriangle(int r, int c) {
        if (r == 0) return;

        if (c < r) {
            normalTriangle(r, c+1);
            System.out.print("*");
        } else {
            normalTriangle(r-1, 0);
            System.out.println();
        }
    }
}
