interface temp {
    void show();
}

public class LambdaDemo {
    public static void main(String[] args) {
        temp reference = () -> System.out.println("showing");
        reference.show();
    }
}
