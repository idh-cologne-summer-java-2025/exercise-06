package idh.java;

public class FibonacciDemo {

	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		//TODO Implement!
		return -1; 
	}

	
	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
