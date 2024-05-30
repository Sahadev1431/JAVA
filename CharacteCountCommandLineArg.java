public class CharacteCountCommandLineArg {
    public static void main(String[] args) {
        int counter = 0;
        for (String arg : args)
        {
            counter += arg.length();
        }
        System.out.println(counter);
    }
}
