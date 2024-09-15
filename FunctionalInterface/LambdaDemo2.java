interface temp2 {
    void paramMethod(int a, int b);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        temp2 reference = (num1,num2) -> System.out.println( num1 + num2);
        reference.paramMethod(4, 54);
    }
}
