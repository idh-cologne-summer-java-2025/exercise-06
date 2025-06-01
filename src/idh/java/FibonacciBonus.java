package idh.java;

import java.util.HashMap;
import java.util.Map;

//Bonus exercise: Fibonacci for greater n: trying with hashMap (Memoisierung)

public class FibonacciBonus {

    public static Map<Integer, Integer> memo = new HashMap<>(); //HashMap to store intergers

   	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		//TODO Implement!
		if (n <= 0) {
            return 0;
        } else if (n==1) {
            return 1;
		} else if (memo.containsKey(n)) { //check already stored keys
			return memo.get(n);
		} else {
            int fibo = fibonacci(n - 1) + fibonacci(n - 2);
            memo.put(n, fibo); //store in HashMap
			return fibo;
		}
	}
// Anmerkung: Works until numbers get negative after certain high number due to int overflow
  public static void main(String[] args) {
		int n = 10000; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
