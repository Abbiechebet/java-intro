package Data_Structures;

public class Factorial {
    public static int factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(1)); 
        System.out.println(factorial(2)); 
        System.out.println(factorial(3)); 
        System.out.println(factorial(4)); 
        System.out.println(factorial(5));  // Outputs: 120
    }
}
