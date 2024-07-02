public class FibonacciAndPrime {
    
    public static void main(String[] args) {
        System.out.println("First 15 Fibonacci Numbers:");
        generateFibonacci(15);
        
        System.out.println("\nFirst 15 Prime Numbers:");
        generatePrimes(15);
    }
    
    // Method to generate the first n Fibonacci numbers
    public static void generateFibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }
    }
    
    // Method to generate the first n prime numbers
    public static void generatePrimes(int n) {
        int count = 0;
        int number = 2;
        
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    
    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
