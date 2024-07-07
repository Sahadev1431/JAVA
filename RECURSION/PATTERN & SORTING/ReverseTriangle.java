public class ReverseTriangle {

    public static void main(String[] args) {
        trianglePattern(4, 0);
    }

    static void trianglePattern(int r, int c) {
        if (r == 0) return;

        if (c < r) {
            System.out.print("*");
            trianglePattern(r, c+1);
        } else {
            System.out.println();
            trianglePattern(r - 1, 0);
        }
    }
}