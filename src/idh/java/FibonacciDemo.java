package idh.java;

import java.util.ArrayList;
import java.util.List;

public class FibonacciDemo {

	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

        // Rekursive Methode mit Listen-Speicher
	    public static long fibonacciMem(int n, List<Long> mem) {
	        if (n == 0) return 0;
	        if (n == 1) return 1;
	        // Prüfe, ob die Fibonacci-Zahl schon berechnet wurde
	        if (mem.size() > n && mem.get(n) != null) {
	            return mem.get(n);
	        }        
	        long res = fibonacciMem(n - 1, mem) + fibonacciMem(n - 2, mem);
	        // Füge neue Fibonacci-Zahl der Liste zu
	        if (mem.size() <= n) {
	            mem.add(res);
	        } else {
	            mem.set(n, res);
	        }
	        return res;
	    }	

        // Iterative Methode	    
	    public static long fibonacciIter(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        long a = 0, b = 1, f = 0;
	        for (int i = 2; i <= n; i++) {
	            f = a + b;
	            a = b;
	            b = f;
	        }
	        return f;
	    }
	    
	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();

//		Rekursive Methode mit Listen-Speicher
        List<Long> mem = new ArrayList<>();
        mem.add((long) 0); // Fibonacci(0)
        mem.add((long) 1); // Fibonacci(1)
        n = 1000; // Es wird ab Index 0 gezählt - also ist die n. Zahl die (n+1). Fibonacci Zahl
        System.out.println("FibonacciMem(" + n + ") = " + fibonacciMem(n-1, mem));
        
//		Iterative Methode
	    System.out.println("FibonacciIter(" + n + ") = " + fibonacciIter(n-1));
	}

}
