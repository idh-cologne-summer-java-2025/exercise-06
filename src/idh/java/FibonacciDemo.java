package idh.java;

public class FibonacciDemo {

	public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, insult =0;

        for (int i = 2; i <= n; i++) {
            insult = a + b;
            a = b;
            b = insult;
        }

        return insult;
			}
	
	public static void main(String[] args) {
		int n = 47; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
		System.out.println("Die ersten " + n + " Fibonacci-Zahlen: ");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}


