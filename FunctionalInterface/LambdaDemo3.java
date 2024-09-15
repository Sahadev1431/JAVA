interface temp3 {
    int returnMethod (int a, int b);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        temp3 reference = (num1,num2) -> {
            return num1 * num2;
        };

        // or

        // temp3 reference = (num1,num2) -> num1 * num2;
        
        int ans = reference.returnMethod(7, 4);
        System.out.println(ans);
    }
}
