package idh.java;

public class FibonacciDemo {

    private static long[] speicher;		// Speicher für berechnete Werte für effizienz

    public static long fibonacci(int n) {		//long damit kein überlauf bei n = 47 stattfindet, ab n = 92 gibt es dennoch überlauf
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci ist nur für n ≥ 0 definiert.");		// akkzeptiert nur n>=0, bei -n exception
        }

        speicher = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            speicher[i] = -1; // alle Werte im Array auf -1 gezetzt --> noch nicht berechnet
        }

        return fibonacciDemo(n);
    }

    private static long fibonacciDemo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (speicher[n] != -1) {
            return speicher[n]; // Schon berechnet, gibt Wert aus ohne noch mal zu rekursieren
        }

        speicher[n] = fibonacciDemo(n - 1) + fibonacciDemo(n - 2); // berechnet und speichert
        return speicher[n];
    }

    public static void main(String[] args) {
        int n = 92;
        System.out.println("Die ersten " + n + " Fibonacci-Zahlen (rekursiv):");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
