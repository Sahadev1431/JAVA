public class BoundedParamsEx {
    public static <T extends Number> void add(T num1,T num2)
    {
        // if (num1.getClass().getName().contains("Integer"))
        // {
        //     int sum = num1.intValue()+num2.intValue();
        //     System.out.println(sum);
        // }
        // else
        //     System.out.println("not integer");
        int sum = num1.intValue() + num2.intValue();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        BoundedParamsEx.add(101, 102);
    }
}
