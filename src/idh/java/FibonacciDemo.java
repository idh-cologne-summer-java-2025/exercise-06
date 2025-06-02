package idh.java;

public class FibonacciDemo {
	
	static int fFormer;
	static int fNew;
	static int f;
	
	
	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		//TODO Implement!
		fFormer = 0;
		fNew = 1;
		f = fFormer + fNew;
		if (n>0) {
			fibonacciReload(n);
			}
		
		//System.out.println(f);
		return fFormer;
		
	}
	
	public static void fibonacciReload(int n){
		if (n>0) {
			fibonacciReload(n-1);
			}
		f = fFormer + fNew;
		fFormer = fNew;
		fNew = f;
				
	}


	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		//fibonacci(6);
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
