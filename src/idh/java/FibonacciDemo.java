package idh.java;

public class FibonacciDemo {

	static int f = 0;
	static int iFormer = 0;
	static int iNew = 1;
	
	// Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
	public static int fibonacci(int n) {
		//TODO Implement!
		if (n>0) {
			fibonacci(n-1);
			}
		f = iFormer + iNew;
		System.out.println(f);
		iFormer = iNew;
		iNew = f;
		return f;
		
	}


	public static void main(String[] args) {
		int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
		fibonacci(n);
		//for (int i = 0; i < n; i++) {
		//	System.out.print(fibonacci(i) + " ");
		//}
	}

}
