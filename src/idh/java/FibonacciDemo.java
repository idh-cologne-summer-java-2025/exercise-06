package idh.java;

public class FibonacciDemo {

	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0; 
		} else if(n == 1) {
			return 1; 
		} else if(n > 1) {
			return fibonacci(n - 1) + fibonacci(n - 2); 
		}
		return -1; 
	}

	public static int fibonacciIterative(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;

		int vorletzter = 0,letzter = 1, nächster = 0;
		for (int i = 2; i <= n; i++) {
			nächster = letzter + vorletzter;
			vorletzter = letzter;
			letzter = nächster;
		}
		return nächster;
	}

	public static int fibonacciMemoization(int n) {
		if (n == 0)	return 0;
		if (n==1)	return 1;

		int[] memo = new int[n + 1];
		memo[0] = 0;
		memo[1] = 1;

		for(int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo[n];
	}

	
	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
			System.out.print(fibonacciIterative(i) + " ");
			System.out.print(fibonacciMemoization(i) + " ");

		}
	}

}
