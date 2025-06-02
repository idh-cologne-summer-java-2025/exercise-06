package idh.java;

public class FibonacciDemo {

	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		if (n == 0) { //Basisfall 
			return 0;
		} else if (n == 1) { //Basisfall
			return 1;
		//Beide Basisfälle sind Abbruchbedingungen	
		}
			//
		return fibonacci(n-1) + fibonacci(n-2); //Fibonacci-Berechnung
		}
	


	
	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		for (int i = 0; i < n; i++) { //zählt von 0 bis 9 (also 10-mal)
			System.out.print(fibonacci(i) + " ");
		}
	}

}
