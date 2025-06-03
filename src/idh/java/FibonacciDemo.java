package idh.java;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDemo {

    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n muss >= 0 sein");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
