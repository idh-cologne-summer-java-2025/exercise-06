package idh.java;

public class FibonacciDemo {

	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		//TODO Implement!
		if (n==0) {
		return 0; //Abbruchfall 1
		} else if (n==1) {
			return 1; // Abbruchfall 2
			
		} else {
			return fibonacci(n-1) + fibonacci (n-2); // Rekursiver Aufruf
		}
	}

	
	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
