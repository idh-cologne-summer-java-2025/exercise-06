package idh.java;

public class FibonacciDemo {

    // Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
//    bad idea #2
    public static int fibonacci2(int n, int ceil) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else if(n==ceil) {
        	return fibonacci(ceil);
        }
        else {
            int res = fibonacci(n - 1) + fibonacci(n - 2);
            System.out.println(res);
            fibonacci2(n++, ceil);
            return res;
        }
    }
    
    public static int fibonacci3(int n) {
    	 if (n == 0) {
             return 0;
         } else if (n == 1) {
             return 1;
         } else {
             return fibonacci(n - 1) + fibonacci(n - 2);
         }
     }	
    
    

    public static void main(String[] args) {
        int n = 10; // Anzahl der Fibonacci-Zahlen, die berechnet werden sollen
        System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
//    	System.out.println(fibonacci2(0,100));
    
    }
}
