package idh.java;

public class FibonacciDemo {

    // Recursive method to calculate the n-th Fibonacci number
    public static int fibonacci(int n) 
    {
        if (n == 0) // Base case: the 0th Fibonacci number is 0
        {
            return 0;
        }
        else if (n == 1) // Base case: the 1st Fibonacci number is 1
        { 
            return 1;
        }
        /* Recursive case: F(n) = F(n-1) + F(n-2) so basically: the sum = last number + the number before this last number.
        * F(10) = F(9) + F(8)
        *          = (F(8) + F(7)) + (F(7) + F(6))
        *          = ...
        *    until we eventually reach F(1) and F(0), which are the base cases.
        *
        * For example, computing F(5) involves:
        *    F(5) = F(4) + F(3)
        *         = (F(3) + F(2)) + (F(2) + F(1))
        *         = ((F(2) + F(1)) + (F(1) + F(0))) + ((F(1) + F(0)) + F(1))
        *         = ...
        *    and so on until only F(1) and F(0) remain.*/
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    
    
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        System.out.println("The first " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            // Prints each Fibonacci number separated by a space
            System.out.print(fibonacci(i) + " ");
        }
    }
}