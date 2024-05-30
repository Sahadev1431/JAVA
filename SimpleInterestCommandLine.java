public class SimpleInterestCommandLine {
    public static void main(String[] args) {
         // Check if all required arguments are provided
         if (args.length < 3) {
            System.out.println("Usage: java SimpleInterestCalculator principal rate time");
            return;
        }

        try {
            // Parse command-line arguments to double using wrapper classes
            double principal = Double.parseDouble(args[0]);
            double rate = Double.parseDouble(args[1]);
            double time = Double.parseDouble(args[2]);

            // Calculate simple interest
            double simpleInterest = (principal * rate * time) / 100;

            // Print the calculated simple interest
            System.out.println("Simple Interest: " + simpleInterest);
        } catch (NumberFormatException e) {
            // Handle if any of the command-line arguments is not a valid number
            System.out.println("Error: All arguments must be valid numbers.");
        }
    }
}
