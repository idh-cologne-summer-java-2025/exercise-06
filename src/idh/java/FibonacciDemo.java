package idh.java;

import java.util.ArrayList;
import java.util.List;

public class FibonacciDemo {

	static List<Integer> fiboList = new ArrayList<Integer>();
	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static long fibonacci(int n) {
		if(n<0)
			throw new IllegalArgumentException("Fibonacci nicht definiert fnZ");
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

	
	public static void main(String[] args) {
		int n = 92; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacci(i) + " ");
		}
	}

}
