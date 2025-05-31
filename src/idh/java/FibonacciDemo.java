package idh.java;

public class FibonacciDemo {
	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		} else if(n==1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int fibonacciMem(int n, int[]memo) {
     // Rekursive Methode zur Berechnerung der n-ten Fibonacci-Zahl mithilfe Memoisierung
		if(n==0) {
			return 0;
		} else if(n==1) {
			return 1;
		}
		if(memo[n]!=-1) {
			return memo[n];
		} else {
			memo[n] =(fibonacciMem(n-1, memo) + fibonacciMem(n-2, memo));
			return memo[n];
			
		}
		

		
		
		
	}

	
	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		int[]memo = new int[n+1]; //Für die Memoisierung
		
		for (int i = 0; i < n; i++) {
			memo[i] =-1;
		}
	
		System.out.println("Die ersten "+n+" Fibonacci-Zahlen: ");
		for (int i = 0; i < n; i++) {
		    
		    System.out.print(fibonacciMem(i, memo)+" ");
		}

		
	}

}
